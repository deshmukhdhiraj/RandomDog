package com.randomdog.network

import com.randomdog.gui.data.DogUrl
import retrofit2.http.GET

interface RetrofitUserWebService {
    @GET("breeds/image/random")
    suspend fun getDogUrl(): DogUrl
}