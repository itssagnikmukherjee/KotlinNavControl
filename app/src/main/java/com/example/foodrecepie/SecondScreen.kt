package com.example.foodrecepie

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun SecondScreen(navToFirstScreen:()->Unit){
    Column {
        var name by remember{ mutableStateOf("") }
        Text(text = "Second Screen")
        OutlinedTextField(value = name, onValueChange = {name = it})
        Button(onClick = { navToFirstScreen() }) {
            Text(text = "Goto First Page")
        }
    }
}