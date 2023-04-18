package com.kojingu.xylo.NicknameScreen

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
fun ButtonNickname(
    modifier: Modifier = Modifier,
    onNickname: () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
        modifier = modifier.padding(bottom = 80.dp),
        onClick = { onNickname() },
        contentPadding = PaddingValues(horizontal = 40.dp, vertical = 12.5.dp)
    ) {
        Text(
            text = stringResource(R.string.button_nickname_screen),
            color = Color.White,
            fontSize = 18.sp
        )
    }
}
