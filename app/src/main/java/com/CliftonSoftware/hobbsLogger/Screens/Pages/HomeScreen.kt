package com.CliftonSoftware.hobbsLogger.Screens.Pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.CliftonSoftware.hobbsLogger.Data.DataProvider
import com.CliftonSoftware.hobbsLogger.Data.Flight

@Composable
fun HomeScreen(navController: NavController) {
    HomeContent()
}

@Preview(
    showBackground = true
)
@Composable
fun HomeContent(){
    val flights = remember {DataProvider.flightList}
    LazyColumn(

    ){
        items(
            items = flights,
            itemContent = {
                FlightListItem(flight = it)
            }
        )
    }
}

@Composable
fun FlightListItem(flight: Flight) {
    Card(
        modifier = Modifier.padding(horizontal = 25.dp, vertical = 10.dp).fillMaxWidth(),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        border = BorderStroke(3.dp, Color.Black),
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                //.padding(50.dp)
                //.align(Alignment.CenterVertically)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "#" + flight.flightNumber.toString(),
                    style = typography.h3,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = flight.hobbsTime.toString() + "hrs",
                    style = typography.h4,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                                .weight(1f)
                                .padding(end = 4.dp)
                                .wrapContentWidth(Alignment.End),

                )
            }
        }
    }
}


