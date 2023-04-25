package com.kojingu.xylo.screens.maingame

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleMainGame(
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier.padding(top = 20.dp, bottom = 15.dp),
        text = "Xylo",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}