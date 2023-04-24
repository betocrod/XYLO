package com.kojingu.xylo.creategame.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TitleCreateGame(
    modifier: Modifier = Modifier
){
    Surface(
        modifier = modifier.padding(top = 40.dp)
    ) {
        Text(
            text = stringResource(id = R.string.title_create_game),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}