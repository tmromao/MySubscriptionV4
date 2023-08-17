package presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import presentation.ui.SignInScreen

@Composable
fun AuthenticationNavigation(navigator: Navigator) {

    NavHost(
        navigator = navigator,
        initialRoute = AuthGraphNavigationScreen.SignInScreen.route,
    ){
        scene(route = AuthGraphNavigationScreen.SignInScreen.route){
            SignInScreen(navigator)
        }
        scene(route = AuthGraphNavigationScreen.HomeScreen.route){
            HomeScreen()
        }
    }
}

@Composable
fun currentRoute(navigator: Navigator):String? {
    return navigator.currentEntry.collectAsState(null).value?.route?.route
}