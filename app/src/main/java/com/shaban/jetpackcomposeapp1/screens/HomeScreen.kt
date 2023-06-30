package com.shaban.jetpackcomposeapp1.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(modifier: Modifier) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            modifier = Modifier
                .background(color = Color.Gray)
                .width(200.dp)
                .height(100.dp),
            text = "Hello Mohamed",
            fontSize = 24.sp
        )
        Text(
            modifier = Modifier
                .background(color = Color.Gray)
                .size(width = 96.dp, height = 128.dp),
            text = "Hello Shaban",
            fontSize = 20.sp
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