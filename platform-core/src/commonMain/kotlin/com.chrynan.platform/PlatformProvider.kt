@file:Suppress("unused")

package com.chrynan.platform

/**
 * A component that provides a [Platform] model. Using this interface to provide a [Platform] might be necessary, for
 * instance, if you call the [Platform.Companion.current] property from a JVM module it will return a [Platform.Jvm]
 * instance, but that JVM module might be called from an Android module, and it will incorrectly return the wrong
 * [Platform] type. To prevent those issues from occurring, a [PlatformProvider] can be used, where each platform is
 * provided correctly for each app platform and accessed via dependency inversion.
 */
fun interface PlatformProvider {

    operator fun invoke(): Platform
}
