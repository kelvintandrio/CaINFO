plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    defaultConfig {
        applicationId = Dependencies.Android.applicationId
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Android.versionCode
        versionName = Dependencies.Android.versionName
        testInstrumentationRunner = Dependencies.Android.testInstrumentationRunner
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.kotlin_std)

    implementation(Dependencies.SupportLibrary.appCompat)
    implementation(Dependencies.SupportLibrary.constraintLayout)
    implementation(Dependencies.SupportLibrary.coreKtx)
    implementation(Dependencies.SupportLibrary.legacySupport)
    implementation(Dependencies.SupportLibrary.lifecycleLibrary)
    kapt(Dependencies.SupportLibrary.lifecycleCompiler)
    implementation(Dependencies.SupportLibrary.recyclerView)
    implementation(Dependencies.SupportLibrary.materialSupport)
    implementation(Dependencies.SupportLibrary.pagingLibrary)
    implementation(Dependencies.SupportLibrary.pagingRxJavaLibrary)
    implementation(Dependencies.SupportLibrary.glideLibrary)

    testImplementation(Dependencies.TestingLibrary.testJunit)
    androidTestImplementation(Dependencies.TestingLibrary.androidTestRunner)
    androidTestImplementation(Dependencies.TestingLibrary.androidTestEspresso)

    implementation(project(":itemData"))
    implementation(project(":repository"))
    implementation(project(":movieApps"))
}
