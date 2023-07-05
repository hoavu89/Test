package com.example.data.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("user")
    var user: User,
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("refreshToken")
    val refreshToken: String
)