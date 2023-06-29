package com.shaban.jetpackcomposeapp1.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelloMessage(name: String) {
    Text(
        text = "Hello, $name",
        color = Color.Black,
    )
}

@Composable
@Preview(name = "arabic", locale = "ar")
@Preview(name = "english", locale = "en")
fun PreviewHelloMessage() {
    HelloMessage(name = "Mohamed")
}