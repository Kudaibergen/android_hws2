package com.ber.android_hws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), Navigator  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, Fragment1())
            .commit()
    }


    override fun showMainFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, Fragment2())
            .commit()
    }

    override fun showSignInPage() {
         supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, Fragment1())
            .commit()
    }
}

