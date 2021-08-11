group = "com.github.ExplodingDragon"

buildscript {
    val kotlinVersion: String by project
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
    for (childProject in childProjects.values) {
        delete(childProject.buildDir)
    }
}
