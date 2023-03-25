package com.kojingu.xylo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Preview(showSystemUi = true)
@Composable
fun CreateGameScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleCreateGame()
        Spacer(modifier = Modifier.weight(1f))
        SearchCreateGame()
        Spacer(modifier = Modifier.weight(1f))
        ButtonCreateGame()
    }
}

@Composable
fun TitleCreateGame(){
    Surface(
        modifier = Modifier.padding(top = 40.dp)
    ) {
        Text(
            text = "Xylo",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

@Composable
fun SearchCreateGame(){
    Column{
        var enterNickname by remember { mutableStateOf("") }
        OutlinedTextField(
            value = enterNickname,
            onValueChange = { enterNickname = it },
            singleLine = true,
            placeholder = { Text(text = stringResource(R.string.enter_your_nickname))},
            modifier = Modifier.padding(bottom = 14.dp)
        )

        var rounds by remember { mutableStateOf("") }
        OutlinedTextField(
            value = rounds,
            onValueChange = { rounds = it },
            singleLine = true,
            placeholder = { Text(text = "How many rounds?") }
        )
    }
}

@Composable
fun ButtonCreateGame(){
    Surface(
        modifier = Modifier.padding(bottom = 80.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(horizontal = 34.dp, vertical = 12.4.dp)
        ) {
            Text(text = "Let's go!")
        }
    }
}
