package com.randomdog.network

import com.randomdog.domain.UserWebService
import com.randomdog.gui.data.DogUrl
import javax.inject.Inject

class AppUserWebService @Inject constructor(
    private val userService: RetrofitUserWebService,
) : UserWebService {
    override suspend fun getDogUrl(): DogUrl = networkCall(
        {
            userService.getDogUrl()
        },
        { response ->
            DogUrl(response.message, response.status)
        })

}