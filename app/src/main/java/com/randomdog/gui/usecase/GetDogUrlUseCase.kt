package com.randomdog.gui.usecase

import com.randomdog.domain.UserWebService
import javax.inject.Inject

class GetDogUrlUseCase @Inject constructor(
    private val userWebService: UserWebService,
) {
    suspend operator fun invoke() = userWebService.getDogUrl()
}