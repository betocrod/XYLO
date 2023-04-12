package com.kojingu.xylo.creategamescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kojingu.xylo.R

@Composable
fun SearchCreateGame(
    enterNickname: String,
    onNicknameChanged: (nickname: String) -> Unit,
    modifier: Modifier = Modifier,
    enterRounds: String,
    onRoundsChanged: (rounds: String) -> Unit

){
    Column{
        OutlinedTextField(
            value = enterNickname,
            onValueChange = { onNicknameChanged(it) },
            singleLine = true,
            placeholder = { Text(text = stringResource(R.string.enter_your_nickname)) },
            modifier = modifier.padding(bottom = 14.dp)
        )

        OutlinedTextField(
            value = enterRounds,
            onValueChange = { onRoundsChanged(it) },
            singleLine = true,
            placeholder = { Text(text = stringResource(id = R.string.search_create_game)) }
        )
    }
}
