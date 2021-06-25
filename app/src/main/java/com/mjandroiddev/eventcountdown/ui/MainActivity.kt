package com.mjandroiddev.eventcountdown.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import com.mjandroiddev.eventcountdown.theme.ECDTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ECDTheme {
                Surface {
                    Text(text = "This is test")
                }
            }
        }
    }
}