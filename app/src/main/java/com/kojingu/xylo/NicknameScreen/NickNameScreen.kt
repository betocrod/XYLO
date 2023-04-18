package com.kojingu.xylo.NicknameScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NicknameScreen(
    modifier: Modifier = Modifier
){
    var search by remember { mutableStateOf("") }
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TitleNickname()

        Spacer(modifier = modifier.weight(1f))

        SearchNickname(
            enterSearch = search,
            onEnterSearch = { search = it }
        )

        Spacer(modifier = modifier.weight(1f))

        ButtonNickname( onNickname = {} )
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview(){
    NicknameScreen()
}