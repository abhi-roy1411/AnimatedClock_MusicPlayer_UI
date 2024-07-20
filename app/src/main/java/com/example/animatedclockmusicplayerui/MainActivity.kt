package com.example.animatedclockmusicplayerui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.animatedclockmusicplayerui.ui.theme.AnalogClock
import com.example.animatedclockmusicplayerui.ui.theme.AnimatedClockMusicPlayerUITheme
import com.example.animatedclockmusicplayerui.ui.theme.AnimatedWaves
import com.example.animatedclockmusicplayerui.ui.theme.DayDateUI
import com.example.animatedclockmusicplayerui.ui.theme.SongDetailsUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedClockMusicPlayerUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(Color.Black)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        DayDateUI()
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            AnalogClock()
                            AnimatedWaves()
                        }
                        SongDetailsUI()
                    }
                }
            }
        }
    }
}
