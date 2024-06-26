plugins {
    alias(libs.plugins.kidzke.android.application)
    alias(libs.plugins.kidzke.android.hilt)
    alias(libs.plugins.kidzke.android.library.firebase)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.nerds.datasource.local"


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

    coreLibraryDesugaring(libs.desugar.jdk.libs)

    releaseImplementation(libs.chucker.release)
    debugImplementation(libs.chucker.debug)

    testImplementation(libs.app.cash.turbine.turbine)
    testImplementation(libs.kotlin.coroutines.test)
    testImplementation(libs.test.androidx.core)
    testImplementation(libs.test.robolectric)
    testImplementation(libs.ktor.mock)
    testImplementation(libs.test.mockk)
}

kotlin {
    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
            }
        }
    }
}