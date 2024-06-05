pluginManagement {
    includeBuild("build-logic")

//    include ':build-logic:convention'
    repositories {
        google()
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Kidzo24Kotlin"

include(":app")
include(":data")
include(":local")
include(":local")
include(":remote")
include(":presentation")
include(":domain")
include(":kidzke")
include(":datasource")
//include(":convention")
