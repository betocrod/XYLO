package com.kojingu.xylo.creategamescreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kojingu.xylo.R

@Composable
fun ButtonCreateGame(
    modifier: Modifier = Modifier,
    onCreateGame: () -> Unit = {}
){
    Surface(
        modifier = modifier.padding(bottom = 80.dp)
    ) {
        Button(
            onClick = { onCreateGame },
            contentPadding = PaddingValues(horizontal = 34.dp, vertical = 12.4.dp)
        ) {
            Text(text = stringResource(id = R.string.button_create_game))
        }
    }
}
