package com.randomdog.gui.adapter

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.android.base.com.gui.fragment.ShowDogImagesFragment
import com.randomdog.gui.fragment.SwipeViewFragment
import kotlin.properties.Delegates

class CustomPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    internal var ResponseData: List<Bitmap> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = ResponseData.size

    override fun createFragment(position: Int): Fragment {
        val fragment = SwipeViewFragment()
        fragment.arguments = Bundle().apply {
            putParcelable(ShowDogImagesFragment.ARG_OBJECT, ResponseData[position])
        }
        return fragment
    }
}

