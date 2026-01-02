package com.example.questfirebase_073

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questfirebase_073.navigation.DataSiswaApp
import com.example.questfirebase_073.ui.theme.Questfirebase_073Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Questfirebase_073Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Pastikan composable DataSiswaApp sudah dibuat (biasanya berisi NavHost)
                    DataSiswaApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}