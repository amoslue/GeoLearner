package com.peichen.geolearner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeoGuessrTipsApp()
        }
    }
}

@Composable
fun GeoGuessrTipsApp() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            CountryListScreen()
        }
    }
}

@Composable
fun CountryListScreen() {
    val countries = listOf("USA", "France", "Germany", "Japan", "Brazil")

    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        countries.forEach { country ->
            CountryCard(country)
        }
    }
}

@Composable
fun CountryCard(countryName: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { /* Navigate to country details */ },
        elevation = 4.dp
    ) {
        Text(
            text = countryName,
            modifier = Modifier.padding(16.dp),
            style = TextStyle(fontSize = 18.sp, color = Color.Black)
        )
    }
}
