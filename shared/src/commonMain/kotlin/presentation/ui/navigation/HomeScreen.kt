package presentation.ui.navigation


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey


data class HomeScreen(
    val index: Int,
) : Screen {

    override val key: ScreenKey
        get() = uniqueScreenKey


    @Composable
    override fun Content() {
        Text("Hello World")
       /* TabNavigator(
            HomeTab,
            tabDisposable = {
                TabDisposable(
                    navigator = it,
                    tabs = listOf(HomeTab),
                )
            }
        ) { tabNavigator ->
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = tabNavigator.current.options.title) })
                },
                content = {
                    CurrentTab()
                },
                bottomBar = {
                    BottomNavigation {
                        TabNavigationItem(HomeTab)
                        TabNavigationItem(ProfileTab)
                        TabNavigationItem(FavoritesTab)
                    }
                }
            )
        }*/
    }
}

/*@Composable
private fun RowScope.TabNavigationItem(tab: Tab){
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current.key == tab.key,
        onClick = { tabNavigator.current = tab },
        icon = { Icon(tab.icon!!, tab.title)}
    )
}*/


