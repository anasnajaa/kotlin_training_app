package com.example.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.demoapp.domain.usecase.Unit2UseCases
import com.example.demoapp.ui.theme.DemoAppTheme
import com.example.demoapp.views.unit1.BusinessCardView
import com.example.demoapp.views.unit2.DiceRollerView
import com.example.demoapp.views.unit2.LemonadeView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // filter log by Unit2UseCases
        Unit2UseCases.LessonClasses().main()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // root view
        setContent {

            DemoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // ComposeArticleView( modifier = Modifier.padding(innerPadding) )
                    // TaskCompleteView( modifier = Modifier.padding(innerPadding) )
                    // HomeView( modifier = Modifier.padding(innerPadding) )
                    // ComposeQuadrantsView( modifier = Modifier.padding(innerPadding) )
                    // BusinessCardView( modifier = Modifier.padding(innerPadding) )
                    // DiceRollerView( modifier = Modifier.padding(innerPadding) )
                    LemonadeView( modifier = Modifier.padding(innerPadding) )
                }
            }

        }
    }

}