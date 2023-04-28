package com.kojingu.xylo.code

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R
import com.kojingu.xylo.ui.theme.Mainbluestate

@Composable
fun ButtonCode(
    modifier: Modifier = Modifier,
    onYouReady: () -> Unit
){
    Button(
        modifier = modifier.padding(bottom = 80.dp),
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
