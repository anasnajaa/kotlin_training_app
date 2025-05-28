package com.example.demoapp.views.unit2

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demoapp.R
import com.example.demoapp.ui.theme.LemonadeButtonColor
import com.example.demoapp.ui.theme.LemonadeNavBarColor

val currentStage = mutableIntStateOf(0)
val lemonSqueezesRemaining = mutableIntStateOf((3..10).random())

val lemonMessages = mutableListOf(
    R.string.tap_the_lemon_tree_to_select_a_lemon,
    R.string.keep_tapping_the_lemon_to_squeeze_it,
    R.string.tap_the_lemonade_to_drink_it,
    R.string.tap_the_empty_glass_to_start_again
)

val lemonImageContentDesc = mutableListOf(
    R.string.lemon_tree,
    R.string.lemon,
    R.string.lemonade_cup_full,
    R.string.lemonade_cup_empty
)

val lemonImages = mutableListOf(
    R.drawable.lemon_tree,
    R.drawable.lemon_squeeze,
    R.drawable.lemon_drink,
    R.drawable.lemon_restart,
)

val ButtonStyle = ButtonColors(
    contentColor = LemonadeButtonColor,
    disabledContentColor = LemonadeButtonColor,
    containerColor = LemonadeButtonColor,
    disabledContainerColor = LemonadeButtonColor,
)

@Composable
fun LemonadeView(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()) {
        Column (
            Modifier
                .fillMaxWidth()
                .background(LemonadeNavBarColor)
        ) {
            Text(
                text = stringResource(R.string.lemonade),
                Modifier
                    .padding(top = 15.dp, bottom = 15.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        Column (
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                onClick = { onButtonClicked() },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier.padding(bottom = 25.dp),
                colors = ButtonStyle
            ) {
                Image(
                    painter = painterResource(lemonImages[currentStage.intValue]),
                    contentDescription = stringResource(lemonImageContentDesc[currentStage.intValue])
                )
            }
            Text(
                text = stringResource(lemonMessages[currentStage.intValue]),
            )
        }
    }
}

fun onButtonClicked(){
    if(currentStage.intValue > 2){
        currentStage.intValue = 0
    }
    else if(currentStage.intValue == 1){
        Log.i("LemonadeView", "Squeezes Remaining: ${lemonSqueezesRemaining.intValue}")
        if(lemonSqueezesRemaining.intValue > 0) {
            lemonSqueezesRemaining.intValue--
        } else {
            currentStage.intValue++
            lemonSqueezesRemaining.intValue = (3..10).random()
        }
    }
    else {
        currentStage.intValue++
    }

    Log.i("LemonadeView", "Current Stage: ${currentStage.intValue}")
}