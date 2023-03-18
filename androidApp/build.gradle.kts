plugins {
    id(Plugins.androidApplication)
    kotlin(Plugins.android)
}

android {
    namespace = Namespaces.android
    compileSdk = Playstore.compileSdk
    defaultConfig {
        applicationId = Playstore.applicationId
        minSdk = Playstore.minSdk
        targetSdk = Playstore.targetSdk
        versionCode = Playstore.versionCode
        versionName = Playstore.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(Compose.ui)
    implementation(Compose.tooling)
    implementation(Compose.toolingPreview)
    implementation(Compose.foundation)
    implementation(Compose.material)
    implementation(Compose.activity)
}