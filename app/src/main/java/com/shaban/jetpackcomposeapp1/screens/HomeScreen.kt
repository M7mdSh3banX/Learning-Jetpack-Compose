package com.shaban.jetpackcomposeapp1.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.shaban.jetpackcomposeapp1.composable.HelloMessage

@Composable
fun HomeScreen(modifier: Modifier) {
    /*Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        HelloMessage(name = "Mohamed", modifier = modifier)
        HelloMessage(name = "Shaban", modifier = modifier)
        HelloMessage(name = "Ahmed", modifier = modifier)
    }*/

    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        HelloMessage(name = "Mohamed", modifier = modifier)
        HelloMessage(name = "Shaban", modifier = modifier)
    }
}