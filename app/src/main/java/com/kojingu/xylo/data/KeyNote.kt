package com.kojingu.xylo.data

import androidx.compose.ui.graphics.Color

sealed class KeyNote(val name: String, val color: Color) {

    object C : KeyNote("C", Color.Red)
    object D : KeyNote("D", Color.DarkGray)
    object E : KeyNote("E", Color.White)
    object F : KeyNote("F", Color.Black)
    object G : KeyNote("G", Color.Blue)
    object A : KeyNote("A", Color.Cyan)
    object B : KeyNote("B", Color.LightGray)
}

fun main() {
    val note: KeyNote = KeyNote.F
    when(note) {
        KeyNote.C -> {
            println("this note is Do")
        }
        KeyNote.D -> {
            println("this note is Re")
        }
        KeyNote.E -> {
            println("this note is Mi")
        }
        KeyNote.G -> {
            println("this note is Sol")
        }
        KeyNote.A -> {
            println("this note is La")
        }
        KeyNote.B -> {
            println("this note is Si")
        }

        KeyNote.F -> {

        }
    }
}