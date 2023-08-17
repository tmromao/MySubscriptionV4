package presentation.ui.navigation


import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator


@Composable
fun HomeScreen(
    navigator: Navigator,
) {

    Scaffold(
        bottomBar = {
            BottomNavigationUI(navigator = navigator)
        }
    ) {
        Text("Home Screen")
        //Navigation(navigator)
    }

}


@Composable
fun BottomNavigationUI(navigator: Navigator) {
    BottomNavigation {
        val items = listOf(
            NavigationScreen.HomeNav,
            NavigationScreen.PopularNav,
            NavigationScreen.TopRatedNav,
            NavigationScreen.UpcomingNav,
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



