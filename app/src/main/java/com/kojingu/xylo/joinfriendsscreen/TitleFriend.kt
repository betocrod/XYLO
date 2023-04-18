package com.kojingu.xylo.joinfriendsscreen

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
fun TitleFriendScreen(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.padding(top = 20.dp)
    ) {
        Text(
            text = stringResource(R.string.title_screen),
            modifier = modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}