package com.example.aacomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.aacomposebasics.ui.theme.AAComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AAComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TaskCompleteImage(modifier = modifier)
        MainText(modifier = modifier)
        SecondaryText(modifier = modifier)
    }
}

@Composable
fun TaskCompleteImage(modifier: Modifier = Modifier) {
    Row(modifier) {
        Box(modifier) {
            val image = painterResource(id = R.drawable.ic_task_completed)
            Image(painter = image, contentDescription = null, modifier = modifier)
        }
    }
}

@Composable
fun MainText(modifier: Modifier = Modifier) {
    Row(modifier) {
        Text(
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
            text = "All tasks completed",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun SecondaryText(modifier: Modifier = Modifier) {
    Row(modifier) {
        Text(modifier = modifier, text = "Nice work!", fontSize = 16.sp)
    }
}
