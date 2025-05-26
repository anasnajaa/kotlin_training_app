package com.example.weatherapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.weatherapp.R

@Composable
fun TaskCompleteView(modifier: Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Row (modifier = modifier,
        verticalAlignment = Alignment.CenterVertically){
        Image(
            painter = image,
            contentDescription = ""
        )

    }
}