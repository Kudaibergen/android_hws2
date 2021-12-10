package com.ber.android_hws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
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
}
