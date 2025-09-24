pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Required for dependencies hosted on JitPack (e.g. PhotoView)
        maven("https://jitpack.io")
        jcenter()//PDF Viewer
    }
}

rootProject.name = "Segumovil"
include(":app")
include(":Insurance")
 