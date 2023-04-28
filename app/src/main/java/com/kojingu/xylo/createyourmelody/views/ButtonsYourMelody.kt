package com.kojingu.xylo.createyourmelody

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
import com.kojingu.xylo.data.KeyNote
import com.kojingu.xylo.ui.theme.*

@Composable
fun ButtonsYourMelody(
    modifier: Modifier = Modifier,
    onKeyClick: (KeyNote) -> Unit
) {
    KeyButton(
        keyNote = KeyNote.C,
        contentPadding = PaddingValues(horizontal = 170.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )

    KeyButton(
        keyNote = KeyNote.D,
        contentPadding = PaddingValues(horizontal = 165.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )

    KeyButton(
        keyNote = KeyNote.E,
        contentPadding = PaddingValues(horizontal = 160.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )

    KeyButton(
        keyNote = KeyNote.F,
        contentPadding = PaddingValues(horizontal = 155.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )

    KeyButton(
        keyNote = KeyNote.G,
        contentPadding = PaddingValues(horizontal = 150.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )

    KeyButton(
        keyNote = KeyNote.A,
        contentPadding = PaddingValues(horizontal = 145.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )
    KeyButton(
        keyNote = KeyNote.B,
        contentPadding = PaddingValues(horizontal = 140.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick(it) }
    )

}

@Composable
private fun KeyButton(
    keyNote: KeyNote,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    onClick: (KeyNote) -> Unit = {}
) {
    Button(
        modifier = modifier,
        onClick = { onClick(keyNote) },
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(backgroundColor = keyNote.color)
    ) {
        Text(
            text = keyNote.name, fontSize = 18.sp, color = Color.White
        )
    }
}