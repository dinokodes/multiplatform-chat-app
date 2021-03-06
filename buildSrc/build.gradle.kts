plugins {
    `kotlin-dsl`
}

repositories {
    // TODO: remove after new build is published
    mavenLocal()
    google()
    jcenter()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(Deps.JetBrains.Kotlin.gradlePlugin)
    implementation(Deps.Android.Tools.Build.gradlePlugin)
    implementation(Deps.Squareup.SQLDelight.gradlePlugin)
    implementation(Deps.JetBrains.Kotlin.kotlinAndroidExtentions)
    implementation(Serialization.gradlePlugin)
    implementation(kotlin("script-runtime"))
}

kotlin {
    // Add Deps to compilation, so it will become available in main project
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}
