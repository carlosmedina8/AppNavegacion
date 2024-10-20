package com.example.navigate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigate.ui.theme.NavigateTheme

class HomeView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigateTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Image(
        painter = painterResource(id = R.drawable.img_5436),
        contentDescription = "Description of the image"
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    NavigateTheme {
        HomeScreen()
    }
}