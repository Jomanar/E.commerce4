package com.example.ecommerce4.api

import com.example.ecommerce4.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("https://www.jsonkeeper.com/b/MX0A")
    fun getProducts(): Call<List<Product>>
}