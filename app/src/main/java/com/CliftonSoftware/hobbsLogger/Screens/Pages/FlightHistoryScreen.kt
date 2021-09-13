package com.CliftonSoftware.hobbsLogger.Screens.Pages

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.CliftonSoftware.hobbsLogger.Data.DataProvider
import com.CliftonSoftware.hobbsLogger.Fragments.CustomListItem


@Composable
fun FlightHistoryScreen(navController: NavController) {
    FlightHistoryContent()
}

@Preview(
    showBackground = true
)
@Composable
fun FlightHistoryContent(){

}

