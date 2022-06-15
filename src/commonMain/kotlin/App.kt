import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var checked by remember { mutableStateOf(false) }
    var clickCount by remember { mutableStateOf(0) }
    var value by remember { mutableStateOf(0.5f) }
    var navigationBarItemIndex by remember { mutableStateOf(0) }
    Scaffold(
        topBar = {
            // CenterAlignedTopAppBar(title = {
            //     Text("Compose for IoS")
            // })
            Box(Modifier.fillMaxWidth().height(36.dp), Alignment.CenterStart) {
                Text("Compose for IoS")
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Filled.Add, contentDescription = null)
            }
        },
        bottomBar = {
            // NavigationBar {
            //     NavigationBarItem(
            //         selected = navigationBarItemIndex == 0,
            //         enabled = navigationBarItemIndex != 0,
            //         icon = { Icon(Icons.Filled.Home, contentDescription = null) },
            //         label = { Text("Home") },
            //         onClick = { navigationBarItemIndex = 0 },
            //     )
            //     NavigationBarItem(
            //         selected = navigationBarItemIndex == 1,
            //         enabled = navigationBarItemIndex != 1,
            //         icon = { Icon(Icons.Filled.Person, contentDescription = null) },
            //         label = { Text("Person") },
            //         onClick = { navigationBarItemIndex = 1 },
            //     )
            //     NavigationBarItem(
            //         selected = navigationBarItemIndex == 2,
            //         enabled = navigationBarItemIndex != 2,
            //         icon = { Icon(Icons.Filled.Settings, contentDescription = null) },
            //         label = { Text("Setting") },
            //         onClick = { navigationBarItemIndex = 2 },
            //     )
            // }
            Box(Modifier.fillMaxWidth().height(55.dp), Alignment.CenterStart) {
                Text("BottomBar")
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
            Slider(value = value, onValueChange = { value = it })
            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                contentPadding = PaddingValues(6.dp),
            ) {
                items(20) {
                    Card {
                        Text("Row $it", Modifier.padding(6.dp))
                    }
                }
            }
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(6.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                contentPadding = PaddingValues(6.dp),
            ) {
                items(20) {
                    Card {
                        Text("Column $it", Modifier.padding(6.dp))
                    }
                }
            }
        }
    }
}