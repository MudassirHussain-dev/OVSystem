package com.example.ovsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ovsystem.adapter.Sliders
import com.example.ovsystem.model.SliderData
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import java.util.*

class DemoActivity : AppCompatActivity() {

    lateinit var sliderView: SliderView
    var images = intArrayOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        val sliderDataArrayList = ArrayList<SliderData>()

        sliderView = findViewById(R.id.image_slider)

        val sliderAdapter = Sliders(images)

        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        sliderView.startAutoCycle()
    }
}