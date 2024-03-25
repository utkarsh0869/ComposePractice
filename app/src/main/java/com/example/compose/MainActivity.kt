package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * The setContent block defines the activity's layout where composable functions are called.
         * Composable functions can only be called from other composable functions.
         *
         * It's a special entry point provided by the Compose framework within our Activity or
         * Composable class. Its role is to define the root composable function that will be used
         * to build the UI for our screen.
         */
        setContent {
            Text("Hello World!")
        }
    }
}