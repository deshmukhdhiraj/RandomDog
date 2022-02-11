package com.android.base.com.gui.fragment

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.nasapictures.base.BaseFragment
import com.randomdog.Help
import com.randomdog.R
import com.randomdog.databinding.ImageDetailBinding
import com.randomdog.gui.adapter.CustomPagerAdapter


class ShowDogImagesFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.image_detail
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ViewBinding =
        ImageDetailBinding::inflate
    var list: List<Bitmap> = ArrayList(Help.cache.getAllImage()!!.values)
    companion object {
        const val ARG_OBJECT = "object"
    }

    override val binding: ImageDetailBinding get() = super.binding as ImageDetailBinding
    private lateinit var demoCollectionAdapter: CustomPagerAdapter

    override fun onInitView() {


        demoCollectionAdapter = CustomPagerAdapter(this)
        binding.apply {

            pager.apply {
                this.adapter = demoCollectionAdapter
                demoCollectionAdapter.ResponseData = list
            }
            tvclear.setOnClickListener {

                Help.cache.removeAll()
                list = ArrayList(Help.cache.getAllImage()!!.values)
                demoCollectionAdapter.ResponseData = list
            }

        }
    }

}