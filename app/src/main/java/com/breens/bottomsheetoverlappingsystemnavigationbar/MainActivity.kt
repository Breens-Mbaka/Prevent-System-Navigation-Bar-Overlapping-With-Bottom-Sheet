package com.breens.bottomsheetoverlappingsystemnavigationbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.breens.bottomsheetoverlappingsystemnavigationbar.ui.theme.BottomSheetOverlappingSystemNavigationBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /** Tip 1: enable edge-to-edge mode in the whole app
             * enableEdgeToEdge()
             * **/
            val window = this.window
            BottomSheetOverlappingSystemNavigationBarTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(
                        window = window
                    )
                }
            }
        }
    }
}