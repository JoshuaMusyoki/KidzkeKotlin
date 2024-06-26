

import com.nerds.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("com.google.devtools.ksp")
            }

            dependencies {
                "implementation"(libs.findLibrary("android.hilt").get())
                "implementation"(libs.findLibrary("android.hilt.navigation.compose").get())
                "implementation"(libs.findLibrary("hilt.work").get())
                "implementation"(libs.findLibrary("hilt.common").get())
//                "ksp"(libs.findLibrary("android.hilt.androidx.compiler").get())
                "ksp"(libs.findLibrary("android.hilt.compiler").get())
                "kspAndroidTest"(libs.findLibrary("android.hilt.compiler").get())
                "kspTest"(libs.findLibrary("android.hilt.compiler").get())
                "androidTestImplementation"(libs.findLibrary("android.hilt.testing").get())
                "testImplementation"(libs.findLibrary("android.hilt.compiler").get())
            }
        }
    }
}