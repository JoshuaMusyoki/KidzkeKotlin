package com.nerds.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.nerds.presentation.viewModel.AuthViewModel

@Composable
fun SignUpScreen(authViewModel: AuthViewModel){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column {
        TextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text("Email")
            }
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password")
            }
        )

        Button(onClick = {authViewModel.signUp(email, password)}) {
            Text("Sign Up")
        }
        when(authViewModel.authState){
            is AuthState.Loading -> CircularProgressIndicator()
            is AuthState.Error -> Text("Error: ${(authViewModel.authState as AuthState.Error).message}")
            is AuthState.Success -> Text("Signed Up Successfully!")
        }
    }
}