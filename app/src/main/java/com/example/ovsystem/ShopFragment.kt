package com.example.ovsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ovsystem.adapter.Sliders
import com.example.ovsystem.model.SliderData
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.fragment_shop.*
import java.util.ArrayList

class ShopFragment : Fragment() {

   // lateinit var sliderView: SliderView
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
        // Inflate the layout for this fragment
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