plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.srr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation(kotlin("test-junit", "1.9.23"))
    testImplementation("com.codeborne:selenide:7.2.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}