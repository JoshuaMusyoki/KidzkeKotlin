import com.nerds.kidzo24.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            pluginManager.apply("com.android.library")
            val extension = extensions.getByType<LibraryExtension()
            configureAndroidCompose(extension)
        }
    }
}