// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        maven { url = uri("https://jitpack.io") }
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }  //for example
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
