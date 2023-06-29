@file:OptIn(ExperimentalMaterial3Api::class)

package com.shaban.jetpackcomposeapp1

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shaban.jetpackcomposeapp1.screens.HomeScreen
import com.shaban.jetpackcomposeapp1.ui.theme.JetpackComposeApp1Theme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    JetpackComposeApp1Theme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "My Application")
                    },
                    // colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green)
                )
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Rounded.Add, contentDescription = "Add")
                }
            }
        ) {
            HomeScreen(Modifier.padding(it))
        }
    }
}