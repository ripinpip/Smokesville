package com.scott.smokesville.ui.screens.dashboard

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.scott.smokesville.ui.theme.topAppBarBackgroundColor
import com.scott.smokesville.ui.theme.topAppBarContentColor
import com.scott.smokesville.ui.viewmodels.DashboardViewModel

@Composable
fun DashboardAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Dashboard",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Preview
@Composable
fun PreviewDashboardAppBar() {
    DashboardAppBar()
}