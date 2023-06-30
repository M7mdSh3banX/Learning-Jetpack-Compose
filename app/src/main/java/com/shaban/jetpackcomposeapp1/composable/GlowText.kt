package com.shaban.jetpackcomposeapp1.composable

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shaban.jetpackcomposeapp1.modifiers.blueLight

@Composable
fun GlowText(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier
            .clickable {
                Log.e("CLICKABLE", "Hello I'm Clickable")
            }
            .fillMaxWidth()
            .blueLight()
            .padding(16.dp),
        text = "Hello $name",
        fontSize = 24.sp
    )
}