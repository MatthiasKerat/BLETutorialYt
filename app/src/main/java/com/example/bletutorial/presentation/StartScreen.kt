package com.example.bletutorial.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun StartScreen(
    navController: NavController
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .background(Color.Blue, CircleShape)
                .clickable {
                    navController.navigate(Screen.TemperatureHumidityScreen.route){
                        popUpTo(Screen.StartScreen.route){
                            inclusive = true
                        }
                    }
                },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Start",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }

}






