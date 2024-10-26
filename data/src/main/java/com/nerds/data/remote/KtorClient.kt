package com.nerds.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import kotlinx.serialization.serializer

object KtorClient {
    val client = HttpClient(Android) {
//        install(JsonFeature) {
//            serializer = GsonSerializer()
//        }
    }
}

//class ProductRepositoryImpl : ProductRepository {
//    private val client = KtorClient.client
//
//    override suspend fun getProducts(): List<Product> {
//        val response: List<Product> = client.get("https://api.example.com/products")
//        return response
//    }
//}