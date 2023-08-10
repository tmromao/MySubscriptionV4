package presentation.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import domain.SignInScreenState
import presentation.ui.SignInScreenEvent

@Composable
fun EmailTextField(
    state: SignInScreenState,
    onEvent: (SignInScreenEvent) -> Unit,
) {

    val focusManager = LocalFocusManager.current // to hide keyboard
    var isEmailValid by rememberSaveable { mutableStateOf(false) }
    var hasError by rememberSaveable { mutableStateOf(true) }

    fun validateEmail(email:String):Boolean{
        val REGEX_EMAIL = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"
        return when{
            REGEX_EMAIL.toRegex().containsMatchIn(email) -> true
            else -> false
        }
    }

    TextField(
        value = state.email,
        onValueChange = {
            onEvent(SignInScreenEvent.EmailChanged(it))
            isEmailValid = validateEmail(it)
            hasError = !isEmailValid
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) },
            onDone = { focusManager.clearFocus() }
        ),
        singleLine = true,
        isError = hasError,

        label = { Text(text = "Enter email") },
        placeholder = { Text(text = "xpto@domain.com") },
        visualTransformation = VisualTransformation.None

    )

}