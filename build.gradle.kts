plugins {
    id("com.android.application")
}

android {
    namespace = "com.wrapper.youtube"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.wrapper.youtube"
        minSdk = 14 // Android 4.0 support
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        ndk {
            abiFilters.addAll(setOf("armeabi-v7a", "arm64-v8a"))
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
