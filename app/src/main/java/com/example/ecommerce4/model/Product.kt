package com.example.ecommerce4.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val currency: String,
    val in_stock: Boolean
)