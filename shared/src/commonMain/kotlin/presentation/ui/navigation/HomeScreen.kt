package presentation.ui.navigation


import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator


@Composable
fun HomeScreen(
    //navigator: Navigator,//
) {

    Text("Hello World")


    /*    Scaffold (
            bottomBar = {
                when(currentRoute(navigator)) {
                    NavigationScreen.HomeNav.route -> BottomNavigationUI(navigator = navigator)
                    else -> BottomNavigationUI(navigator = navigator)
                }
            }

        ){ Text("Hello World") }*/

}
/*

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
                }
            )
        }
    }

}


*/
