package com.kojingu.xylo.screens.maingame

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.ui.theme.Mainbluestate

@Composable
fun ButtonGoMainGame(
    tryiItOut: () -> Unit = {}
) {

    Button(
        enabled = false,
        onClick = { tryiItOut() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
        contentPadding = PaddingValues(horizontal = 90.dp, vertical = 12.5.dp)
    ) {
        Text(
            text = "Try it out!",
            fontSize = 18.sp,
            color = Color.White
        )
    }
}