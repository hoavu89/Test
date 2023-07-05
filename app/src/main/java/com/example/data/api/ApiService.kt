package com.example.data.api

import com.example.data.model.Category
import com.example.data.model.LoginResponse
import io.reactivex.Single

interface ApiService {
    fun login(email: String, password: String) : Single<LoginResponse>
    fun getCategories() : Single<List<Category>>
}