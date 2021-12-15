package com.ber.android_hws

import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class MainFragment: Fragment(R.layout.main_fragment) {
private lateinit var listener: Navigator

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as Navigator
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)
        toolbar.inflateMenu(R.menu.menu)

        toolbar.setOnMenuItemClickListener {
            if(it.itemId == R.id.menu_profile) {
                 listener.showProfileFragment()
            } else
                Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show()
            true
        }
        toolbar.setOnMenuItemClickListener {
            if(it.itemId == R.id.menu_logout) {
                listener.showSignInPage()
            } else
                Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show()
            true
        }
    }
}