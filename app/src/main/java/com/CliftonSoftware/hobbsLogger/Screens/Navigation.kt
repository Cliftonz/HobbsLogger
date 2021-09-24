package com.CliftonSoftware.hobbsLogger.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.CliftonSoftware.hobbsLogger.Screens.Pages.*



@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.signInScreen.route){
        composable(route = Screen.signInScreen.route){
            SignInScreen(navController = navController)
        }

        composable(route = Screen.homeScreen.route){
            HomeScreen(navController = navController)
        }







    }


}