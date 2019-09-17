plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)

    defaultConfig {
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
    implementation(Dependencies.SupportLibrary.recyclerView)
    implementation(Dependencies.SupportLibrary.materialSupport)
    implementation(Dependencies.SupportLibrary.pagingLibrary)
    implementation(Dependencies.SupportLibrary.pagingRxJavaLibrary)
    implementation(Dependencies.SupportLibrary.retrofitConvertGson)
}