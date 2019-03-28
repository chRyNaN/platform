package com.chrynan.kotlinplatform

sealed class Platform {

    object Jvm : Platform()

    object Android : Platform()

    object Ios : Platform()

    object NodeJs : Platform()

    object WebJs : Platform()

    object Mac : Platform()
}

expect val platform: Platform