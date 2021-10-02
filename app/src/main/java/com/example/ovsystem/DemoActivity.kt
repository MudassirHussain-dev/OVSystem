package com.example.ovsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.ovsystem.adapter.SliderImageAdapter
import com.example.ovsystem.model.SliderData
import com.smarteist.autoimageslider.SliderView
import java.util.*

class DemoActivity : AppCompatActivity() {

    var url1 = "https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png"
    var url2 = "https://qphs.fs.quoracdn.net/main-qimg-8e203d34a6a56345f86f1a92570557ba.webp"
    var url3 =
        "https://bizzbucket.co/wp-content/uploads/2020/08/Life-in-The-Metro-Blog-Title-22.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        val sliderDataArrayList = ArrayList<SliderData>()

        val sliderView = findViewById<SliderView>(R.id.slider1)

        sliderDataArrayList.add(SliderData(url1.toUri()))
        sliderDataArrayList.add(SliderData(url2.toUri()))
        sliderDataArrayList.add(SliderData(url3.toUri()))

        val adapter = SliderImageAdapter(this@DemoActivity, sliderDataArrayList)
        sliderView.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR
        sliderView.setSliderAdapter(adapter)

        sliderView.scrollTimeInSec = 3
        sliderView.isAutoCycle = true
        sliderView.startAutoCycle()
    }
}