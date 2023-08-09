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
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import domain.SignInScreenState
import presentation.components.EmailTextField
import presentation.components.PasswordTextField

@Composable
fun SignInScreen() {

    val viewModel = getViewModel(
        key = "sign-in-screen",
        factory = viewModelFactory {
            SignInScreenViewModel()
        }
    )

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
            onClick = { viewModel.onEvent(SignInScreenEvent.SignInClicked) },
        ) {
            Text("Sign In")
        }

    }

}