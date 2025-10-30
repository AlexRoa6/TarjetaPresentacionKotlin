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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p1_tarjetapresentacion_jorge_marcos_alejandro.ui.theme.P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ){
                        TarjetaPresentacionApp()
                }
            }
        }
    }
}



@Composable
fun ParteAbajo(){

        Column(
            modifier = Modifier.padding(bottom = 8.dp),
            verticalArrangement = Arrangement.Bottom,

            ) {
            ImagenEInformacion(
                painterResource(R.drawable.telefono),
                stringResource(R.string.numeroTelefono)
            )

            ImagenEInformacion(
                painterResource(R.drawable.email),
                stringResource(R.string.emailEmpresa)
            )

            ImagenEInformacion(
                painterResource(R.drawable.email),
                stringResource(R.string.emailPersona)
            )
        }



}

@Composable
fun ImagenEInformacion(imgPainter: Painter, informacion: String, modifier: Modifier = Modifier){
    Row(modifier = Modifier.padding(bottom = 20.dp)){
        Image(
            painter = imgPainter,
            contentDescription = null,
            modifier = Modifier.size(30.dp)
        )
        Text(
            text = informacion
        )
    }
}

@Composable
fun TarjetaPresentacionApp(){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        ParteAbajo()
    }
}

@Preview
@Composable
fun TarjetaPresentacionAppPreview(){
    P1_TarjetaPresentacion_Jorge_Marcos_AlejandroTheme {
        TarjetaPresentacionApp()
    }
}
