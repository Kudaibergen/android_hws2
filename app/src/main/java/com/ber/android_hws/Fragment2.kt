package com.ber.android_hws

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment_2) {
    private lateinit var int: AppCompatImageView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        int = view.findViewById<AppCompatImageView>(R.id.img)
    }
    fun setImage(img: AppCompatImageView) {
        img =

    }
}