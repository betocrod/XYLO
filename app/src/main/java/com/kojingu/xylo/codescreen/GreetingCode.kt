package com.kojingu.xylo.codescreen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R


@Composable
fun GreetingCode(
    codeUserGreeting: String
) {
    Text(
        text = stringResource(id = R.string.greeting_code_screen, codeUserGreeting),
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}