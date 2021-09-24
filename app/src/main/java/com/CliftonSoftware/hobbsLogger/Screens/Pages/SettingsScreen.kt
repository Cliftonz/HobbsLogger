package com.CliftonSoftware.hobbsLogger.Screens.Pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.ModeNight
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.CliftonSoftware.hobbsLogger.Data.DataProvider
import com.alorma.settings.composables.SettingsSwitch

@Composable
fun SettingsScreen(navController: NavController) {
    SettingScreenContent()
}

@Preview(
    showBackground = true
)
@Composable
fun SettingScreenContent(){
    val darkTheme = remember {false}
    var icon = remember{Icons.Default.ModeNight}
    Column() {
        SettingsSwitch(
            icon = {
                Icon(imageVector = icon , contentDescription = "Wifi")
           },
            title = { Text(text = "Dark Theme") },
            //subtitle = { Text(text = "This is a longer text") },
            checked = darkTheme,
            onCheckedChange = {
                icon = if(icon == Icons.Default.ModeNight){
                    Icons.Default.LightMode
                }else{
                    Icons.Default.ModeNight
                }
            },
        )
    }
}