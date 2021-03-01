package com.subhpandey.android.friendex

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.subhpandey.android.friendex.navigation.AppNavigation
import com.subhpandey.android.friendex.ui.theme.FriendexTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FriendMainView()
        }
    }


    @Composable
    fun FriendMainView() {
        FriendexTheme {
            Surface(color = MaterialTheme.colors.background) {
                AppNavigation()
            }
        }
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    FriendexTheme(darkTheme = true) {
       AppNavigation()
    }
}