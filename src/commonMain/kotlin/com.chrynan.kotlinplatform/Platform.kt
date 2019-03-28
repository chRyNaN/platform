package com.chrynan.kotlinplatform

sealed class Platform {

    object Jvm : Platform()

    object Android : Platform()

    object Ios : Platform()

    object NodeJs : Platform()

    object WebJs : Platform()

    object Mac : Platform()

    object Windows : Platform()

    object WebAssembly : Platform()

    object Linux : Platform()
}

expect val platform: Platform