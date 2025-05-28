package com.example.demoapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demoapp.R

@Composable
fun BusinessCardView(modifier: Modifier) {
    val image = painterResource(R.drawable.ying_yang)
    Column (
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        ) {

        Column (
            Modifier
                .weight(1f, true)
                .fillMaxWidth(),
            verticalArrangement =  Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                modifier = Modifier.padding(bottom = 5.dp),
                painter = image,
                contentDescription = stringResource(R.string.ying_yang),
                contentScale = ContentScale.Fit,
            )

            Text(
                modifier = Modifier.padding(bottom = 5.dp),
                text = stringResource(R.string.anas_najaa),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(bottom = 5.dp),
                text = stringResource(R.string.somebody)
            )
        }

        Column (
            Modifier
                .weight(.2f)
                .fillMaxWidth(),
            verticalArrangement =  Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Column {
                Row {
                    Icon(
                        Icons.Filled.Call,
                        contentDescription = stringResource(R.string.call),
                        Modifier.padding(end = 10.dp)
                    )
                    Text(
                        stringResource(R.string._00_00_000_000)
                    )
                }
                Row {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = stringResource(R.string.social),
                        Modifier.padding(end = 10.dp)
                    )
                    Text(
                        stringResource(R.string.anasnajaa)
                    )
                }
                Row {
                    Icon(
                        Icons.Filled.Email,
                        contentDescription = stringResource(R.string.mail),
                        Modifier.padding(end = 10.dp)
                    )
                    Text(
                        stringResource(R.string.anas_najaa_org)
                    )
                }
            }
        }
    }
}