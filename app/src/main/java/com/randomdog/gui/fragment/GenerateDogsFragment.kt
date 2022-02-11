package com.randomdog.gui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.viewbinding.ViewBinding
import com.nasapictures.base.BaseFragment
import com.randomdog.Cache
import com.randomdog.R
import com.randomdog.databinding.GenerateDogsFragmentBinding
import com.randomdog.gui.viewmodel.GenerateDogViewModel
import com.randomdog.loadUrl
import com.randomdog.observe
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class GenerateDogsFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.generate_dogs_fragment
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ViewBinding =
        GenerateDogsFragmentBinding::inflate
    override val binding: GenerateDogsFragmentBinding get() = super.binding as GenerateDogsFragmentBinding

    var counter: Int = 0

    private val viewmodel: GenerateDogViewModel by viewModels()


    override fun onInitView() {
        viewmodel.apply {
            observe(getDogImage) {
                if (it.status.equals("success")) {
                    binding.apply {
                        ivdogs.loadUrl(it.message)
                        ivdogs.Cache(it.message, counter.toString())
                    }
                }
            }

        }
        binding.apply {
            tvGenerate.setOnClickListener {
                counter++
                viewmodel.getDogImage()
            }
        }


    }
}