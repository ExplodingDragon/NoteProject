rootProject.name = "NoteProject"
include("webServer")

pluginManagement {
    val kotlinVersion: String by settings
    val springVersion: String by settings
    val springDependencyManagement: String by settings
    plugins {
        id("org.springframework.boot") version springVersion
        id("io.spring.dependency-management") version springDependencyManagement
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion
        kotlin("kapt") version kotlinVersion
    }
}
