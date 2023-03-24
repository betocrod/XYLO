package com.kojingu.xylo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.R
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.ui.theme.Mainbluestate

@Preview(showSystemUi = true)
@Composable
fun JoinFriend() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TitleScreen()
            Spacer(modifier = Modifier.weight(1f))
            SearchBar(modifier = Modifier)
            Spacer(modifier = Modifier.weight(1f))
            ButtonScreen(
                onButtonJoin = {}
            )
        }
    }
}
@Composable
fun TitleScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.padding(top = 20.dp)
    ) {
    Text(
        text = stringResource(com.kojingu.xylo.R.string.title_screen),
        modifier = modifier,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    var state by remember { mutableStateOf("") }
    OutlinedTextField (
        value = state,
        onValueChange = { state = it },
        modifier = modifier,
        placeholder = { Text(text = stringResource(com.kojingu.xylo.R.string.search_bar))},
        singleLine = true
    )

}

@Composable
fun ButtonScreen(
    onButtonJoin: () -> Unit,
    modifier: Modifier = Modifier
)
{
    Surface(
        modifier = Modifier.padding(bottom = 40.dp)
    ) {
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate) ,
        modifier = Modifier.padding(bottom = 18.dp),
        contentPadding = PaddingValues(horizontal = 50.dp, vertical = 12.5.dp),
        onClick = { onButtonJoin() }) {
        Text(
            text = stringResource(com.kojingu.xylo.R.string.button_join_screem),
            color = Color.White
        )
     }
    }
}


