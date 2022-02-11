package com.randomdog

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class RandomDogApp : Application() {
    override fun onCreate() {
        Timber.v("onCreate $displayName")
        super.onCreate()
    }
}