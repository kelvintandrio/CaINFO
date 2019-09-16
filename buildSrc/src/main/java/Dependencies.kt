private const val kotlinVersion = "1.3.50"
private const val androidGradleVersion = "3.5.0"

//support libs
private const val appcompatVersion = "1.0.2"
private const val coreKtxVersion = "1.0.2"
private const val constraintLayoutVersion = "1.1.3"
private const val legacySupportVersion = "1.0.0"
private const val recyclerViewVersion = "1.0.0"
private const val materialVersion = "1.0.0"
private const val pagingVersion = "2.1.0"
private const val pagingRxJavaVersion = "2.1.0"
private const val lifecycleVersion = "2.2.0-alpha03"

//test libs
private const val junitVersion = "4.12"
private const val runnerVersion = "1.2.0"
private const val espressoVersion = "3.2.0"

object Dependencies {
    object Android {
        const val minSdkVersion = 14
        const val targetSdkVersion = 28
        const val compileSdkVersion = 28
        const val applicationId = "algorithm.kelvin.project.ca_info"
        const val versionCode = 1
        const val versionName = "1.0"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
    object Kotlin {
        const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${kotlinVersion}"
    }
    object SupportLibrary {
        const val appCompat = "androidx.appcompat:appcompat:${appcompatVersion}"
        const val coreKtx = "androidx.core:core-ktx:${coreKtxVersion}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${constraintLayoutVersion}"
        const val legacySupport = "androidx.legacy:legacy-support-v4:${legacySupportVersion}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${recyclerViewVersion}"
        const val materialSupport = "com.google.android.material:material:${materialVersion}"
        const val pagingLibrary = "androidx.paging:paging-runtime:${pagingVersion}"
        const val pagingRxJavaLibrary = "androidx.paging:paging-rxjava2:${pagingRxJavaVersion}"
        const val lifecycleLibrary = "androidx.lifecycle:lifecycle-extensions:${lifecycleVersion}"
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${lifecycleVersion}"
    }
    object TestingLibrary {
        const val testJunit = "junit:junit:${junitVersion}"
        const val androidTestRunner = "androidx.test:runner:${runnerVersion}"
        const val androidTestEspresso = "androidx.test.espresso:espresso-core:${espressoVersion}"
    }
}