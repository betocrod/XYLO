package com.kojingu.xylo.createyourmelodyscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TitleYourMelody(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(top = 20.dp, bottom = 35.dp)
    ) {
        Text(
            text = stringResource(id = R.string.title_your_melody),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}