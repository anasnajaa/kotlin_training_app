package com.example.demoapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demoapp.R

@Composable
fun HomeView(modifier: Modifier) {
    Surface (
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background) {
        Box(
            Modifier.fillMaxSize()
        ){
            GreetingImage()
            GreetingMessage(
                Modifier.align(Alignment.Center),
                stringResource(R.string.hello_anas),
                stringResource(R.string.emma)
            )
        }

    }
}

@Composable
fun GreetingMessage(modifier: Modifier,
                    message: String,
                    from: String){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(19.dp)
    ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(8.dp)
        )
        Text(
            text = "From $from",
            fontSize = 26.sp,
            textAlign = TextAlign.End,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun GreetingImage(){
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = "Test image",
        contentScale = ContentScale.Crop
    )
}