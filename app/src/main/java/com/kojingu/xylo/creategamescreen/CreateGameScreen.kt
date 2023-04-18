package com.kojingu.xylo.creategamescreen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CreateGameScreen(
    modifier: Modifier = Modifier
) {
    var enterNickname by remember { mutableStateOf("") }
    var enterRounds by remember { mutableStateOf("") }

        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleCreateGame()
            Spacer(modifier = Modifier.weight(1f))
            SearchCreateGame(
                enterNickname = enterNickname,
                onNicknameChanged = { enterNickname = it },

                enterRounds = enterRounds,
                onRoundsChanged = { enterRounds = it.toString() }

            )
            Spacer(modifier = Modifier.weight(1f))
            ButtonCreateGame()
        }
    }
@Composable
@Preview(showSystemUi = true)
private fun Preview(){
    CreateGameScreen()
}
