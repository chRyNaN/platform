@file:Suppress("unused")

package com.chrynan.platform

enum class PlatformName(val typeName: String) {

    JVM(typeName = "jvm"),
    ANDROID(typeName = "android"),
    IOS(typeName = "ios"),
    JS(typeName = "js");

    companion object {

        fun getByTypeName(name: String, ignoreCase: Boolean = true): PlatformName? =
            values().firstOrNull { it.typeName.equals(name, ignoreCase) }
    }
}
