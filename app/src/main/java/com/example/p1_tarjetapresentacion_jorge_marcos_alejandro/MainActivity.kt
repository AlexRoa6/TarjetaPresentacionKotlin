package com.example.p1_tarjetapresentacion_jorge_marcos_alejandro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    ComposeTarjetaPresentacionApp()
                }
            }
        }
    }
}
@Composable
fun ImagenPrincipal(painter: Painter) {
    Box(modifier = Modifier
        .fillMaxSize()) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(320.dp) // tamaño de la imagen
                .align(Alignment.Center) // centramos
        )
    }
}


@Composable
fun ParteAbajo(){
    Column (modifier = Modifier.padding(bottom = 16.dp),
        verticalArrangement = Arrangement.Bottom,
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
fun ImagenEInformacionDeAbajo(imagenPainter: Painter, informacion: String){
    Row (modifier = Modifier.padding(end = 8.dp).padding(bottom = 24.dp)){
        Image(
            painter = imagenPainter,
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = informacion,
            fontSize = 24.sp
        )
    }

}

@Composable
fun ComposeTarjetaPresentacionApp(){
    Box(modifier = Modifier
        .fillMaxSize()) {

        ImagenPrincipal(
            painter = painterResource(R.drawable.kotlin)
        )
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter) {
            ParteAbajo()
        }
    }
}
@Preview
@Composable
fun TarjetaPresentacionAppPreview(){
    P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme {
        ComposeTarjetaPresentacionApp()
    }
}