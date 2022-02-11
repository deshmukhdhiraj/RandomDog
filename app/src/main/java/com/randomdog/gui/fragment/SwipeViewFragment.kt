package com.randomdog.gui.fragment

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.android.base.com.gui.fragment.ShowDogImagesFragment.Companion.ARG_OBJECT

import com.nasapictures.base.BaseFragment
import com.randomdog.R
import com.randomdog.databinding.SwipeBinding

class SwipeViewFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.swipe
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ViewBinding
        get() = SwipeBinding::inflate
    override val binding: SwipeBinding
        get() = super.binding as SwipeBinding

    override fun onInitView() {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

            binding.apply {
                getParcelable<Bitmap>(ARG_OBJECT)?.let { ivCoverImageswipe.setImageBitmap(it) }

            }

        }
    }


}