package presentation.ui

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import domain.SignInScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SignInScreenViewModel:ViewModel() {

    private val _state = MutableStateFlow(SignInScreenState())
            val state = _state.asStateFlow()

    var email: String
        get() = state.value.email
        set(value) {
            _state.value = state.value.copy(email = value)
        }

    var password: String
        get() = state.value.password
        set(value) {
            _state.value = state.value.copy(password = value)
        }

    fun onEvent(event: SignInScreenEvent) {
        when (event) {
            is SignInScreenEvent.EmailChanged -> {
                email = event.email
            }

            is SignInScreenEvent.PasswordChanged -> {
                password = event.password
            }

            is SignInScreenEvent.SignInClicked -> {}
            else -> {} //Do nothing //

        }
    }

}