package com.shaban.jetpackcomposeapp1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shaban.jetpackcomposeapp1.R
import com.shaban.jetpackcomposeapp1.composable.GlowText

@Composable
fun HomeScreen(modifier: Modifier) {
    val textShadowModifier = Modifier
        .shadow(elevation = 12.dp, spotColor = Color.Red)
        .background(color = Color.LightGray)
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            Text(
                modifier = textShadowModifier,
                text = "Hello Shaban",
                fontSize = 20.sp
            )
        }
        Image(
            painter =
            painterResource(id = R.drawable.clarence),
            contentDescription = null,
            modifier = Modifier.size(256.dp)
        )
        GlowText(
            name = "Mohamed",
            modifier = Modifier.background(colorResource(id = R.color.purple_200))
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }) {
            Text(text = "Click Me")
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewHomeScreen() {
    HomeScreen(modifier = Modifier.padding())
}