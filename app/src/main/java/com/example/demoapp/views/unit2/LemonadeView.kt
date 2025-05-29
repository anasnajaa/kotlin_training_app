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
import com.example.demoapp.ui.theme.LemonadeButtonColor0
import com.example.demoapp.ui.theme.LemonadeButtonColor1
import com.example.demoapp.ui.theme.LemonadeButtonColor10
import com.example.demoapp.ui.theme.LemonadeButtonColor2
import com.example.demoapp.ui.theme.LemonadeButtonColor3
import com.example.demoapp.ui.theme.LemonadeButtonColor4
import com.example.demoapp.ui.theme.LemonadeButtonColor5
import com.example.demoapp.ui.theme.LemonadeButtonColor6
import com.example.demoapp.ui.theme.LemonadeButtonColor7
import com.example.demoapp.ui.theme.LemonadeButtonColor8
import com.example.demoapp.ui.theme.LemonadeButtonColor9
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

val defaultButtonStyle = ButtonColors(
    contentColor = LemonadeButtonColor,
    disabledContentColor = LemonadeButtonColor,
    containerColor = LemonadeButtonColor,
    disabledContainerColor = LemonadeButtonColor,
)

val buttonStyles = mutableListOf(
    ButtonColors(
        contentColor = LemonadeButtonColor0,
        disabledContentColor = LemonadeButtonColor0,
        containerColor = LemonadeButtonColor0,
        disabledContainerColor = LemonadeButtonColor0,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor1,
        disabledContentColor = LemonadeButtonColor1,
        containerColor = LemonadeButtonColor1,
        disabledContainerColor = LemonadeButtonColor1,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor2,
        disabledContentColor = LemonadeButtonColor2,
        containerColor = LemonadeButtonColor2,
        disabledContainerColor = LemonadeButtonColor2,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor3,
        disabledContentColor = LemonadeButtonColor3,
        containerColor = LemonadeButtonColor3,
        disabledContainerColor = LemonadeButtonColor3,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor4,
        disabledContentColor = LemonadeButtonColor4,
        containerColor = LemonadeButtonColor4,
        disabledContainerColor = LemonadeButtonColor4,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor5,
        disabledContentColor = LemonadeButtonColor5,
        containerColor = LemonadeButtonColor5,
        disabledContainerColor = LemonadeButtonColor5,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor6,
        disabledContentColor = LemonadeButtonColor6,
        containerColor = LemonadeButtonColor6,
        disabledContainerColor = LemonadeButtonColor6,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor7,
        disabledContentColor = LemonadeButtonColor7,
        containerColor = LemonadeButtonColor7,
        disabledContainerColor = LemonadeButtonColor7,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor8,
        disabledContentColor = LemonadeButtonColor8,
        containerColor = LemonadeButtonColor8,
        disabledContainerColor = LemonadeButtonColor8,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor9,
        disabledContentColor = LemonadeButtonColor9,
        containerColor = LemonadeButtonColor9,
        disabledContainerColor = LemonadeButtonColor9,
    ),
    ButtonColors(
        contentColor = LemonadeButtonColor10,
        disabledContentColor = LemonadeButtonColor10,
        containerColor = LemonadeButtonColor10,
        disabledContainerColor = LemonadeButtonColor10,
    ))

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
                colors = getButtonStyle()
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

fun getButtonStyle(): ButtonColors{
    if(currentStage.intValue == 1){
        return buttonStyles[lemonSqueezesRemaining.intValue]
    } else {
        return defaultButtonStyle
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