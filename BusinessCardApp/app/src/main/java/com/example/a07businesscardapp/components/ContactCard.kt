package com.example.a07businesscardapp.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ContactCard(info: String, modifier: Modifier = Modifier) {
    Text(text = info)
}
