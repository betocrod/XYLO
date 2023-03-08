package com.kojingu.xylo.Screens

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Title()
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun Title() {
    Surface(
        color = Color.Transparent,
        modifier = Modifier.padding(bottom = 160.dp, top = 170.dp)
    ) {
        Text(
            text = "Xylo",
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun Buttons(){
    Column(
        modifier = Modifier.padding(top = 145.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(horizontal = 24.5.dp, vertical = 18.dp),
            modifier = Modifier.padding(bottom = 18.dp)
        ) {
            Text(text = "Join your friends")
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(18.dp)
        ) {
            Text(text = "Create a new game")
        }
    }
}