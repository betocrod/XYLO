package com.kojingu.xylo.nickname.views

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import com.kojingu.xylo.R

@Composable
fun SearchNickname(
    enterSearch: String,
    onEnterSearch: (wanted: String) -> Unit = {}
) {
    OutlinedTextField(
        value = enterSearch,
        onValueChange = { onEnterSearch(it) },
        placeholder = { Text(text = stringResource(R.string.search_nickname_screen)) }
    )
}
