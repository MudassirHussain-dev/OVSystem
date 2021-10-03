package com.example.ovsystem.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ovsystem.R
import com.example.ovsystem.adapter.Sliders
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.fragment_shop.*

class ShopFragment : Fragment() {
    var images = intArrayOf(
        R.drawable.vgtable,
        R.drawable.vgtable,
        R.drawable.vgtable,
        R.drawable.vgtable,
        R.drawable.vgtable,
        R.drawable.vgtable,
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

           return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val sliderAdapter = Sliders(images)

        image_slider.setSliderAdapter(sliderAdapter)
        image_slider.setIndicatorAnimation(IndicatorAnimationType.WORM)
        image_slider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        image_slider.startAutoCycle()
    }


}