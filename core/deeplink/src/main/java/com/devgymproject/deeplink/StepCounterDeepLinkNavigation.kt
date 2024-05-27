package com.devgymproject.deeplink

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest

private const val STEP_COUNTER_DEEPLINK = "android-app://example.google.app/navigation_step_counter"

fun NavController.navigateToStepCounter() {
    val request = NavDeepLinkRequest.Builder
        .fromUri(STEP_COUNTER_DEEPLINK.toUri())
        .build()

    navigate(request)
}