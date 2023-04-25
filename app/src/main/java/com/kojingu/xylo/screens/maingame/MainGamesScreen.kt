package com.kojingu.xylo.screens.maingame

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.ui.theme.*

@Preview(showSystemUi = true)
@Composable
fun MainGameScreen(
    modifier: Modifier = Modifier
){
    Column(
      modifier = modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally
    ){

        TitleMainGame()
        TextMainGame()
        ButtonsMainGame()
        OrderMainGame(
            note1 = null,
            note2 = null,
            note3 = null,
            note4 = null)
        CountdownMainGame(20)
        ButtonGoMainGame()
    }
}




@Composable
fun OrderMainGame(
    note1: Notes?,
    note2: Notes?,
    note3: Notes?,
    note4: Notes?
) {
    Row {
        ColorChangingButton(notes = note1, oncolorclick = { note -> println(note) })
        ColorChangingButton(notes = note2, oncolorclick = { note -> println(note) })
        ColorChangingButton(notes = note3, oncolorclick = { note -> println(note) })
        ColorChangingButton(notes = note4, oncolorclick = { note -> println(note) })
    }
}

@Composable
fun ColorChangingButton(notes: Notes?, oncolorclick: (Notes) -> Unit) {
    var isSelected by remember { mutableStateOf( notes?.color ) }

    Button(
        onClick = {
            isSelected = notes?.color
            notes?.let { oncolorclick(it) }
                  },
        colors = if (notes == null) ButtonDefaults.buttonColors(backgroundColor = Color.Gray) else ButtonDefaults.buttonColors( notes.color )
    ) {
        Text(text = "Botón")
    }
}

sealed class Notes(val name: String, val color: Color) {
    object C: Notes("Botón", RedGame)
    object D: Notes("Botón", OrangeGame)
    object E: Notes("Botón", YellowGame)
    object F: Notes("Botón", GreenGame)
    object G: Notes("Botón", SkyBlueGame)
    object A: Notes("Botón", Mainbluestate)
    object B: Notes("Botón", PurpleGame)
}