package presentation.ui.navigation

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun PopularScreen(
    navigator: Navigator,
) {

    Scaffold(
        bottomBar = {
            BottomNavigationUI(navigator = navigator)
        }
    ) {
        Text("Popular Screen")
        //Navigation(navigator)
    }

}