@file:Suppress("unused")

package com.chrynan.kotlinplatform

sealed class Platform {

    object Jvm : Platform()

    object Android : Platform()

    object Ios : Platform()

    object Js : Platform()
}

expect val platform: Platform