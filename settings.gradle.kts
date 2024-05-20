pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "MultiModulesTestProject"
include(":app")
include(":app-ui-catalog")
include(":core")
include(":core:designsystem")
include(":core:analytics")
include(":core:ui")
include(":core:common")
include(":core:data")
include(":core:model")
include(":core:domain")
include(":core:database")
include(":core:datastore")
include(":core:network")
include(":core:socket")
include(":core:notifications")
include(":core:deeplink")
include(":feature")
include(":feature:medpack")
include(":feature:lightpsp")
include(":feature:profile")
include(":feature:medcard")
include(":feature:maindashboard")
include(":pspcomponents")
include(":pspcomponents:stepcounter")
include(":pspcomponents:pillbox")
include(":pspcomponents:courses")
include(":lint")
