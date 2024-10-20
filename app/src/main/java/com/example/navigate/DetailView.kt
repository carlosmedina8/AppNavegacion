package com.example.navigate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigate.ui.theme.NavigateTheme

class DetailView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigateTheme {
                DetailScreen("Parameter from Main")
            }
        }
    }
}

@Composable
fun DetailScreen(parameter: String) {
    Image(
        painter = painterResource(id = R.drawable.img_1195),
        contentDescription = "Description of the image"
    )
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    NavigateTheme {
        DetailScreen("Preview Parameter")
    }
}