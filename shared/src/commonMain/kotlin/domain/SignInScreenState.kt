package domain

data class SignInScreenState(
    val email: String = "",
    val password: String = "",
    val isLogged: Boolean = false,
)