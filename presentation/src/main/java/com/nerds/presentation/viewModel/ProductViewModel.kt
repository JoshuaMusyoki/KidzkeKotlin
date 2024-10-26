package com.nerds.presentation.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nerds.usecase.GetProductsUseCase
import kotlinx.coroutines.launch

class ProductViewModel (
    private val getProductsUseCase: GetProductsUseCase
) : ViewModel() {
//    var productList by mutableStateOf()<List<Product>>(emptyList())
//        private set

    fun fetchProducts() = viewModelScope.launch {
//        productList = getProductsUseCase()
    }
}

