package com.chrynan.platform

import kotlinx.browser.window
import org.w3c.dom.Navigator

actual val platform: Platform = JsPlatform()

class JsPlatform : Platform.Js() {

    private val navigator: Navigator
        get() = window.navigator

    override val operatingSystemFamily: OperatingSystemFamily? = null

    override val userAgent: String?
        get() = try {
            navigator.userAgent
        } catch (exception: Exception) {
            null
        }
}
