package com.kojingu.xylo.code

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun GeneratedCode(
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = R.string.generated_code),
        fontSize = 20.sp,
        modifier = modifier.padding(bottom = 20.dp)
    )
}