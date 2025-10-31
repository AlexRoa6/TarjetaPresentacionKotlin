package com.example.p1_tarjetapresentacion_jorge_marcos_alejandro


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
                    ComposeTarjetaPresentacionApp()
                }
            }
        }
    }
}

@Composable
fun ImagenPrincipal(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .size(120.dp) // tamaño del logo o imagen
    )
}

@Composable
fun TituloTarjeta() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.nombres),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = stringResource(R.string.Titulo),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ImagenEInformacionDeAbajo(imagenPainter: Painter, informacion: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 8.dp)
    ) {
        Image(
            painter = imagenPainter,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 8.dp)
        )
        Text(
            text = informacion,
            fontSize = 14.sp
        )
    }
}

@Composable
fun ParteAbajo() {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        ImagenEInformacionDeAbajo(
            painterResource(R.drawable.telefono),
            stringResource(R.string.numeroTelefono)
        )
        ImagenEInformacionDeAbajo(
            painterResource(R.drawable.email),
            stringResource(R.string.emailEmpresa)
        )
        ImagenEInformacionDeAbajo(
            painterResource(R.drawable.email),
            stringResource(R.string.emailPersona)
        )
    }
}

@Composable
fun ComposeTarjetaPresentacionApp() {
    Box(modifier = Modifier.fillMaxSize()) {

        // --- CENTRO: Imagen + Nombre + Título ---
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ImagenPrincipal(painter = painterResource(R.drawable.kotlin))
            Spacer(modifier = Modifier.height(16.dp))
            TituloTarjeta()
        }

        // --- ABAJO: Información de contacto ---
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 24.dp),
            contentAlignment = Alignment.BottomCenter // centrado en la parte inferior
        ) {
            ParteAbajo()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionAppPreview() {
    P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme {
        ComposeTarjetaPresentacionApp()
    }
}
