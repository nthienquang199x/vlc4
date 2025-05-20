plugins {
    kotlin("jvm") version "2.0.21"
}

group = "co.vtcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.java.dev.jna:jna-jpms:5.16.0")
    implementation("net.java.dev.jna:jna-platform-jpms:5.16.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}