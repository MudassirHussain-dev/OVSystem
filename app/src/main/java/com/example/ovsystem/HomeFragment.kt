package com.example.ovsystem


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import com.example.ovsystem.adapter.SliderImageAdapter
import com.example.ovsystem.model.SliderData
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}