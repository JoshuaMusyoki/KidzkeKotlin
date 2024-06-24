plugins {
    alias(libs.plugins.kidzke.android.application)
    alias(libs.plugins.kidzke.android.hilt)
    alias(libs.plugins.kidzke.android.application.firebase)
    alias(libs.plugins.gms)
    alias(libs.plugins.firebase.crashlytics)
}

android {
    namespace = "com.nerds.kidzo24kotlin"
//    compileSdk = 34

    defaultConfig {
        applicationId = "com.nerds.kidzo24kotlin"
//        minSdk = 24
//        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        signingConfigs {
            getByName("debug"){
                storeFile = file("../keystore/dckedebug.keystore")
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
            isDebuggable = true
            isMinifyEnabled = true
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
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
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
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
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
//    Splash screen
    implementation (libs.androidx.splashscreen)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.material3)

    implementation(libs.timber)

    implementation(libs.work.runtime)

    implementation(libs.desugar.jdk.libs)

    implementation (libs.firebase.crashlytics.gradlePlugin)

    androidTestImplementation(libs.androidx.junit)
    testImplementation(libs.junit)

//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.firebase.crashlytics)
//    implementation(libs.firebase.analytics)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
}