package com.shaban.jetpackcomposeapp1.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shaban.jetpackcomposeapp1.composable.HelloMessage

@Composable
fun HomeScreen(modifier: Modifier) {
    HelloMessage(name = "Mohamed", modifier = modifier)
}