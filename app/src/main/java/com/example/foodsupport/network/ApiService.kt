package com.example.foodsupport.network

import android.graphics.ColorSpace
import com.example.foodsupport.model.Model
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("api/")
    fun fetchAllResults(): Call<List<Model.Results>>
}