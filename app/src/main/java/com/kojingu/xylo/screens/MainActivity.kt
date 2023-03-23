
package com.kojingu.xylo.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
@Preview(showSystemUi = true)
@Composable
fun Preview() {
    XYLOTheme {
        WelcomeScreen()
    }
}