plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:1.8.0")
}

gradlePlugin {
    plugins {
        create("akore.kotlin-library") {
            id = "io.github.akore.infrared.kotlin.lib"
            implementationClass = "io.github.akore.infrared.kotlinlib.KotlinLibraryPlugin"
        }
    }
}
