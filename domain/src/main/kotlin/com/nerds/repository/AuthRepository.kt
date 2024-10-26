package com.nerds.repository

interface AuthRepository {
    suspend fun getAndSaveApiToken(idToken: String);

    suspend fun signIn(email: String, password: String)

    fun signup(email: String, password: String) {

    }

    suspend fun signUp(email: String, password: String): Result<Unit>
}