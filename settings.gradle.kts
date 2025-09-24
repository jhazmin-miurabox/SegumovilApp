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
        jcenter()//PDF Viewer
    }
}

rootProject.name = "Segumovil"
include(":app")
include(":Insurance")
project(":Insurance").projectDir = File("/Users/ivannicolas/AndroidStudioProjects/XIvan/Library/Insurance")
 