package com.kojingu.xylo.nickname.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TitleNickname(
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier.padding(top = 25.dp),
        text = stringResource(R.string.title_nickname_screen),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
}
