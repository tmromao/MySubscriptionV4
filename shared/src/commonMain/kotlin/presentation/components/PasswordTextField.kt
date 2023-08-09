package presentation.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import domain.SignInScreenState
import presentation.ui.SignInScreenEvent

@Composable
fun PasswordTextField(
    state: SignInScreenState,
    onEvent: (SignInScreenEvent) -> Unit,
    modifier: Modifier = Modifier,

    ) {
    val focusManager = LocalFocusManager.current // to hide keyboard
    var showPassword by rememberSaveable { mutableStateOf(false) }
    var isPasswordValid by rememberSaveable { mutableStateOf(false) }
    var hasError by rememberSaveable { mutableStateOf(true) }


    fun strengthChecker(password: String): Boolean {
        val REGEX_STRONG_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"
        return when {
            REGEX_STRONG_PASSWORD.toRegex().containsMatchIn(password) -> true
            else -> false
        }
    }

    fun validatePassword(password: String): Boolean {
        return when {
            password.isEmpty() -> false
            password.length < 8 -> false
            else -> strengthChecker(password)
        }
    }

    TextField(
        value = state.password,
        onValueChange = {
            onEvent(SignInScreenEvent.PasswordChanged(it))
            isPasswordValid = validatePassword(it)
            hasError = !isPasswordValid

        },
        //label = { Text(text = "Enter password") },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                isPasswordValid = validatePassword(state.password)
                focusManager.clearFocus()
            }
        ),
        singleLine = true,
        isError = hasError,

        visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),

    )

}