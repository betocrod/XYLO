package com.kojingu.xylo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.ui.theme.*

@Preview(showSystemUi = true)
@Composable
fun CreateYourMelody() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleYourMelody()
        TextYourMelody()
        Spacer(modifier = Modifier.weight(1f))
        ButtonsYourMelody()
        Spacer(modifier = Modifier.weight(1f))
        ButtonYourMelody()
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun TitleYourMelody() {
    Column(
        modifier = Modifier.padding(top = 20.dp, bottom = 35.dp)
    ) {
        Text(
            text = "Xylo",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

@Composable
fun TextYourMelody() {
    Text(text = "Challenge your friends with a random song!",
        fontSize = 16.sp
    )
}

@Composable
fun ButtonsYourMelody() {
    KeyButton(
        text = "C",
        color = RedGame,
        contentPadding = PaddingValues(horizontal = 170.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    KeyButton(
        text = "D",
        color = OrangeGame,
        contentPadding = PaddingValues(horizontal = 165.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    KeyButton(
            text = "E",
            color = YellowGame,
            contentPadding = PaddingValues(horizontal = 160.dp, vertical = 12.5.dp),
            modifier = Modifier.padding(4.5.dp))

    KeyButton(
        text = "F",
        color = GreenGame,
        contentPadding = PaddingValues(horizontal = 155.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    KeyButton(
        text = "G",
        color = SkyBlueGame,
        contentPadding = PaddingValues(horizontal = 150.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    KeyButton(
        text = "A",
        color = Mainbluestate,
        contentPadding = PaddingValues(horizontal = 145.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp)
    )
    KeyButton(
        text = "B",
        color = PurpleGame,
        contentPadding = PaddingValues(horizontal = 140.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp)
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
            text = text,
            fontSize = 18.sp,
            color = Color.White
        )
    }
}

@Composable
fun ButtonYourMelody(
    onYourMelody: () -> Unit = {}
) {
    Button(
        modifier = Modifier.padding(top = 40.dp),
        onClick = { onYourMelody() },
        contentPadding = PaddingValues(horizontal = 18.dp, vertical = 15.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate)
    ) {
        Text(
            text = "Let the hunger games begin!",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}