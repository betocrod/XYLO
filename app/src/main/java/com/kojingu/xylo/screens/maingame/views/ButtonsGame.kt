package com.kojingu.xylo.screens.maingame

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonsMainGame(
    modifier: Modifier = Modifier
) {
    Melody(
        note = Notes.C,
        contentPadding = PaddingValues(horizontal = 125.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp))

    Melody(
        note = Notes.D,
        contentPadding = PaddingValues(horizontal = 120.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp))

    Melody(
        note = Notes.E,
        contentPadding = PaddingValues(horizontal = 115.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp))

    Melody(
        note = Notes.F,
        contentPadding = PaddingValues(horizontal = 110.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp))

    Melody(
        note = Notes.G,
        contentPadding = PaddingValues(horizontal = 105.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp))

    Melody(
        note = Notes.A,
        contentPadding = PaddingValues(horizontal = 100.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp)
    )
    Melody(
        note = Notes.B,
        contentPadding = PaddingValues(horizontal = 95.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp)
    )

}

@Composable
private fun Melody(
    note: Notes,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(backgroundColor = note.color)
    ) {
        Text(
            text = note.name,
            fontSize = 18.sp,
            color = Color.White
        )
    }
}