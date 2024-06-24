plugins {
    alias(libs.plugins.kidzke.android.library)
    alias(libs.plugins.kidzke.android.hilt)
    alias(libs.plugins.kidzke.android.library.firebase)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.nerds.datasource.remote"
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }
}

dependencies {
    implementation(libs.kotlin.coroutines.datetime)
    implementation(libs.timber)
    implementation(libs.kotlin.coroutines.android)
    implementation(libs.bundles.ktor)

    implementation(libs.work.runtime)

    releaseImplementation(libs.chucker.release)
    debugImplementation(libs.chucker.debug)

//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
    testImplementation(libs.app.cash.turbine.turbine)
    testImplementation(libs.kotlin.coroutines.test)
    testImplementation(libs.test.androidx.core)
    testImplementation(libs.test.robolectric)
    testImplementation(libs.ktor.mock)
    testImplementation(libs.test.mockk)

//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
}
kotlin {
    sourSets {
        all {
            languageSettings.apply {
                optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
            }
        }
    }
}