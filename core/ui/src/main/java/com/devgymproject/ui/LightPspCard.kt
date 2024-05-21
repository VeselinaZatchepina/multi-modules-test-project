package com.devgymproject.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun SimpleCard(){
    val paddingModifier  = Modifier.padding(10.dp)
    Card(modifier = paddingModifier) {
        Text(text = "Simple Card with elevation",
            modifier = paddingModifier)
    }
}