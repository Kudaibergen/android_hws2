package com.ber.android_hws

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment_2) {
    private lateinit var listener: OnClickListener2
    private lateinit var text2: AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener2
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text2 = view.findViewById(R.id.txt_2)
        val edit2 = view.findViewById<AppCompatEditText>(R.id.edit_2)
        val btn2 = view.findViewById<AppCompatButton>(R.id.btn_2)
        btn2.setOnClickListener {
           val editText2 = edit2.text
            listener.onClick2(editText2.toString())
        }
    }
    fun setText2(value: String) {
        text2.text = value
    }
}