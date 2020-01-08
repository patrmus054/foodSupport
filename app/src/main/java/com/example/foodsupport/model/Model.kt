package com.example.foodsupport.model

import com.google.gson.annotations.SerializedName

object Model {
    data class Results(@SerializedName("results") var reult : Result)
    data class Result(@SerializedName("title") val name: String, @SerializedName("href") val href: String, @SerializedName("ingredients") val ingredients: String, @SerializedName("thumbnail") val thumbnail: String)
}