package com.kojingu.xylo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.kojingu.xylo.Welcome.WelcomeScreen
import com.kojingu.xylo.ui.theme.XYLOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XYLOTheme {
                    WelcomeScreen()
                }
            }
        }
    }
@Composable
fun Preview() {
    XYLOTheme {
        WelcomeScreen()
    }
}