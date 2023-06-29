package com.shaban.jetpackcomposeapp1.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelloMessage(name: String, modifier: Modifier) {
    Text(text = "Hello, $name", modifier = modifier, style = MaterialTheme.typography.displaySmall)
}

@Composable
@Preview(name = "arabic", locale = "ar")
@Preview(name = "english", locale = "en")
fun PreviewHelloMessage() {
    HelloMessage(name = "Mohamed", modifier = Modifier.padding())
}