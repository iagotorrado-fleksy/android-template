plugins {
    id("template.kotlin.feature")
    id("template.coroutines")
    id(libs.plugins.kotlin.serialization.get().pluginId)
}

dependencies {
    implementation(project(":core:commons"))

    api(libs.bundles.network)
    implementation(libs.bundles.javax)

    testImplementation(project(":core:data-test"))
}
