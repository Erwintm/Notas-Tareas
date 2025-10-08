package com.example.notas.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalle de Nota") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Título: Estudiar Android", style = MaterialTheme.typography.titleLarge)
            Text("Descripción: Repasar  Compose")
            Text("Fecha y hora: 07-10-2025 4:00 pm")
            Text("Recordatorios: ")
            Text("Estado: Terminada ")
            Spacer(Modifier.height(20.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Button(onClick = { navController.popBackStack() }) {
                    Text("Editar")
                }
                Button(onClick = { navController.popBackStack() }) {
                    Text("Eliminar")
                }
            }
        }
    }
}
