package com.randomdog.gui.activity

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.nasapictures.base.BaseActivity
import com.randomdog.R
import com.randomdog.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override val layoutResId: Int = R.layout.activity_main
    override val bindingInflater: (LayoutInflater) -> ViewBinding = ActivityMainBinding::inflate
    override val binding: ActivityMainBinding get() = super.binding as ActivityMainBinding


}