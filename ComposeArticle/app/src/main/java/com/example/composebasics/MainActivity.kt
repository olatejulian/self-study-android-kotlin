package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.ui.theme.ComposeBasics

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasics {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Gridlayout()
                }
            }
        }
    }
}

@Composable
fun Gridlayout(modifier: Modifier = Modifier) {
    Column(modifier) {
        Header(modifier)
        Title(modifier)
        Introduction(modifier)
        Content(modifier)
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(modifier) {
        Box(modifier) {
            val image = painterResource(id = R.drawable.bg_compose_background)

            Image(painter = image, contentDescription = null, modifier)
        }
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    val textContent = stringResource(R.string.title_text)

    Row(modifier) {
        Text(text = textContent, modifier.padding(16.dp), fontSize = 24.sp)
    }
}

@Composable
fun Introduction(modifier: Modifier = Modifier) {
    val textContent =
        stringResource(R.string.introduction_text)

    Row(modifier) {
        Text(text = textContent, modifier.padding(16.dp), textAlign = TextAlign.Justify)
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    val textContent = stringResource(R.string.content_text)

    Row(modifier) {
        Text(text = textContent, modifier.padding(16.dp), textAlign = TextAlign.Justify)
    }
}