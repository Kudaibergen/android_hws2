package com.ber.android_hws

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnButtonClicked

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn1 = view.findViewById<AppCompatButton>(R.id.btn_1)
        val btn2 = view.findViewById<AppCompatButton>(R.id.btn_2)
        val btn3 = view.findViewById<AppCompatButton>(R.id.btn_3)
    }
    private fun translateIdToIndex(id:Int): Int {
        var index = -1
        when (id) {
            R.id.btn_1 -> index = 1
            R.id.btn_2 -> index = 2
            R.id.btn_3 -> index = 3
        }
        return index
    }
    fun onClick(v: View?) {
        val  buttonIndex = translateIdToIndex(v!!.id)
    }
}