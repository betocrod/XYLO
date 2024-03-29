package com.kojingu.xylo.standby

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun StandbyScreen(
    modifier: Modifier = Modifier,
    viewModel: StandbyViewModel
){
    StandbyScreen(
        name = viewModel.name, modifier = modifier
    )
}

@Composable
fun StandbyScreen(
    modifier: Modifier = Modifier,
    name: String
){
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleStandby()
        Spacer(modifier = modifier.weight(0.7f))
        TextStandby(  userName = name  )
        IconStandby()
        Spacer(modifier = modifier.weight(1f))
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview(){
    StandbyScreen(
        name = "Reno")
}