plugins {
  `java-library`
  id("kotlin-spring")
}

dependencies {
  implementation(project(":keel-core"))
  implementation(project(":keel-actuator"))
  implementation("org.springframework:spring-context")

  testImplementation("dev.minutest:minutest")
  testImplementation("io.strikt:strikt-core")
}
