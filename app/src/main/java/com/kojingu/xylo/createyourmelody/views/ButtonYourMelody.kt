package com.kojingu.xylo.createyourmelody

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R
import com.kojingu.xylo.ui.theme.Mainbluestate

@Composable
fun ButtonYourMelody(
    modifier: Modifier = Modifier, onYourMelody: () -> Unit = {}
) {
    Button(
        modifier = modifier.padding(top = 40.dp),
        onClick = { onYourMelody() },
        contentPadding = PaddingValues(horizontal = 18.dp, vertical = 15.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate)
    ) {
        Text(
            text = stringResource(id = R.string.button_your_melody), fontSize = 16.sp, color = Color.White
        )
    }
}
