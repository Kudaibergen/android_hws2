package com.ber.android_hws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(), OnClickListener, OnClickListener2 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClicked(text: String) {
        val fragment1 = supportFragmentManager.findFragmentById(R.id.fragment_container1) as? Fragment1
        fragment1?.setText(text)
    }

    override fun onClick2(text2: String) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragment_container2) as? Fragment2
        fragment2?.setText2(text2)
    }
}

