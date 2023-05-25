package com.scott.smokesville.ui.screens.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.scott.smokesville.R
import com.scott.smokesville.ui.theme.appBackgroundColor
import com.scott.smokesville.ui.theme.appContentColor
import com.scott.smokesville.ui.viewmodels.DashboardViewModel

@Composable
fun DashboardContent(
    dashboardViewModel: DashboardViewModel
) {

}

@Composable
fun DisplayTemperature() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.appBackgroundColor,
        shape = RectangleShape
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_subtract),
                        contentDescription = stringResource(id = R.string.subtract),
                        tint = MaterialTheme.colors.appContentColor
                    )
                }
                Text(
                    text = "74",
                    color = MaterialTheme.colors.appContentColor,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold
                )
                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_add),
                        contentDescription = stringResource(id = R.string.subtract),
                        tint = MaterialTheme.colors.appContentColor
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayTemperaturePreview() {
    DisplayTemperature()
}