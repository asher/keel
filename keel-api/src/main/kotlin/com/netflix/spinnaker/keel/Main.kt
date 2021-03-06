/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.spinnaker.keel

import com.netflix.spinnaker.keel.info.InstanceIdSupplier
import com.netflix.spinnaker.keel.persistence.ArtifactRepository
import com.netflix.spinnaker.keel.persistence.ResourceRepository
import com.netflix.spinnaker.keel.persistence.ResourceVersionTracker
import com.netflix.spinnaker.keel.plugin.KeelPlugin
import com.netflix.spinnaker.kork.PlatformComponents
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.Import
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling
import javax.annotation.PostConstruct

private val DEFAULT_PROPS = mapOf(
  "netflix.environment" to "test",
  "netflix.account" to "\${netflix.environment}",
  "netflix.stack" to "test",
  "spring.config.location" to "\${user.home}/.spinnaker/",
  "spring.application.name" to "keel",
  "spring.config.name" to "spinnaker,\${spring.application.name}",
  "spring.profiles.active" to "\${netflix.environment},local",
  // TODO: not sure why we need this when it should get loaded from application.properties
  "spring.main.allow-bean-definition-overriding" to "true",
  "spring.groovy.template.check-template-location" to "false"
)

@SpringBootApplication(
  scanBasePackages = [
    "com.netflix.spinnaker.config",
    "com.netflix.spinnaker.keel"
  ]
)
@Import(PlatformComponents::class)
@EnableAsync
@EnableScheduling
class KeelApplication {

  private val log by lazy { LoggerFactory.getLogger(javaClass) }

  @Autowired
  lateinit var artifactRepository: ArtifactRepository

  @Autowired
  lateinit var resourceRepository: ResourceRepository

  @Autowired
  lateinit var resourceVersionTracker: ResourceVersionTracker

  @Autowired
  lateinit var instanceIdSupplier: InstanceIdSupplier

  @Autowired(required = false)
  var plugins: List<KeelPlugin> = emptyList()

  @PostConstruct
  fun initialStatus() {
    sequenceOf(
      ArtifactRepository::class to artifactRepository.javaClass,
      ResourceRepository::class to resourceRepository.javaClass,
      ResourceVersionTracker::class to resourceVersionTracker.javaClass,
      InstanceIdSupplier::class to instanceIdSupplier.javaClass
    )
      .forEach { (type, implementation) ->
        log.info("{} implementation: {}", type.simpleName, implementation.simpleName)
      }

    log.info("Using plugins: {}", plugins.joinToString { it.name })
  }
}

fun main(vararg args: String) {
  SpringApplicationBuilder()
    .properties(DEFAULT_PROPS)
    .sources<KeelApplication>()
    .run(*args)
}

inline fun <reified T> SpringApplicationBuilder.sources(): SpringApplicationBuilder =
  sources(T::class.java)
