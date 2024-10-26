package com.nerds.presentation.viewModel

import com.nerds.usecase.SignInUseCase
import com.nerds.usecase.SignupUseCase
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AuthViewModel (
    private val signupUseCase: SignupUseCase,
    private val signinUseCase: SignInUseCase
) : ViewModel(){
    var authState by mutableStateOf<AuthState>(AuthState.Idle)
        private set

    fun signUp(email: String, password: String) = viewModelScope.launch {
        authState = AuthState.Loading
        val result = signUpUseCase(email, password)
        authState = if (result.isSuccess) AuthState.Success else AuthState.Error(result.exceptionOrNull()?.message ?: "Error")
    }

    fun signIn(email: String, password: String) = viewModelScope.launch {
        authState = AuthState.Loading
        val result = signInUseCase(email, password)
        authState = if (result.isSuccess) AuthState.Success else AuthState.Error(result.exceptionOrNull()?.message ?: "Error")
    }
}
