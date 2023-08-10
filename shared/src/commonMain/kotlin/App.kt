import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.navigator.Navigator
import presentation.ui.SignInScreen

@Composable
fun App() {

    MaterialTheme {
        //Text("Hello ${getPlatformName()}")
        Navigator(
            screen = SignInScreen(index = 0),
            onBackPressed = { currentScreen ->
                print("Navigator")
                true
            },
        )
    }
}


expect fun getPlatformName(): String
