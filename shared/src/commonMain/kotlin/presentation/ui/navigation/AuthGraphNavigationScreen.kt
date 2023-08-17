package presentation.ui.navigation

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable

sealed class AuthGraphNavigationScreen(
    val route: String,
    val title: String = "My Title",
    val navIcon: (@Composable () -> Unit) = {
        Icon(Icons.Filled.Home, contentDescription = "Home")
    },
    val objectName: String = "",
    val objectPath: String = "",
) {
    object HomeScreen : AuthGraphNavigationScreen("home_screen")

    object SignInScreen : AuthGraphNavigationScreen("sign_in_screen")


}