plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)

    defaultConfig {
        buildConfigField("String", "URL_MOVIE_CATALOG", "\"https://api.themoviedb.org\"")
        buildConfigField("String", "API_KEY", "\"5a9914ea9eb3bfc1addfe13b0b92b0b4\"")
        buildConfigField("String", "URL_IMAGE", "\"https://image.tmdb.org/t/p/w185\"")
        buildConfigField("String", "URL_POSTER", "\"https://image.tmdb.org/t/p/w780\"")

        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Android.versionCode
        versionName = Dependencies.Android.versionName
        testInstrumentationRunner = Dependencies.Android.testInstrumentationRunner
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.kotlin_std)
    implementation(Dependencies.SupportLibrary.legacySupport)

    implementation(project(":itemData"))
    implementation(project(":repository"))
}
