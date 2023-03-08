plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:1.8.0")
    implementation("com.android.application:com.android.application.gradle.plugin:8.0.0-alpha10")
}

gradlePlugin {
    plugins {
        create("akore.android-library") {
            id = "io.github.akore.infrared.kotlin.lib"
            implementationClass = "io.github.akore.infrared.androidlib.AndroidLibraryPlugin"
        }
    }
}
