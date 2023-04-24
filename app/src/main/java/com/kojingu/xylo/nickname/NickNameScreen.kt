package com.kojingu.xylo.nickname

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kojingu.xylo.nickname.views.ButtonNickname
import com.kojingu.xylo.nickname.views.SearchNickname
import com.kojingu.xylo.nickname.views.TitleNickname

@Composable
fun NicknameScreen(
    viewModel: NicknameViewModel, modifier: Modifier = Modifier
) {
    NicknameScreen(
        search = viewModel.search,
        onSearchChange = { viewModel.search(it) },
        modifier = modifier
    )
}

@Composable
private fun NicknameScreen(
    search: String,
    onSearchChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleNickname()

        Spacer(modifier = modifier.weight(1f))

        SearchNickname(enterSearch = search, onEnterSearch = { onSearchChange(it) })

        Spacer(modifier = modifier.weight(1f))

        ButtonNickname(onNickname = {})
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    NicknameScreen(
        search = "",
        onSearchChange = {}
    )
}