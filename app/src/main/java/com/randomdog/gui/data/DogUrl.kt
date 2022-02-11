package com.randomdog.gui.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DogUrl(
    val message: String,
    val status: String
)
