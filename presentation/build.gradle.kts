plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
//    alias(libs.plugins.kidzke.android.library)
//    alias(libs.plugins.kidzke.android.hilt)
//    alias(libs.plugins.kidzke.android.library.compose)
}

android {
    namespace = "com.nerds.presentation"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nerds.presentation"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":kidzke"))
//    implementation(project(":datasource:remote"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.timber)
    implementation(libs.androidx.splashscreen)
    implementation(libs.kotlin.coroutines.play.services)
    implementation(libs.gms.play.services.auth)
    implementation(libs.lottie.compose)
    implementation(libs.accompanist.swiperefresh)
    implementation(libs.kotlin.coroutines.datetime)
    implementation(libs.material)

//    implementation(libs.firebase.messaging)

    testImplementation(libs.test.robolectric)
    testImplementation(libs.test.navigation)
    testImplementation(libs.test.mockk)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}