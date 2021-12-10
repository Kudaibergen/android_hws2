package com.ber.android_hws

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment_2) {
    private lateinit var changingImageView: AppCompatImageView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changingImageView = view.findViewById(R.id.img)

        }
    private fun setImage(buttonIndex: Int) {
        when (buttonIndex) {
            1 -> changingImageView.setImageResource(R.drawable.cat1)
            2 -> changingImageView.setImageResource(R.drawable.cat2)
            3 -> changingImageView.setImageResource(R.drawable.cat3)
            else -> {
            }
        }
    }
    }
