plugins {
    alias(libs.plugins.kidzke.android.library)
    alias(libs.plugins.kidzke.android.hilt)
    alias(libs.plugins.kidzke.android.library.firebase)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.nerds.data"


    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":datasource:local"))
    implementation(project(":datasource:remote"))

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    api(libs.kotlin.coroutines.datetime)
    implementation(libs.timber)
    implementation(libs.datastore)
    implementation(libs.kotlin.coroutines.android)
    implementation(libs.bundles.ktor)

    coreLibraryDesugaring(libs.desugar.jdk.libs)
    implementation(libs.lifecycle.livedataKtx)

    implementation(libs.work.runtime)

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