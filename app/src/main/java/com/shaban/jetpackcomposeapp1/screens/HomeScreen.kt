package com.shaban.jetpackcomposeapp1.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(modifier: Modifier) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Cyan),
            text = "Hello Mohamed"
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click Me")
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewHomeScreen() {
    HomeScreen(modifier = Modifier.padding())
}