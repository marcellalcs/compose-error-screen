package com.ifood.errordefault

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ifood.errordefault.ui.composables.ErrorScreen
import com.ifood.errordefault.ui.theme.ErrorDefaultTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ErrorDefaultTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ErrorScreen(
                        imageResourceId = R.drawable.error_robot,
                        title = "Ops, algo saiu errado",
                        subtitle = "A operação não foi completada",
                        buttonLabel = "Tentar novamente",
                        buttonAction = {
                            Toast
                                .makeText(
                                    applicationContext,
                                    "Clicou no tentar novamente",
                                    Toast.LENGTH_SHORT
                                ).
                                show()
                        }
                    )
                }
            }
        }
    }
}