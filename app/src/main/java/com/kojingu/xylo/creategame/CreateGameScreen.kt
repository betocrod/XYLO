package com.kojingu.xylo.creategame

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kojingu.xylo.creategame.views.ButtonCreateGame
import com.kojingu.xylo.creategame.views.TitleCreateGame

@Composable
fun CreateGameScreen(
    viewModel:CreateGameViewModel
){
    CreateGameScreen(
        nickname = viewModel.nickName,
        rounds = viewModel.rounds,
        onNicknameChange = { viewModel.queryNickname(it) },
        onRoundsChange = { viewModel.queryRounds(it) })
}
@Composable
fun CreateGameScreen(
    nickname: String,
    onNicknameChange: (String) -> Unit,
    rounds: Int,
    onRoundsChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {

        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleCreateGame()
            Spacer(modifier = Modifier.weight(1f))
            SearchCreateGame(
                enterNickname = nickname,
                onNicknameChanged = { onNicknameChange(it) },

                enterRounds = rounds,
                onRoundsChanged = { onRoundsChange(it) }

            )
            Spacer(modifier = Modifier.weight(1f))
            ButtonCreateGame()
        }
    }
@Composable
@Preview(showSystemUi = true)
private fun Preview(){
    CreateGameScreen(
        nickname = "Reno",
        rounds = 0,
        onNicknameChange = {},
        onRoundsChange = {})
}
