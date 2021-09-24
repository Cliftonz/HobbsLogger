package com.CliftonSoftware.hobbsLogger.Screens.Pages

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.CliftonSoftware.hobbsLogger.Components.CustomListItem
import com.CliftonSoftware.hobbsLogger.Data.DataProvider

@Composable
fun HomeScreen(navController: NavController) {
    HomeContent()
}

@Preview(
    showBackground = true
)
@Composable
fun HomeContent(){
    val flights = remember { DataProvider.flightList}
    LazyColumn(

    ){
        items(
            items = flights,
            itemContent = {
                CustomListItem(title = "#" + it.flightNumber.toString(),
                               time =  it.hobbsTime.toString() + "hrs")
            }
        )
    }
}




