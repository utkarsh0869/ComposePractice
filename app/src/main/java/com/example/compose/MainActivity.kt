package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
//            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Contact profile picture")

        /**
         * The Column function lets us arrange elements vertically. Add Column to the MessageCard function.
         * We can use Row to arrange items horizontally and Box to stack elements.
         */
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }

}

/**
 * The @Preview annotation lets us preview our composable functions within Android Studio without
 * having to build and install the app to an Android device or emulator. The annotation must be used
 * on a composable function that does not take in parameters.
 */
@Preview
@Composable
fun PreviewMessage() {
    MessageCard(
        msg = Message("Utkarsh ", "Hey, take a look at Jetpack Compose, its great!") )
}