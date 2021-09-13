package com.CliftonSoftware.hobbsLogger.Fragments

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CustomListItem(title: String, time:String) {
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
                Text(text = title,
                    style = MaterialTheme.typography.h3,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = time,
                    style = MaterialTheme.typography.h3,
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