plugins {
    alias(libs.plugins.kidzke.android.application)
    alias(libs.plugins.kidzke.android.hilt)
    alias(libs.plugins.kidzke.android.application.firebase)
}

android {
    namespace = "com.nerds.kidzo24kotlin"
//    compileSdk = 34

    defaultConfig {
        applicationId = "com.nerds.kidzo24kotlin"
//        minSdk = 24
//        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        signingConfigs {
            getByName("debug"){
                storeFile = file("../keystore/kzkedebug.keystore")
                keyAlias = "kdke"
                keyPassword = "KidzKenya"
                storePassword = "KidzKenya"
            }
        }
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            isDebuggable = false
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
//        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
    packaging {
        resources {
            pickFirsts.add("META-INF/io.netty.versions.properties")
            pickFirsts.add("META-INF/INDEX.LIST")
        }
    }
}

dependencies {
    implementation(project(":kidzke"))
    implementation(project(":data"))
    implementation(project(":datasource:remote"))
    implementation(project(":datasource:local"))
    implementation(project(":domain"))
    implementation(project(":presentation"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.timber)

    implementation(libs.work.runtime)

    androidTestImplementation(libs.android.test.junit4)
    testImplementation(libs.bundles.test)

    coreLibraryDesugaring(libs.desugar.jdk.libs)
}