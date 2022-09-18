package com.example.bletutorial.data

data class TempHumidityResult(
    val temperature:Float,
    val humidity:Float,
    val connectionState: ConnectionState
)
