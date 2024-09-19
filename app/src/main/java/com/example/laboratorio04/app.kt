package com.example.laboratorio04

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun app() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Scaffold") }
            )
        }
    ) { innerPadding ->
        // Contenido principal
        Text(
            text = "Probando",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun appPreview(){
    app()
}