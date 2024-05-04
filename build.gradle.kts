plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.srr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.23")
    testImplementation("com.codeborne:selenide:7.2.1")
    testImplementation ("org.seleniumhq.selenium:selenium-java:4.18.1")
    testImplementation ("org.seleniumhq.selenium:selenium-chrome-driver:4.18.1")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.8.0")
    testImplementation ("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}