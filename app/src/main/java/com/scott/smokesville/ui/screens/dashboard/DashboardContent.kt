package com.scott.smokesville.ui.screens.dashboard

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.scott.smokesville.R
import com.scott.smokesville.ui.theme.SmokesvilleTheme
import com.scott.smokesville.ui.theme.appContentColor
import com.scott.smokesville.ui.theme.currentTempColor

@Composable
fun DashboardContent() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        DisplayCurrentTemperature()
        DisplayTargetTemperature()
    }
}

@Composable
fun DisplayTargetTemperature() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.background,
        shape = RectangleShape
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.target_temperature_colon),
                    color = MaterialTheme.colors.appContentColor,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Icon(
                            modifier = Modifier.size(60.dp),
                            painter = painterResource(id = R.drawable.ic_subtract),
                            contentDescription = stringResource(id = R.string.subtract),
                            tint = MaterialTheme.colors.appContentColor
                        )
                    }
                }
                Text(
                    modifier = Modifier.weight(2f),
                    text = "250",
                    color = MaterialTheme.colors.appContentColor,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Icon(
                            modifier = Modifier.size(60.dp),
                            painter = painterResource(id = R.drawable.ic_add),
                            contentDescription = stringResource(id = R.string.subtract),
                            tint = MaterialTheme.colors.appContentColor
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DisplayCurrentTemperature() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.background,
        shape = RectangleShape
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.current_temperature_colon),
                    color = MaterialTheme.colors.appContentColor,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "250",
                    color = MaterialTheme.colors.currentTempColor,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DisplayDashboardContent() {
    SmokesvilleTheme {
        Surface {
            DashboardContent()
        }
    }
}