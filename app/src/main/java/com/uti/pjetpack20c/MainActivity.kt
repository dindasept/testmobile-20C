package com.uti.pjetpack20c

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20c.ui.theme.PJetpack20CTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetpack20CTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Greeting("Android")
                    // Text(text = "Coba Jetpack Compose")
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Magenta)) {
                    //    Text(text = "Coba Jetpack Compose")
                    //    Greeting("Android")
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                            .padding(start = 10.dp, end = 10.dp)) {
                            Text(text = "Coba Jetpack Compose")
                            Greeting("Android")
                        }

                        Spacer(modifier = Modifier.padding(10.dp) )
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Cyan)
                            .padding(start = 10.dp, end = 10.dp)) {
                            Text(text = "Coba Jetpack Compose 2")
                            Greeting("Android 2")
                            //buat variable untuk context


                            val context = LocalContext.current

                            // buat button
                                Button(onClick = {
                                    // isi event untuk click
                                    // buat variable
                                    // var (immutable)
                                    // var(mutable)
                                    // val test = "oke"
                                    // test = "yes"
                                    // test = "ya"

                                    var nilai1 = 10
                                    var nilai2 = 3
                                    val nilai3 = nilai1.toFloat() / nilai2


                                    Toast.makeText(context,nilai3.toString(),Toast.LENGTH_SHORT).show();





                                }, modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(Color.Black),) {
                                    // isi text pada button
                                    Text(text = "Proses", color = Color.Red)
                                }

                        }


                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PJetpack20CTheme {
        Greeting("Android")

    }
}