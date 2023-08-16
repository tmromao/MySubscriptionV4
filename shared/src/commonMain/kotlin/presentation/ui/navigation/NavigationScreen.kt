package presentation.ui.navigation

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
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
    object HomeScreen : NavigationScreen("home_screen")

    object SignInScreen : NavigationScreen("sign_in_screen")

    object HomeNav : NavigationScreen("home_nav_screen", title = "Home", navIcon = {
        Icon(
            Icons.Filled.Home,
            contentDescription = "Home",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })
}