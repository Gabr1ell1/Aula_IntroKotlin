package com.example.aula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula.ui.theme.AulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//Responsável pela construção da tela
        setContent {
            AulaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//Chamando a função aqui, para poder ser exebida no app
                    App()
                }
            }
        }
    }
}

// Construindo uma tela do zero:

@Composable //marca as funções como componentes de IU
fun App() {

//posicionando os elementos em coluna
    Column(
        Modifier

            .background(Color.White)
            .fillMaxWidth() //A coluna deve ocupar toda a largura disponível do contêiner pai(tela). 
    ) {
        Row(
            Modifier

                .fillMaxWidth(), //A linha deve ocupar toda a largura disponível do contêiner pai(tela). 
            Arrangement.Center // Alinhando os elementos da linha ao centro horizontalmente
        ) {
            Text(text = "App de Notícia")
        }
        Row(
            Modifier
                .padding(8.dp) // Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
	//Sem conteúdo
        }
Column(
    Modifier
//Mudando a cor da coluna toda
        .background(Color.DarkGray)
) {
    Row(
        Modifier
            .fillMaxWidth() //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
    ) {
        Text(text = "Título da Notícia")
    }
    Row(
        Modifier
            .fillMaxWidth() //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
    ) {
        Text(text = "Descrição curta da notícia")
    }
    Row(
        Modifier
            .fillMaxWidth(), //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
        Arrangement.Absolute.Right // Alinha os elementos da linha absolutamente à direita dentro do espaço disponível.
    ) {
        Button(
            onClick = { /*TODO*/ } // Define a ação a ser executada quando o botão for clicado.

        ) {
            Text(text = "Leia mais") // Definindo o texto que será exibido dentro do botão.
        }
    }
}
    Row(
        Modifier
            .padding(8.dp) // Adicionando um espaço de 8 pixels em todas as direções da linha.
    ){

            }

    Column(
        Modifier
            .background(Color.DarkGray)
    ) {   
     Row(
        Modifier

            .fillMaxWidth() //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
    ){
        Text(text = "Título da Noticia")
    }
        Row(
            Modifier

                .fillMaxWidth() //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
        ){
            Text(text = "Descrição curta da noticia")
        }
        Row(
            Modifier

                .fillMaxWidth(), //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
            Arrangement.Absolute.Right // Alinha os elementos da linha absolutamente à direita dentro do espaço disponível.
        ){
            Button(
                onClick = { /*TODO*/ } // Define a ação a ser executada quando o botão for clicado.

            ) {
                Text(text = "Leia mais") // Definindo o texto que será exibido dentro do botão.
            }
        }
        Row(
            Modifier
                .padding(8.dp) // Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {

                }
            }

    }
}

@Composable
@Preview
fun AppPreview(){
    Text(text = "teste") // Um componente de texto simples que exibe "teste".
    AulaTheme { // Aplica o tema personalizado definido em AulaTheme.
        Surface(
            modifier = Modifier.fillMaxSize(), // Definindo que a surface deve ocupar todo o tamanho disponível.
            color = MaterialTheme.colorScheme.background
        ) {
//Chamando a função no PREVIEW assim não é necessário codar em dois lugares, só codar na função prinicipal.
            App() // Chamando o componente principal do aplicativo dentro da surface.
        }
    }
}