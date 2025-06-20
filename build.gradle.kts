plugins {
    id("java")
    id("org.sonarqube") version "6.1.0.5360"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.sonar {
    useLoggerLevel(LogLevel.DEBUG)
}
