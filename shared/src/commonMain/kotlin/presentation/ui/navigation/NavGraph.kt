package presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Navigation(navigator: Navigator) {

    NavHost(
        navigator = navigator,
        initialRoute = NavigationScreen.Home.route,
    ){
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

