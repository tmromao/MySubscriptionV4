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
        initialRoute = "/groupsignin",
    ){
        group(route = "/groupsignin", initialRoute = NavigationScreen.SignInScreen.route){
            scene(route = NavigationScreen.SignInScreen.route){
                SignInScreen(navigator)
            }
        }
        group(route = "/grouphome", initialRoute = NavigationScreen.Home.route){
            scene(route = NavigationScreen.Home.route){
                HomeScreen(navigator)
            }
            scene(route = NavigationScreen.Popular.route){
                PopularScreen(navigator)
            }
            scene(route = NavigationScreen.TopRated.route){
                TopRatedScreen(navigator)
            }
            scene(route = NavigationScreen.Upcoming.route){
                UpcomingScreen(navigator)
            }
        }

    }

}

@Composable
fun currentRoute(navigator: Navigator):String? {
    return navigator.currentEntry.collectAsState(null).value?.route?.route
}
