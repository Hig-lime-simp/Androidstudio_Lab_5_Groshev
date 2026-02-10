import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab5Complete()
        }
    }
}

@Composable
fun Lab5Complete() {
    // basicTextAndContainers()

    // characterByCharacter()

    // sizeAndArrangement()

    // combinedContainers()

    // argbColors()

    // scaffoldExample()

    independentTask()
}

@Composable
fun basicTextAndContainers() {
    // Базовый текст (шаг 2)
    Text(
        modifier = Modifier
            .background(color = Color.Green)
            .padding(top = 48.dp, start = 16.dp, end = 16.dp)
            .width(100.dp),
        text = "Hello world",
        fontWeight = FontWeight.ExtraBold,
        color = Color.Blue,
        fontSize = 20.sp,
        letterSpacing = 24.sp
    )

    /*
    repeat(5) {
        Text(
            modifier = Modifier
                .background(Color.Green)
                .padding(16.dp)
                .width(100.dp),
            text = "Hello $it",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Blue,
            fontSize = 20.sp
        )
    }
    */

    /*
    Row {
        repeat(5) {
            Text(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(16.dp)
                    .width(100.dp),
                text = "Hello $it",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Blue,
                fontSize = 20.sp
            )
        }
    }
    */

    /*
    Column {
        repeat(5) {
            Text(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(16.dp)
                    .width(100.dp),
                text = "Hello $it",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Blue,
                fontSize = 20.sp
            )
        }
    }
    */
}

@Composable
fun characterByCharacter() {
    val symbols = "Hello world!".filter { it.isLetter() }

    Row {
        for (char in symbols) {
            Text(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(8.dp),
                text = char.toString(),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
        }
    }
}

@Composable
fun sizeAndArrangement() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Элемент 1",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
        Text(
            text = "Элемент 2",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
        Text(
            text = "Элемент 3",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
    }
}

@Composable
fun combinedContainers() {
    val text = "Hello"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            for (char in text) {
                Text(
                    modifier = Modifier
                        .background(Color.Cyan)
                        .padding(12.dp),
                    text = char.toString(),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 28.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row {
            for (char in text.reversed()) {
                Text(
                    modifier = Modifier
                        .background(Color.Magenta)
                        .padding(12.dp),
                    text = char.toString(),
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 28.sp
                )
            }
        }
    }
}

@Composable
fun argbColors() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterVertically)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFFFF0000))
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0x80FF0000))
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scaffoldExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Моё приложение") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Действие при нажатии */ }
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Добавить")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Основное содержимое экрана",
                fontSize = 20.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Действие */ }) {
                Text("Кнопка")
            }
        }
    }
}

//САМОСТОЯТЕЛЬНОЕ ЗАДАНИЕ
@Composable
fun independentTask() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Лабораторная работа №5",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2C3E50)
            )
            Text(
                text = "Jetpack Compose: контейнеры и цвета",
                fontSize = 18.sp,
                color = Color(0xFF34495E)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color(0xFF3498DB)) // #3498DB в ARGB
            )

            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color(0x802ECC71)) // #2ECC71 с прозрачностью 50%
            )

            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color(0xFFE67E22)) // #E67E22 в ARGB
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF8F9FA))
                .padding(16.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Вложенная структура",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF2C3E50),
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color(0xFFE74C3C))
                        )
                        Text("Красный", fontSize = 12.sp)
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color(0xFF2ECC71))
                        )
                        Text("Зелёный", fontSize = 12.sp)
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color(0xFF9B59B6))
                        )
                        Text("Фиолетовый", fontSize = 12.sp)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    repeat(4) { index ->
                        Box(
                            modifier = Modifier
                                .size(30.dp)
                                .background(
                                    when (index) {
                                        0 -> Color(0xFF1ABC9C)
                                        1 -> Color(0xFFF1C40F)
                                        2 -> Color(0xFFE67E22)
                                        else -> Color(0xFF34495E)
                                    }
                                )
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFECF0F1))
                .padding(12.dp)
        ) {
            Text(
                text = "Использованные ARGB цвета:",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF2C3E50)
            )
            Text("• 0xFF3498DB - Синий (непрозрачный)", fontSize = 12.sp)
            Text("• 0x802ECC71 - Зелёный (полупрозрачный)", fontSize = 12.sp)
            Text("• 0xFFE67E22 - Оранжевый (непрозрачный)", fontSize = 12.sp)
        }
    }
}