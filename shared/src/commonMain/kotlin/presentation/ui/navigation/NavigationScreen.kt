package presentation.ui.navigation

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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