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
