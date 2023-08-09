import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import presentation.ui.SignInScreen

@Composable
fun App() {

    MaterialTheme {
        //Text("Hello ${getPlatformName()}")
        SignInScreen()
    }
}

expect fun getPlatformName(): String
