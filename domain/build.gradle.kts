plugins {
    alias(libs.plugins.kidzke.android.library)
}

android {
    namespace = "com.nerds.domain"

}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}