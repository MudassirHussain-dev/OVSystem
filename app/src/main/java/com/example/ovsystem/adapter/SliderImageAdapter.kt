package com.example.ovsystem.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.ovsystem.databinding.SliderLayoutBinding
import com.example.ovsystem.model.SliderData
import com.smarteist.autoimageslider.SliderViewAdapter


class SliderImageAdapter(
    private val context: Context,
    private val arrayList: ArrayList<SliderData>
) :
    SliderViewAdapter<SliderImageAdapter.SliderAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterViewHolder {
        return SliderAdapterViewHolder(
            SliderLayoutBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SliderAdapterViewHolder?, position: Int) {
        holder!!.bindItem(arrayList[position])
    }


    override fun getCount(): Int {
        return arrayList.size
    }


    inner class SliderAdapterViewHolder(val binding: SliderLayoutBinding) :
        SliderViewAdapter.ViewHolder(binding.root) {
        fun bindItem(sliderData: SliderData) {

            Glide.with(context)
                .load(sliderData.imgUrl)
                .fitCenter()
                .into(binding.myimage)

        }

    }
}