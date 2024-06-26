plugins {
    alias(libs.plugins.kidzke.android.library)
    alias(libs.plugins.kidzke.android.library.compose)
}

android {
    namespace = "com.nerds.kidzke"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes.add("META-INF/io.netty.versions.properties")
            pickFirsts.add("META-INF/io.netty.versions.properties")
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.lifecycle.runtimeKtx)
    implementation(libs.timber)

    androidTestImplementation(libs.android.test.junit4)

    testImplementation(libs.bundles.test)
    testImplementation(libs.test.robolectric)
}