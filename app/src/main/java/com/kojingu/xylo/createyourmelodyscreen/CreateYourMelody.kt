package com.kojingu.xylo.createyourmelodyscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CreateYourMelodyScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleYourMelody()
        TextYourMelody()
        Spacer(modifier = modifier.weight(1f))
        ButtonsYourMelody()
        Spacer(modifier = modifier.weight(1f))
        ButtonYourMelody()
        Spacer(modifier = modifier.weight(1f))
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    CreateYourMelodyScreen()
}
