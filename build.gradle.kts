plugins {
    kotlin("android") version "1.7.10"
    kotlin("kapt") version "1.7.10"
    id("com.android.application") version "7.0.0"
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.flashcardapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.10")
    implementation("androidx.compose.ui:ui:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.compose.ui:ui-tooling:1.3.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.room:room-ktx:2.5.0")
    kapt("androidx.room:room-compiler:2.5.0")
    implementation("dagger:hilt-android:2.45")
    kapt("dagger:hilt-compiler:2.45")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.0")
    implementation("com.google.android.gms:play-services-drive:19.0.0")
    implementation("com.opencsv:opencsv:5.5.3")
}