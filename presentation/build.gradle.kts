
plugins {
    alias(libs.plugins.kidzke.android.library)
    alias(libs.plugins.kidzke.android.hilt)
    alias(libs.plugins.kidzke.android.library.compose)
}

android {
    namespace = "com.nerds.presentation"

    defaultConfig {
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    kotlinOptions {
        freeCompilerArgs + "-Xjvm-default=all"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            pickFirsts.add("META-INF/io.netty.versions.properties")
        }
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":kidzke"))
    implementation(project(":datasource:remote"))
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.lifecycle.runtimeKtx)
    implementation(libs.timber)
    implementation(libs.androidx.splashscreen)
    implementation(libs.kotlin.coroutines.play.services)
    implementation(libs.gms.play.services.auth)
    implementation(libs.lottie.compose)
    implementation(libs.accompanist.swiperefresh)
    implementation(libs.kotlin.coroutines.datetime)
    implementation(libs.firebase.messaging)

    testImplementation(libs.test.robolectric)
    testImplementation(libs.test.navigation)
    testImplementation(libs.test.mockk)
    testImplementation(libs.junit)
}

kotlin {
    sourceSets {
        all {
            languageSettings.apply {
                optIn("androidx.compose.material3.ExperimentalMaterial3Api")
            }
        }
    }
}