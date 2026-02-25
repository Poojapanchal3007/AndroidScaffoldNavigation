package com.example.androidscaffoldnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidscaffoldnavigation.ui.screens.InfoScreen
import com.example.androidscaffoldnavigation.ui.screens.MainScreen
import com.example.androidscaffoldnavigation.ui.screens.SettingsScreen

@Composable
fun ScaffoldApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") { MainScreen(navController) }
        composable(route = "info") { InfoScreen(navController) }
        composable(route = "settings") { SettingsScreen(navController) }
    }
}
