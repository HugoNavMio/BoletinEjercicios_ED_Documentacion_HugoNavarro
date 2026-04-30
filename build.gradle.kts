plugins {
    id("java")
}

group = "com.hugonavarro.ejerciciosdocumentacion"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("net.datafaker:datafaker:2.5.4")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

tasks.test {
    useJUnitPlatform()
}