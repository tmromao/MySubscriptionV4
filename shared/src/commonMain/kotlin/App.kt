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
import presentation.ui.navigation.Navigation
import presentation.ui.navigation.NavigationScreen
import presentation.ui.navigation.currentRoute

@Composable
internal fun App() {

    val navigator = rememberNavigator()

    MaterialTheme {

        Navigation(navigator = navigator)
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

@Composable
fun BottomNavigationUI(navigator: Navigator) {
    BottomNavigation {
        val items = listOf(
            NavigationScreen.HomeNav,
        )
        items.forEach {
            BottomNavigationItem(label = { Text(text = it.title) },
                selected = it.route == currentRoute(navigator),
                icon = it.navIcon,
                onClick = {
                    navigator.navigate(
                        it.route,
                        NavOptions(
                            launchSingleTop = true
                        ),
                    )
                })
        }
    }

}

expect fun getPlatformName(): String
