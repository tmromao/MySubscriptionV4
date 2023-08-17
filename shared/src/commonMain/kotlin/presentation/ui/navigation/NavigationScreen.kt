package presentation.ui.navigation

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

sealed class NavigationScreen(
    val route: String,
    val title: String = "My Title",
    val navIcon: (@Composable () -> Unit) = {
        Icon(Icons.Filled.Home, contentDescription = "Home")
    },
    val objectName: String = "",
    val objectPath: String = "",
) {
    object Home : NavigationScreen("home_screen")
    object Popular : NavigationScreen("popular_screen")
    object TopRated : NavigationScreen("top_rated_screen")
    object Upcoming : NavigationScreen("upcoming_screen")

    object HomeNav : NavigationScreen("home_screen", title = "Home", navIcon = {
        Icon(
            Icons.Filled.Home,
            contentDescription = "Home",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    object PopularNav : NavigationScreen("popular_screen", title = "Popular", navIcon = {
        Icon(
            Icons.Filled.Timeline,
            contentDescription = "Popular",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    object TopRatedNav : NavigationScreen("top_rated_screen", title = "Top Rated", navIcon = {
        Icon(
            Icons.Filled.Star,
            contentDescription = "Top Rated",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    object UpcomingNav : NavigationScreen("upcoming_screen", title = "Upcoming", navIcon = {
        Icon(
            Icons.Filled.KeyboardArrowUp,
            contentDescription = "Upcoming",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })
}
