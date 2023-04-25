package com.kojingu.xylo.screens.maingame

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextMainGame(
    modifier: Modifier = Modifier
) {
    Text(
        text = "Discover your friend sonata!",
        modifier = modifier,
        fontSize = 18.sp
    )
    Text(
        modifier = modifier.padding(bottom = 15.dp),
        text = "♫",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold
    )
}
