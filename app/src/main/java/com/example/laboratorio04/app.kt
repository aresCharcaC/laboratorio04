package com.example.laboratorio04

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun app() {
    val items = listOf("Home", "Search", "Profile")

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Scaffold") },

            )
        },
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                when (index) {
                                    0 -> Icons.Filled.Home
                                    1 -> Icons.Filled.Search
                                    else -> Icons.Filled.Person
                                },
                                contentDescription = item
                            )
                        },
                        label = { Text(item) },
                        selected = true,
                        onClick = { }
                    )
                }
            }
        }
    ) { innerPadding ->
        // Contenido principal
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.Gray),

        ) {
            Image(
                painter = painterResource(id = R.drawable.mahoraga),
                contentDescription = "mahoraga",
                modifier = Modifier
                    .size(400.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = "Imagen de Mahoraga",
                modifier = Modifier.padding(top = 8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun appPreview(){
    app()
}