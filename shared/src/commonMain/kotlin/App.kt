import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import presentation.ui.navigation.AuthenticationNavigation
import presentation.ui.navigation.currentRoute

@Composable
internal fun App() {


    val navigator = rememberNavigator()

    MaterialTheme {

        AuthenticationNavigation(navigator = navigator)
       /* Scaffold(
            bottomBar = {

            }
        ) { }*/


        //Text("Hello ${getPlatformName()}")
        /*Navigator(
            screen = SignInScreen(index = 0),
            onBackPressed = { currentScreen ->
                print("Navigator")
                true
            },
        )*/
    }
}


expect fun getPlatformName(): String
