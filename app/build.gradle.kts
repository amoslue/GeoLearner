plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.peichen.geolearner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.peichen.geolearner"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.lifecycle.runtime.ktx.v262)
    implementation(libs.androidx.activity.compose.v172)
    implementation(libs.androidx.ui.v153)
    implementation(libs.androidx.material)
    implementation(libs.androidx.ui.tooling.preview.v153)
    debugImplementation(libs.ui.tooling)
    implementation (libs.androidx.compose.ui.ui)
    implementation (libs.androidx.compose.ui.ui.tooling.preview)
    implementation ("androidx.compose.material3:material3:1.3.1")
    implementation ("com.google.android.material:material:1.12.0")

// https://mvnrepository.com/artifact/androidx.compose.material3/material3
}
