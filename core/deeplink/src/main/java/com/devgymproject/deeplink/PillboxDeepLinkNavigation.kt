package com.devgymproject.deeplink

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest

private const val PILLBOX_DEEPLINK = "android-app://example.google.app/navigation_pillbox"

fun NavController.navigateToPillbox() {
    val request = NavDeepLinkRequest.Builder
        .fromUri(PILLBOX_DEEPLINK.toUri())
        .build()

    navigate(request)
}