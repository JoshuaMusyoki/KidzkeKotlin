package com.nerds.usecase

import com.nerds.repository.AuthRepository

// SignIn Usecase
class SignInUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String) {
        return authRepository.signIn(email, password)
    }
}