package com.example.data.api

import com.example.BASE_URL
import com.example.data.model.Category
import com.example.data.model.LoginResponse
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import org.json.JSONObject

class ApiServiceImpl: ApiService {
    override fun login(email: String, password: String): Single<LoginResponse> {
        return Rx2AndroidNetworking.post(BASE_URL + "auth/signin")
            .addBodyParameter("email", email)
            .addBodyParameter("password", password)
            .build()
            .getObjectSingle(LoginResponse::class.java)
    }

    override fun getCategories(): Single<List<Category>> {
        return Rx2AndroidNetworking.get(BASE_URL + "categories")
            .build()
            .getObjectListSingle(Category::class.java)
    }
}