package com.devgymproject.deeplink

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest

private const val LIGHT_PSP_DEEPLINK = "android-app://example.google.app/navigation_light_psp"

fun NavController.navigateToLightPsp() {
    val request = NavDeepLinkRequest.Builder
        .fromUri(LIGHT_PSP_DEEPLINK.toUri())
        .build()

    navigate(request)
}