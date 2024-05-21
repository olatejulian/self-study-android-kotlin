package com.example.happybirthday

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Happy Birthday Honey!",
                        from = "Your lover"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(
    message: String,
    from: String,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Text(
                color = Color.Black,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                modifier = modifier,
                text = message,
                textAlign = TextAlign.Center,
            )
        }
        Row(modifier = modifier.padding(vertical = 16.dp)) {
            Text(
                color = Color.Black,
                fontSize = 30.sp,
                modifier = modifier,
                text = "from $from",
                textAlign = TextAlign.Right,
            )
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty)

    Box(modifier) {
        Image(painter = image, contentDescription = null, modifier = modifier)
        GreetingText(
            message = message,
            from = from,
            modifier = modifier
                .padding(8.dp)
        )
    }
}
