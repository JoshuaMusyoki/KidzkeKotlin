package com.nerds.usecase

import com.nerds.repository.AuthRepository

//SignUp Usecase
class SignupUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(email: String, password:String): Result<Unit>{
        return authRepository.signup(email, password)
    }
}

