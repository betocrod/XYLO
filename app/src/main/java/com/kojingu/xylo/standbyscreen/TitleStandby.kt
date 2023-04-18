package com.kojingu.xylo.standbyscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun TitleStandby(
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(R.string.title_standby_screen),
        modifier = modifier.padding(top = 25.dp),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}
