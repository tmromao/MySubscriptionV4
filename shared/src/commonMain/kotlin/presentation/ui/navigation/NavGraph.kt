package presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import presentation.ui.SignInScreen

@Composable
fun Navigation(navigator: Navigator) {

    NavHost(
        navigator = navigator,
        initialRoute = NavigationScreen.SignInScreen.route,
    ){
        scene(route = NavigationScreen.SignInScreen.route){
            SignInScreen(navigator)
        }
        scene(route = NavigationScreen.HomeScreen.route){
            HomeScreen(navigator)
        }
    }
}

@Composable
fun currentRoute(navigator: Navigator):String? {
    return navigator.currentEntry.collectAsState(null).value?.route?.route
}