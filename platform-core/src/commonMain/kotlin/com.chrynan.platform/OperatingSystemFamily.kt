@file:Suppress("unused")

package com.chrynan.platform

enum class OperatingSystemFamily(val typeName: String) {

    UNKNOWN(typeName = "unknown"),
    MACOSX(typeName = "macosx"),
    IOS(typeName = "ios"),
    LINUX(typeName = "linux"),
    WINDOWS(typeName = "windows"),
    ANDROID(typeName = "android"),
    WASM(typeName = "wasm"),
    TVOS(typeName = "tvos"),
    WATCHOS(typeName = "watchos");

    companion object {

        fun getByTypeName(name: String, ignoreCase: Boolean = true): OperatingSystemFamily =
            values().firstOrNull { it.typeName.equals(name, ignoreCase) } ?: UNKNOWN
    }
}
