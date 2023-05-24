package com.scott.smokesville.ui.screens.dashboard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import com.scott.smokesville.ui.theme.appBackgroundColor
import com.scott.smokesville.ui.viewmodels.DashboardViewModel

@Composable
fun DashboardContent(
    dashboardViewModel: DashboardViewModel
) {

}

@Composable
fun DisplayTemp() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.appBackgroundColor,
        shape = RectangleShape
    ) {

    }
}