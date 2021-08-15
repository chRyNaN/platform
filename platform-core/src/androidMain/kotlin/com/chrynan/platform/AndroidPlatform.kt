package com.chrynan.platform

import android.os.Build

actual val platform: Platform = AndroidPlatform()

class AndroidPlatform : Platform.Android() {

    override val sdkInt: Int
        get() = Build.VERSION.SDK_INT

    override val versionName: String
        get() {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                Build.VERSION.RELEASE_OR_CODENAME
            } else {
                try {
                    Build.VERSION.RELEASE ?: Build.VERSION.CODENAME
                } catch (exception: Exception) {
                    Build.VERSION.CODENAME
                }
            }
        }

    override val securityPatch: String?
        get() = try {
            Build.VERSION.SECURITY_PATCH
        } catch (exception: Exception) {
            null
        }

    override val baseOs: String?
        get() = try {
            Build.VERSION.BASE_OS
        } catch (exception: Exception) {
            null
        }

    override val incremental: String?
        get() = try {
            Build.VERSION.INCREMENTAL
        } catch (exception: Exception) {
            null
        }
}
