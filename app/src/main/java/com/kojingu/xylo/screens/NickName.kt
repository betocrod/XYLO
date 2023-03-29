package com.kojingu.xylo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.ui.theme.Mainbluestate

@Preview(showSystemUi = true)
@Composable
fun Nickname (){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TitleNicknameScreen()

        Spacer(modifier = Modifier.weight(1f))

        SearchNicknameScreen()

        Spacer(modifier = Modifier.weight(1f))

        ButtonNicknameScreen( onNickname = {} )
    }
}

@Composable
fun TitleNicknameScreen() {
    Text(
        modifier = Modifier.padding(top = 25.dp),
        text = stringResource(com.kojingu.xylo.R.string.title_nickname_screen),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
}

@Composable
fun SearchNicknameScreen() {
    var search by remember { mutableStateOf("") }
    OutlinedTextField(
        value = search,
        onValueChange = {search = it},
        placeholder = { Text(text = stringResource(com.kojingu.xylo.R.string.search_nickname_screen))}
    )
}

@Composable
fun ButtonNicknameScreen(
    onNickname: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
        modifier = Modifier.padding(bottom = 80.dp),
        onClick = { onNickname() },
        contentPadding = PaddingValues(horizontal = 40.dp, vertical = 12.5.dp)
    ) {
        Text(
            text = stringResource(com.kojingu.xylo.R.string.button_nickname_screen),
            color = Color.White,
            fontSize = 18.sp
        )
    }
}