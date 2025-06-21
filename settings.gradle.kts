pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.leavesmc.org/snapshots/")
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.9.0")
}

rootProject.name = "Lumina"

include("lumina-api", "lumina-server")