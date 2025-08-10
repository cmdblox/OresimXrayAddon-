plugins {
    kotlin("jvm") version "1.9.23"
    id("fabric-loom") version "1.5.3"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.ori.oresimxrayaddon"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    maven("https://maven.meteordev.org/releases")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.8")
    mappings("net.fabricmc:yarn:1.21.8+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.10")
    modImplementation("meteordevelopment:meteor-client:0.5.8-MC1.21.8")
    implementation(kotlin("stdlib"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

tasks.register("printInfo") {
    doLast {
        println("Project: OresimXrayAddon - prepare to build for Minecraft 1.21.8")
    }
}

tasks.shadowJar {
    archiveBaseName.set("OresimXrayAddon")
    archiveClassifier.set("")
    archiveVersion.set(version.toString())
    mergeServiceFiles()
}
