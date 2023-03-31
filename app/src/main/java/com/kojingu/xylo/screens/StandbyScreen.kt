package com.kojingu.xylo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun StandbyScreen(
    name: String = "RENO"
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleStandbyScreen()
        Spacer(modifier = Modifier.weight(0.7f))
        TextStandbyScreen(  userName = name  )
        IconStandbyScreen()
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun TitleStandbyScreen() {
    Text(
        text = stringResource(com.kojingu.xylo.R.string.title_standby_screen),
        modifier = Modifier.padding(top = 25.dp),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun TextStandbyScreen(
    userName: String
) {
    Text(
        textAlign = TextAlign.Center,
        text = stringResource(com.kojingu.xylo.R.string.text_standby_screen, userName),
        fontSize = 28.sp
    )
}

@Composable
fun IconStandbyScreen() {
    CircularProgressIndicator(
        modifier = Modifier
            .size(60.dp)
            .padding(top = 40.dp),
        color = Color.Black,
        strokeWidth = 6.dp,
        strokeCap = StrokeCap.Round
    )
}
