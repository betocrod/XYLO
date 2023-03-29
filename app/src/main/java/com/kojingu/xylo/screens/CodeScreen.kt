package com.kojingu.xylo.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R
import com.kojingu.xylo.ui.theme.Mainbluestate

@Preview(showSystemUi = true)
@Composable
fun CodeScreen(
    code: String = "WXYZ",
    username: String = "Reno",
    friends: List<String> = listOf("Rene", "Natha", "Sam", "Gabo")
){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ){
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TituloCodeScreen()

            Spacer(modifier = Modifier.weight(0.55f))

            GreetingCodeScreen(username)

            Spacer(modifier = Modifier.weight(1.5f))

            GeneratedCode()
            YourCode(code = code)

            Spacer(modifier = Modifier.weight(0.4f))

            ListUsers(friends)

            Spacer(modifier = Modifier.weight(1f))
            ButtonCodeScreen(onYouReady = {})
        }
    }
}

@Composable
fun TituloCodeScreen(){
    Surface(
        modifier = Modifier.padding(top = 15.dp)
    ){
        Text(
            text = stringResource(id = R.string.titulo_code_screen),
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

@Composable
fun GreetingCodeScreen(
    codeUserGreeting: String
){
    Text(
        text = stringResource(id = R.string.greeting_code_screen, codeUserGreeting),
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun GeneratedCode(){
    Text(
        text = stringResource(id = R.string.generated_code),
        fontSize = 20.sp,
        modifier = Modifier.padding(bottom = 20.dp)
    )
}

@Composable
fun YourCode( code: String ){
    Text(
        text = code,
        fontSize = 40.sp,
        modifier = Modifier
            .border(width = 1.5.dp, color = Color.Black)
            .padding(horizontal = 30.dp, vertical = 15.dp),
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ListUsers(userList: List<String>){
    for (names in userList) {
        Text(
            text = stringResource(id = R.string.list_users, userList),
            fontSize = 20.sp
        )
    }
}

@Composable
fun ButtonCodeScreen(
    onYouReady: () -> Unit
){
    Button(
        modifier = Modifier.padding(bottom = 80.dp),
        contentPadding = PaddingValues(vertical = 12.5.dp, horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
        onClick = { onYouReady() }) {
        Text(
            text = stringResource(id = R.string.button_code_screen),
            color = Color.White,
            fontSize = 20.sp
        )
    }
}