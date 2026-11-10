package com.example.konekin.model

import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.ApiStatus

data class UserDetail(
    @SerializedName("data")
    val data: Data
)
