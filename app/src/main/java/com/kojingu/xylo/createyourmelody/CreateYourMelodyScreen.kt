package com.kojingu.xylo.createyourmelody

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kojingu.xylo.data.KeyNote

@Composable
fun CreateYourMelodyScreen(
    modifier: Modifier = Modifier,
    viewModel: CreateYourMelodyViewModel
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleYourMelody()
        TextYourMelody()
        Spacer(modifier = modifier.weight(1f))
        ButtonsYourMelody(
            onKeyClick = { viewModel.addKey() }
        )
        Spacer(modifier = modifier.weight(1f))
        ButtonYourMelody()
        Spacer(modifier = modifier.weight(1f))
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    CreateYourMelodyScreen()
    KeyNote.B
}
