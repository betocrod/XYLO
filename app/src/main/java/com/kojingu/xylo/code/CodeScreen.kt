package com.kojingu.xylo.code

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CodeScreen(
    viewModel: CodeViewModel
){
    CodeScreen(
        code = viewModel.code,
        username = viewModel.userName,
        friends = viewModel.friends)
}

@Composable
fun CodeScreen(
    modifier: Modifier = Modifier,
    code: String,
    username: String,
    friends: List<String>
) {
    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleCode()

            Spacer(modifier = modifier.weight(0.55f))

            GreetingCode(username)

            Spacer(modifier = modifier.weight(1.5f))

            GeneratedCode()
            YourCode(code = code)

            Spacer(modifier = modifier.weight(0.4f))

            ListUsers(friends)

            Spacer(modifier = modifier.weight(1f))
            ButtonCode(onYouReady = {})
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    CodeScreen(
        code = "WXYZ",
        username = "Reno",
        friends = listOf("Rene", "Natha", "Sam", "Gabo")
    )
}