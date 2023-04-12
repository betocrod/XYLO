package com.kojingu.xylo.screens

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
fun MainGameScreen(){
    Column(
      modifier = Modifier.fillMaxSize(),
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
fun TitleMainGame() {
    Text(
        modifier = Modifier.padding(top = 20.dp, bottom = 15.dp),
        text = "Xylo",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun TextMainGame() {
    Text(
        text = "Discover your friend sonata!",
        modifier = Modifier,
        fontSize = 18.sp
    )
    Text(
        modifier = Modifier.padding(bottom = 15.dp),
        text = "♫",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ButtonsMainGame() {
    Melody(
        note = Notes.C,
        contentPadding = PaddingValues(horizontal = 125.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    Melody(
        note = Notes.D,
        contentPadding = PaddingValues(horizontal = 120.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    Melody(
        note = Notes.E,
        contentPadding = PaddingValues(horizontal = 115.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    Melody(
        note = Notes.F,
        contentPadding = PaddingValues(horizontal = 110.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    Melody(
        note = Notes.G,
        contentPadding = PaddingValues(horizontal = 105.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp))

    Melody(
        note = Notes.A,
        contentPadding = PaddingValues(horizontal = 100.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp)
    )
    Melody(
        note = Notes.B,
        contentPadding = PaddingValues(horizontal = 95.dp, vertical = 12.5.dp),
        modifier = Modifier.padding(4.5.dp)
    )

}

@Composable
private fun Melody(
    note: Notes,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(backgroundColor = note.color)
    ) {
        Text(
            text = note.name,
            fontSize = 18.sp,
            color = Color.White
        )
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







@Composable
fun CountdownMainGame(
    seconds: Int
) {
    Text(
        text = "You have $seconds seconds left to guess",
        modifier = Modifier.padding(top = 10.dp, bottom = 20.dp)
    )
}

@Composable
fun ButtonGoMainGame(
    tryiItOut: () -> Unit = {}
) {

    Button(
        enabled = false,
        onClick = { tryiItOut() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
        contentPadding = PaddingValues(horizontal = 90.dp, vertical = 12.5.dp)
    ) {
        Text(
            text = "Try it out!",
            fontSize = 18.sp,
            color = Color.White
        )
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