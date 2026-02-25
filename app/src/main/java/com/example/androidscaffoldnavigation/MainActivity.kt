package com.example.androidscaffoldnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.androidscaffoldnavigation.ui.theme.AndroidScaffoldNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidScaffoldNavigationTheme {
                ScaffoldApp()
            }
        }
    }
}
