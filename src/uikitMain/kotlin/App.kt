import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
actual fun TestButton1(text: String) {
    Button(onClick = {}) {
        Text(text)
    }
}

@Composable
actual fun TestButton2(text: String) {
    Button(onClick = {}) {
        Text(text)
    }
}
