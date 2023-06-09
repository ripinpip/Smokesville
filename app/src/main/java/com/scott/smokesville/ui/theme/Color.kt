package com.scott.smokesville.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val DarkRed = Color(0xFF8B0000)

val Colors.currentTempColor: Color
    @Composable
    get() = DarkRed

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if(isLight) Color.White else LightGray

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if(isLight) Purple500 else Color.Black

val Colors.appContentColor: Color
    @Composable
    get() = if(isLight) Color.Black else Color.White