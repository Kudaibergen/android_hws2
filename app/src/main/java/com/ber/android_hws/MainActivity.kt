package com.ber.android_hws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(), OnButtonClicked {
    private var mImageView: ImageView? = null
    private val mImageAddress = "https://www.pinterest.com/pin/422281206417660/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()
        mImageView = findViewById(R.id.img);
    }
    private fun initFragments() {
        val fragment1 = supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container1, Fragment1())
            .commit()
        val fragment2 = supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container2, Fragment2())
            .commit()
    }
    fun onClick() {
        ///
    }
}

