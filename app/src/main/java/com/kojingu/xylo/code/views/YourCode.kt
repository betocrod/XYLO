package com.kojingu.xylo.code

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun YourCode(
    code: String, modifier: Modifier = Modifier
) {
    Text(
        text = code,
        fontSize = 40.sp,
        modifier = modifier
            .border(width = 1.5.dp, color = Color.Black)
            .padding(horizontal = 30.dp, vertical = 15.dp),
        fontWeight = FontWeight.Bold
    )
}
