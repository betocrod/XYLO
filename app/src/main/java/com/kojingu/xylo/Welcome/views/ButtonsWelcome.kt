package com.kojingu.xylo.Welcome

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kojingu.xylo.R
import com.kojingu.xylo.ui.theme.Mainbluestate

@Composable
fun ButtonsWelcome(
    modifier: Modifier = Modifier,
    onJoinClick: () -> Unit, onNewGameClick: () -> Unit
) {
    Column(
        modifier = modifier.padding(top = 145.dp, bottom = 18.dp)
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Mainbluestate),
            onClick = { onJoinClick() },
            contentPadding = PaddingValues(horizontal = 24.5.dp, vertical = 18.dp)
        ) {
            Text(
                text = stringResource(R.string.button_join), color = Color.White
            )
        }

        Spacer(
            modifier = modifier.padding(9.dp)
        )

        OutlinedButton(
            onClick = { onNewGameClick() }, contentPadding = PaddingValues(18.dp)
        ) {
            Text(
                text = stringResource(R.string.button_new_game), color = Mainbluestate
            )
        }
    }
}
