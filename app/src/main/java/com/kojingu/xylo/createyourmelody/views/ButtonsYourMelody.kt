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
import com.kojingu.xylo.ui.theme.*

@Composable
fun ButtonsYourMelody(
    modifier: Modifier = Modifier,
    onKeyClick: () -> Unit
) {
    KeyButton(
        text = "C",
        color = RedGame,
        contentPadding = PaddingValues(horizontal = 170.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )

    KeyButton(
        text = "D",
        color = OrangeGame,
        contentPadding = PaddingValues(horizontal = 165.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )

    KeyButton(
        text = "E",
        color = YellowGame,
        contentPadding = PaddingValues(horizontal = 160.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )

    KeyButton(
        text = "F",
        color = GreenGame,
        contentPadding = PaddingValues(horizontal = 155.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )

    KeyButton(
        text = "G",
        color = SkyBlueGame,
        contentPadding = PaddingValues(horizontal = 150.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )

    KeyButton(
        text = "A",
        color = Mainbluestate,
        contentPadding = PaddingValues(horizontal = 145.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )
    KeyButton(
        text = "B",
        color = PurpleGame,
        contentPadding = PaddingValues(horizontal = 140.dp, vertical = 12.5.dp),
        modifier = modifier.padding(4.5.dp),
        onClick = { onKeyClick() }
    )

}

@Composable
private fun KeyButton(
    text: String,
    color: Color,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        Text(
            text = text, fontSize = 18.sp, color = Color.White
        )
    }
}