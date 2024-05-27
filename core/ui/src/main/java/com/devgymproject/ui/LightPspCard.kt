package com.devgymproject.ui


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LightPspCard(
    text: String,
    status: String,
    onClick: () -> Unit,
) {
    val cardModifier  = Modifier
        .height(100.dp)
        .fillMaxWidth()
        .padding(8.dp)

    Card(
        modifier = cardModifier,
        colors = CardColors(Color.LightGray, Color.LightGray, Color.LightGray, Color.LightGray),
        onClick = onClick,
    ) {
        val textModifier  = Modifier.padding(8.dp)
            Text(
                text = text,
                color = Color.Black,
                modifier = textModifier,
            )
            Text(
                text = status,
                color = Color.White,
                modifier = textModifier,
            )
    }
}

@Preview
@Composable
fun ShowCard() {
    LightPspCard("LightPsp", "Status") {}
}