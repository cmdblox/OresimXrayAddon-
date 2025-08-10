plugins {
    kotlin("jvm") version "1.9.23"
    id("fabric-loom") version "1.5.3" // may need to update to match latest Loom
}

version = "1.0.0"
group = "com.ori.oresimxrayaddon"

repositories {
    mavenCentral()
    maven("https://maven.meteordev.org/releases")
    maven("https://maven.fabricmc.net/")
}

dependencies {
    // Minecraft + mappings + loader (versions may need tweaking depending on Loom/mapping availability)
    minecraft("com.mojang:minecraft:1.21.8")
    mappings("net.fabricmc:yarn:1.21.8+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.10")
    // Meteor Client artifact for MC 1.21.8 - replace with the correct published version if different
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
