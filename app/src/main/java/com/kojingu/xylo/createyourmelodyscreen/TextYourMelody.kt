package com.kojingu.xylo.createyourmelodyscreen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TextYourMelody() {
    Text(
        text = stringResource(id = R.string.text_your_melody),
        fontSize = 16.sp
    )
}
