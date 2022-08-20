package com.chrynan.platform.buildSrc

object LibraryConstants {

    const val bintrayRepo = "chrynan"
    const val group = "com.chrynan.platform"
    const val owner = "chrynan"
    const val repoName = "platform"
    const val versionName = "0.3.0"
    const val versionCode = 3
    const val versionDescription = "Release $versionName ($versionCode)"
    const val license = "Apache-2.0"
    const val vcsUrl = "https://github.com/chRyNaN/platform.git"

    object Android {

        const val compileSdkVersion = 33
        const val minSdkVersion = 24
        const val targetSdkVersion = 33
    }
}
