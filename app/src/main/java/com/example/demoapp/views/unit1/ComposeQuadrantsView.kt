package com.example.demoapp.views.unit1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.demoapp.R
import com.example.demoapp.ui.theme.Quadrant1Color
import com.example.demoapp.ui.theme.Quadrant2Color
import com.example.demoapp.ui.theme.Quadrant3Color
import com.example.demoapp.ui.theme.Quadrant4Color

@Composable
fun ComposeQuadrantsView(modifier: Modifier) {
    Column (modifier.fillMaxSize()){
        Row (Modifier
            .fillMaxWidth()
            .weight(1f, true)) {
            Column (
                Modifier
                    .weight(1f)
                    .background(Quadrant1Color)
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    stringResource(R.string.text_composable),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier =  Modifier.padding(bottom = 16.dp))
                Text(
                    text = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                    textAlign = TextAlign.Justify
                )
            }

            Column (
                Modifier
                    .weight(1f)
                    .background(Quadrant2Color)
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    stringResource(R.string.image_composable),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier =  Modifier.padding(bottom = 16.dp))
                Text(
                    text = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row (Modifier
            .fillMaxWidth()
            .weight(1f, true)) {
            Column (
                Modifier
                    .weight(1f)
                    .background(Quadrant3Color)
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    stringResource(R.string.row_composable),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier =  Modifier.padding(bottom = 16.dp))
                Text(
                    text = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                    textAlign = TextAlign.Justify
                )
            }

            Column (
                Modifier
                    .weight(1f)
                    .background(Quadrant4Color)
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    stringResource(R.string.column_composable),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier =  Modifier.padding(bottom = 16.dp))
                Text(
                    text = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }

}