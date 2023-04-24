package com.kojingu.xylo.code

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.kojingu.xylo.R

@Composable
fun ListUsers(
    userList: List<String>
) {
    for (names in userList) {
        Text(
            text = stringResource(id = R.string.list_users, names), fontSize = 20.sp
        )
    }
}
