package com.chrynan.platform

sealed class Platform {

    object Jvm : Platform()

    object Android : Platform()

    object Ios : Platform()

    object Js : Platform()
}

expect val platform: Platform
