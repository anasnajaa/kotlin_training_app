package com.example.demoapp.views.unit2

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demoapp.R
const val TAG = "DiceRollerView"

var result = mutableIntStateOf(1)

@Composable
fun DiceRollerView(modifier: Modifier) {
    DiceWithButtonAndImage(modifier = modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier) {
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        DiceImage(modifier = modifier, diceNumber = result.intValue)
        Button(
            modifier = Modifier.padding(top = 5.dp),
            onClick = {
                rollTheDice()
            }){
            Text(
                "Roll",
            )
        }
    }
}

fun rollTheDice(){
    result.intValue = (1..6).random()
    Log.i(TAG, "Rolled $result")
}

@Composable
fun DiceImage(modifier: Modifier, diceNumber: Int){
    val diceImage = when (diceNumber){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Image(
        painter = painterResource(diceImage),
        contentDescription = "Dice $diceNumber"
    )
}