package com.CliftonSoftware.hobbsLogger.Screens

sealed class Screen(val route: String){
    object signInScreen : Screen("signIn")
    object homeScreen : Screen("home")
    object settingsScreen : Screen("settings")
    object flightHistoryScreen : Screen("flight_history")
    object editflightHistoryScreen : Screen("edit_flight_history")
    object planesScreen : Screen("planes")
    object addPlaneScreen : Screen("add_plane")
    object editPlaneScreen : Screen("edit_plane")
    object newFlightScreen : Screen("new_flight")
    object pictureScreen: Screen("picture")
}
