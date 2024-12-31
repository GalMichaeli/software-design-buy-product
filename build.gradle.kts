plugins {
    kotlin("jvm") version "2.0.20"
    `maven-publish`

}

group = "il.ac.technion.cs.sd"
version = "1.0"

repositories {
    mavenCentral()
}

val kotlinguiceVersion = "3.0.0"

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.misfitlabs.kotlinguice4:kotlin-guice:$kotlinguiceVersion")
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/GalMichaeli/software-design-buy-product")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}
