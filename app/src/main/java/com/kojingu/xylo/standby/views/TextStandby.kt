package com.kojingu.xylo.standby

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TextStandby(
    userName: String
) {
    Text(
        textAlign = TextAlign.Center,
        text = stringResource(R.string.text_standby_screen, userName),
        fontSize = 28.sp
    )
}
