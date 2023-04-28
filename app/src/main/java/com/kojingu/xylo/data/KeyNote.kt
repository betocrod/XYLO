package com.kojingu.xylo.data

import androidx.compose.ui.graphics.Color
import com.kojingu.xylo.ui.theme.GreenGame
import com.kojingu.xylo.ui.theme.Mainbluestate
import com.kojingu.xylo.ui.theme.OrangeGame
import com.kojingu.xylo.ui.theme.PurpleGame
import com.kojingu.xylo.ui.theme.RedGame
import com.kojingu.xylo.ui.theme.SkyBlueGame
import com.kojingu.xylo.ui.theme.YellowGame

sealed class KeyNote(val name: String, val color: Color) {
    object C : KeyNote("Botón", RedGame)
    object D : KeyNote("Botón", OrangeGame)
    object E : KeyNote("Botón", YellowGame)
    object F : KeyNote("Botón", GreenGame)
    object G : KeyNote("Botón", SkyBlueGame)
    object A : KeyNote("Botón", Mainbluestate)
    object B : KeyNote("Botón", PurpleGame)
}