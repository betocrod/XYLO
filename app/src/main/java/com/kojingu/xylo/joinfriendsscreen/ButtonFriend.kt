package com.kojingu.xylo.joinfriendsscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kojingu.xylo.R
import com.kojingu.xylo.ui.theme.Mainbluestate

@Composable
fun ButtonScreen(
    onButtonJoin: () -> Unit, modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.padding(bottom = 40.dp)
    ) {
        Button(colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
            modifier = Modifier.padding(bottom = 18.dp),
            contentPadding = PaddingValues(horizontal = 50.dp, vertical = 12.5.dp),
            onClick = { onButtonJoin() }) {
            Text(
                text = stringResource(R.string.button_join_screem), color = Color.White
            )
        }
    }
}