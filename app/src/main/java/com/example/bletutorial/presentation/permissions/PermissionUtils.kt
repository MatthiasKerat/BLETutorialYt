package com.example.bletutorial.presentation.permissions

import android.Manifest
import android.os.Build

object PermissionUtils {

    val permissions = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
        listOf(
            Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT,
            Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
        )
    }else{
        listOf(
            Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
        )
    }

}