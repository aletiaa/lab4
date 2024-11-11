package com.example.lab4.utils

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab4.MainFunctionality
import com.example.lab4.calculateCurrent.CalculateCurrentView
import com.example.lab4.chooseCabel.ChooseCableView
import com.example.lab4.calculateOn10.CalculateCurrentOnTenView

@Composable
fun NavigationApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainFunctionality(navController) }
        composable("chooseCable") { ChooseCableView() }
        composable("calculateOn10") { CalculateCurrentOnTenView() }
        composable("calculateCurrent") { CalculateCurrentView() }
    }
}