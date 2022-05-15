import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var checked by remember {
        mutableStateOf(false)
    }
    var clickCount by remember {
        mutableStateOf(0)
    }
    var value by remember {
        mutableStateOf(0.5f)
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text("Compose for IoS")
            })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Filled.Add, contentDescription = null)
            }
        }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            Text("Hello Compose IoS!")
            Text("Click count: $clickCount")
            Button(onClick = {
                clickCount++
            }) {
                Text("Click me!")
            }
            Switch(checked = checked, onCheckedChange = { checked = it })
            CircularProgressIndicator()
            LinearProgressIndicator()
            Slider(value = value, onValueChange = {  value = it})
            // LazyColumn {
            //     items(5) {
            //         Text("Item $it")
            //     }
            // }
        }
    }
}