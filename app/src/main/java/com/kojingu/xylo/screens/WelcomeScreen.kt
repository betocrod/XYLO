package com.kojingu.xylo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R
import com.kojingu.xylo.ui.theme.Mainbluestate

@Composable
fun WelcomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Title()
        Buttons(
            onJoinClick = {},
            onNewGameClick = {}
        )
    }
}

@Composable
fun Title() {
    Surface(
        color = Color.Transparent,
        modifier = Modifier.padding(bottom = 160.dp, top = 170.dp)
    ) {
        Text(
            text = stringResource(R.string.title_app),
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Buttons(
    onJoinClick: () -> Unit,
    onNewGameClick: () -> Unit
) {
    Column(
        modifier = Modifier.padding(top = 145.dp)
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
            onClick = { onJoinClick() },
            contentPadding = PaddingValues(horizontal = 24.5.dp, vertical = 18.dp),
            modifier = Modifier.padding(bottom = 18.dp)
        ) {
            Text(
                text = stringResource(R.string.button_join),
                color = Color.White
                )
        }
        OutlinedButton(
            onClick = { onNewGameClick() }, contentPadding = PaddingValues(18.dp)
        ) {
            Text(
                text = stringResource(R.string.button_new_game),
                color = Mainbluestate
                )
        }
    }
}

@Preview
@Composable
private fun PreviewTitle() {
    Title()
}

@Preview
@Composable
private fun PreviewButtons() {
    Buttons(
        onJoinClick = {},
        onNewGameClick = {}
    )
}

