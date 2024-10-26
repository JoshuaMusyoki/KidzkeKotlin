package com.nerds.data.auth

import com.nerds.repository.AuthRepository

class AuthRepositoryImpl : AuthRepository {
//    private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    override suspend fun signUp(email: String, password: String): Result<Unit> {
        return try {
//            firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun signIn(email: String, password: String): Result<Unit> {
        return try {
//            firebaseAuth.signInWithEmailAndPassword(email, password).await()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
        }

    override suspend fun getAndSaveApiToken(idToken: String) {
        TODO("Not yet implemented")
    }
}