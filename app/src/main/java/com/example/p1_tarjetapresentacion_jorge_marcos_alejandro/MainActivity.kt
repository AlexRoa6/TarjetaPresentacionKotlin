package com.example.p1_tarjetapresentacion_jorge_marcos_alejandro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_jorge_marcos_alejandro.ui.theme.P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ImagenPrincipal(
                        painter = painterResource(R.drawable.kotlin),

                        )
                }
            }
        }
    }
}
@Composable
fun ImagenPrincipal(painter: Painter) {
    Box(
        modifier = Modifier
            .fillMaxSize() // Ocupa toda la pantalla
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(320.dp) // tamaño de la imagen
                .align(Alignment.TopCenter) // centramos
                .padding(top = 2.dp), // subimos la img
            contentScale = ContentScale.Crop
        )
    }
}




@Preview
@Composable
fun VerImagen(){
    P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme {
        ImagenPrincipal(painter = painterResource(R.drawable.kotlin)
        )
    }
}