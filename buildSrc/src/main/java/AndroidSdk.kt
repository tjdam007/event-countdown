object AndroidSdk {
    const val buildToolsVersion = "30.0.3"
    const val applicationId = ""
    const val compileSdk = 30
    const val minimumSdkVersion = 21
    const val targetSdkVersion = 30

    fun getVersionName(
        major: Int,
        minor: Int,
        patch: Int,
        versionClassifier: String
    ) = "${major}.${minor}.${patch}_${versionClassifier}"

    fun getVersionCode(
        major: Int,
        minor: Int,
        patch: Int
    ) = minimumSdkVersion * 10000000 + major * 10000 + minor * 100 + patch
}