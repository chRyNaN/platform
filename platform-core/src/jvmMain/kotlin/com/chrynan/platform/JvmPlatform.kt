package com.chrynan.platform

import java.util.*

actual val platform: Platform = JvmPlatform()

class JvmPlatform : Platform.Jvm() {

    override val operatingSystemFamily: OperatingSystemFamily
        get() {
            val osName = System.getProperty("os.name", "generic").lowercase(Locale.ENGLISH)

            return when {
                osName.indexOf("mac") >= 0 || osName.indexOf("darwin") >= 0 -> OperatingSystemFamily.MACOSX
                osName.indexOf("win") >= 0 -> OperatingSystemFamily.WINDOWS
                osName.indexOf("nux") >= 0 -> OperatingSystemFamily.LINUX
                else -> OperatingSystemFamily.UNKNOWN
            }
        }

    override val operatingSystemVersion: String?
        get() = try {
            System.getProperty("os.version")
        } catch (exception: Exception) {
            null
        }

    override val javaVersion: String
        get() = System.getProperty("java.version")

    override val javaVendorName: String?
        get() = try {
            System.getProperty("java.vendor")
        } catch (exception: Exception) {
            null
        }

    override val javaVendorUrl: String?
        get() = try {
            System.getProperty("java.vendor.url")
        } catch (exception: Exception) {
            null
        }

    override val jvmVersion: String?
        get() = try {
            System.getProperty("java.vm.version")
        } catch (exception: Exception) {
            null
        }

    override val jvmVendorName: String?
        get() = try {
            System.getProperty("java.vm.vendor")
        } catch (exception: Exception) {
            null
        }
}
