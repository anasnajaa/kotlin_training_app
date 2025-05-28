package com.example.demoapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demoapp.R

@Composable
fun TaskCompleteView(modifier: Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column (
        modifier = modifier.fillMaxSize(),
        Arrangement.Center){
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = image,
            contentDescription = "",
            alignment = Alignment.Center
        )
        Text(
            text = stringResource(R.string.all_tasks_completed),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                top = 24.dp,
                bottom = 8.dp
            ).fillMaxWidth(),
        )
        Text(
            text = stringResource(R.string.nice_work),
            modifier = Modifier.fillMaxWidth(),
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
        )
    }
}