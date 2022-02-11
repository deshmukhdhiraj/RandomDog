package com.randomdog.gui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.randomdog.base.BaseViewModel
import com.randomdog.gui.data.DogUrl
import com.randomdog.gui.usecase.GetDogUrlUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class GenerateDogViewModel @Inject constructor(
    private val getDogUrlUseCase: GetDogUrlUseCase,
) : BaseViewModel() {

    private val _getDogImage: MutableLiveData<DogUrl> by lazy { MutableLiveData<DogUrl>() }
    internal val getDogImage: LiveData<DogUrl> = _getDogImage

    internal fun getDogImage(){

        launchUseCases {
            _getDogImage.postValue(getDogUrlUseCase())
        }
    }
}