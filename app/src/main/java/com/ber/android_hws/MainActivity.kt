package com.ber.android_hws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(), OnButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragments()

    }
    private fun initFragments() {
        val fragment1 = supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container1, Fragment1())
            .commit()
        val fragment2 = supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container2, Fragment2())
            .commit()
    }

    override fun onClick(buttonIndex: Int) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragment_container2) as Fragment2?
        fragment2?.setImage(buttonIndex)
    }

}

