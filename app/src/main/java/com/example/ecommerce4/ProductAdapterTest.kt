package com.example.ecommerce4

import org.junit.Assert.assertEquals
import org.junit.Test

class ProductAdapterTest {

    @Test
    fun testProductListNotEmpty() {
        val productList = listOf(
            Product(1, "iPhone 13", "The latest iPhone from Apple", 999.99, "USD", true),
            Product(2, "Samsung Galaxy S21", "The latest Samsung phone", 899.99, "USD", true)
        )
        val adapter = ProductAdapter(productList)
        assertEquals(2, adapter.itemCount)
    }

    @Test
    fun testProductListEmpty() {
        val productList = emptyList<Product>()
        val adapter = ProductAdapter(productList)
        assertEquals(0, adapter.itemCount)
    }
}