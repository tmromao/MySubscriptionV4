package presentation.ui

sealed interface SignInScreenEvent {
    data class EmailChanged(val email: String) : SignInScreenEvent
    data class PasswordChanged(val password: String) : SignInScreenEvent
    object SignInClicked : SignInScreenEvent
    object SignUpClicked : SignInScreenEvent
    object ForgotPasswordClicked : SignInScreenEvent
}