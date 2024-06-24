enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}

rootProject.name = "Kidzo24Kotlin"

include(":app")
include(":data")
include(":presentation")
include(":domain")
include(":kidzke")
include(":datasource:local")
include(":datasource:remote")
//include(":build-logic:conventions")
