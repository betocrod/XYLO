package com.kojingu.xylo.Welcome

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TitleWelcome(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.Transparent,
        modifier = modifier.padding(bottom = 160.dp, top = 170.dp)
    ) {
        Text(
            text = stringResource(R.string.title_app),
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
