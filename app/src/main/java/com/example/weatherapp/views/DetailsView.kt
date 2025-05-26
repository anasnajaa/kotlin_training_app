package com.example.weatherapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R

@Composable
fun DetailsView(modifier: Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column (modifier = modifier) {
        Image(
            painter = image,
            contentDescription = "",
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            fontSize = 24.sp,
        )

        Text(
            modifier = modifier.padding(start = 15.dp, end = 15.dp),
            text = stringResource(R.string.p_1),
            textAlign = TextAlign.Justify
        )

        Text(
            modifier = modifier.padding(16.dp),
            text = stringResource(R.string.p_2)
        )

    }



}