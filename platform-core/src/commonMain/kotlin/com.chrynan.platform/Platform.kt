@file:Suppress("unused")

package com.chrynan.platform

sealed class Platform {

    abstract val name: PlatformName
    abstract val operatingSystemFamily: OperatingSystemFamily?

    abstract class Jvm internal constructor() : Platform() {

        override val name: PlatformName = PlatformName.JVM

        abstract override val operatingSystemFamily: OperatingSystemFamily

        abstract val operatingSystemVersion: String?
        abstract val javaVersion: String
        abstract val javaVendorName: String?
        abstract val javaVendorUrl: String?
        abstract val jvmVersion: String?
        abstract val jvmVendorName: String?
    }

    abstract class Android internal constructor() : Platform() {

        override val name: PlatformName = PlatformName.ANDROID

        override val operatingSystemFamily: OperatingSystemFamily = OperatingSystemFamily.ANDROID

        abstract val sdkInt: Int
        abstract val versionName: String
        abstract val securityPatch: String?
        abstract val baseOs: String?
        abstract val incremental: String?
    }

    abstract class Ios internal constructor() : Platform() {

        override val name: PlatformName = PlatformName.IOS

        abstract override val operatingSystemFamily: OperatingSystemFamily

        abstract val systemName: String
        abstract val systemVersion: String
        abstract val nativePlatform: NativePlatform

        data class NativePlatform(
            val cpuArchitecture: CpuArchitecture,
            val memoryModel: MemoryModel,
            val canAccessUnaligned: Boolean,
            val isLittleEndian: Boolean,
            val isDebugBinary: Boolean,
            val isMemoryLeakCheckerActive: Boolean,
            val isCleanersLeakCheckerActive: Boolean
        )

        enum class CpuArchitecture(
            val typeName: String,
            val bitness: Int
        ) {

            UNKNOWN(typeName = "unknown", bitness = -1),
            ARM32(typeName = "arm32", bitness = 32),
            ARM64(typeName = "arm64", bitness = 64),
            X86(typeName = "x86", bitness = 32),
            X64(typeName = "x64", bitness = 64),
            MIPS32(typeName = "mips32", bitness = 32),
            MIPSEL32(typeName = "mipsel32", bitness = 32),
            WASM32(typeName = "wasm32", bitness = 32);

            companion object {

                fun getByTypeName(name: String, ignoreCase: Boolean = true): CpuArchitecture =
                    values().firstOrNull { it.typeName.equals(name, ignoreCase) } ?: UNKNOWN
            }
        }

        enum class MemoryModel(val typeName: String) {

            STRICT(typeName = "strict"),
            RELAXED(typeName = "relaxed"),
            EXPERIMENTAL(typeName = "experimental"),
            UNKNOWN(typeName = "unknown");

            companion object {

                fun getByTypeName(name: String, ignoreCase: Boolean = true): MemoryModel =
                    values().firstOrNull { it.typeName.equals(name, ignoreCase) } ?: UNKNOWN
            }
        }
    }

    abstract class Js internal constructor() : Platform() {

        override val name: PlatformName = PlatformName.JS

        abstract override val operatingSystemFamily: OperatingSystemFamily?

        abstract val userAgent: String?
    }
}

expect val platform: Platform
