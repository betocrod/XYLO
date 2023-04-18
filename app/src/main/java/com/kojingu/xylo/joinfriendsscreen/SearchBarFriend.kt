package com.kojingu.xylo.joinfriendsscreen

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.kojingu.xylo.R

@Composable
fun SearchBarFriend(
    modifier: Modifier = Modifier
) {
    var state by remember { mutableStateOf("") }
    OutlinedTextField(
        value = state,
        onValueChange = { state = it },
        modifier = modifier,
        placeholder = { Text(text = stringResource(R.string.search_bar)) },
        singleLine = true
    )

}
