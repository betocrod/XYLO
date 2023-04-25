package com.kojingu.xylo.screens.maingame

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CountdownMainGame(
    seconds: Int
) {
    Text(
        text = "You have $seconds seconds left to guess",
        modifier = Modifier.padding(top = 10.dp, bottom = 20.dp)
    )
}
