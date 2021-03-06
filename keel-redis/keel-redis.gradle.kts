/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
  `java-library`
  id("kotlin-spring")
}

dependencies {
  implementation(project(":keel-core"))
  implementation("com.netflix.spinnaker.kork:kork-jedis")
  implementation("com.netflix.spinnaker.kork:kork-dynomite") {
    exclude(module= "junit")
  }

  testImplementation("io.strikt:strikt-core")
  testImplementation(project(":keel-spring-test-support"))
  testImplementation(project(":keel-core-test"))
  testImplementation(project(":keel-api"))
  testImplementation("com.netflix.spinnaker.kork:kork-jedis-test")
  testImplementation("org.springframework.boot:spring-boot-starter-web")
}
