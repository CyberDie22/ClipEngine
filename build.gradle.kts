plugins {
    kotlin("multiplatform") version "1.5.30"
}

group = "me.cyberdie22"
version = "2021.0.0"

repositories {
    mavenCentral()
}

kotlin {
    linuxX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val linuxX64Main by getting
        val linuxX64Test by getting
    }
}
