package presentation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import presentation.components.EmailTextField
import presentation.components.PasswordTextField
import presentation.ui.navigation.NavigationScreen
import presentation.ui.navigation.NavigationScreen.Home.route

@Composable
fun SignInScreen(
    navigator: Navigator,
    viewModel: SignInScreenViewModel = SignInScreenViewModel(),
) {

    val state by viewModel.state.collectAsState()

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Sign In")
        Spacer(modifier = Modifier.height(16.dp))
        EmailTextField(state = state, onEvent = viewModel::onEvent)
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(state = state, onEvent = viewModel::onEvent)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                viewModel.onEvent(SignInScreenEvent.SignInClicked)
                //navigator.navigate(NavigationScreen.Home.route)
                navigator.navigate(
                    route = "/grouphome",
                    NavOptions(
                        popUpTo = PopUpTo(
                            route = "/groupsignin",
                            inclusive = true,
                        )
                    ),
                    //navigator.popBackStack()
                )
            },
        ) {
            Text("Sign In")
        }

    }
}
