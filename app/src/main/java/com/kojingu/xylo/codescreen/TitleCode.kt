package com.kojingu.xylo.codescreen

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
fun TitleCode(
    modifier: Modifier = Modifier
){
    Surface(
        modifier = modifier.padding(top = 15.dp)
    ){
        Text(
            text = stringResource(id = R.string.titulo_code_screen),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}