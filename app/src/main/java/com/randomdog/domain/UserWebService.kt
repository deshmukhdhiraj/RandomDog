package com.randomdog.domain

import com.randomdog.gui.data.DogUrl

interface UserWebService {

    suspend fun getDogUrl(): DogUrl
}