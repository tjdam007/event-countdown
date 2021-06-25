plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAapt)
}

android {
    val major = 1
    val minor = 0
    val patch = 0
    val versionClassifier = "Alpha"

    compileSdk = AndroidSdk.compileSdk
    buildToolsVersion = AndroidSdk.buildToolsVersion

    defaultConfig {
        applicationId = "com.mjandroiddev.eventcountdown"
        minSdkPreview = AndroidSdk.minimumSdkVersion.toString()
        targetSdk = AndroidSdk.targetSdkVersion
        versionCode = AndroidSdk.getVersionCode(major, minor, patch)
        versionName = AndroidSdk.getVersionName(major, minor, patch, versionClassifier)
        resourceConfigurations.add("en")
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = true
            isShrinkResources = true
            versionNameSuffix = DebugBuildType.versionNameSuffix
            applicationIdSuffix = DebugBuildType.applicationIdSuffix
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lint {
        isCheckReleaseBuilds = false
        isAbortOnError = false
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Libs.Compose.COMPOSE_VERSION
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    packagingOptions {
        resources.excludes += "META-INF/AL2.0"
        resources.excludes += "META-INF/LGPL2.1"
    }
}


dependencies {

    // Kotlin
    implementation(Libs.Kotlin.KOTLIN_STDLIB)
    // App-Compat
    implementation(Libs.AndroidX.APPCOMPAT)

    // Compose
    implementation(Libs.Compose.COMPOSE_UI)
    implementation(Libs.AndroidX.COMPOSE_ACTIVITY)
    implementation(Libs.Compose.COMPOSE_MATERIAL)
    implementation(Libs.Compose.COMPOSE_UI_TOOLING)
}
