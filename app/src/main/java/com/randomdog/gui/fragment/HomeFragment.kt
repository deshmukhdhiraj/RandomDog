package com.randomdog.gui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.nasapictures.base.BaseFragment
import com.randomdog.R
import com.randomdog.databinding.HomeFragBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.home_frag
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ViewBinding =
        HomeFragBinding::inflate
    override val binding: HomeFragBinding
        get() = super.binding as HomeFragBinding

    override fun onInitView() {

        binding.apply {
            tvGenerate.setOnClickListener {
                findNavController().navigate(R.id.action_homeFrag_to_generatedogsFragment)
            }


            tvRecent.setOnClickListener {

                findNavController().navigate(R.id.action_homeFrag_to_allDogsFragment)
            }
        }
    }

}