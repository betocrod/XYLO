package com.kojingu.xylo.joinfriends

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kojingu.xylo.joinfriends.views.SearchBarFriend
import com.kojingu.xylo.joinfriends.views.TitleFriendScreen

@Composable
fun JoinFriendScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TitleFriendScreen()
        Spacer(modifier = modifier.weight(1f))
        SearchBarFriend(modifier = Modifier)
        Spacer(modifier = modifier.weight(1f))
        ButtonScreen(onButtonJoin = {})
    }
}

@Preview(showSystemUi = true)
@Composable
private fun Preview() {
    JoinFriendScreen()
}
