package com.example.bletutorial.presentation.permissions

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.platform.LocalContext

@Composable
fun SystemBroadcastReceiver(
    systemAction:String,
    onSystemEvent:(intent: Intent?)->Unit
) {

    val context = LocalContext.current

    val currentOnSystemEvent by rememberUpdatedState(onSystemEvent)

    DisposableEffect(context, systemAction){
        val intentFilter = IntentFilter(systemAction)
        val broadcast = object : BroadcastReceiver(){
            override fun onReceive(p0: Context?, intent: Intent?) {
                currentOnSystemEvent(intent)
            }
        }

        context.registerReceiver(broadcast, intentFilter)

        onDispose {
            context.unregisterReceiver(broadcast)
        }

    }
}