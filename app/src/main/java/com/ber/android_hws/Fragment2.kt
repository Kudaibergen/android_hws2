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
    private lateinit var listener: OnButtonClicked
    private lateinit var text2: AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnButtonClicked
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text2 = view.findViewById(R.id.txt_2)
        val edit2 = view.findViewById<AppCompatEditText>(R.id.edit_2)
        val btn2 = view.findViewById<AppCompatButton>(R.id.btn_2)
        btn2.setOnClickListener {
           val editText2 = edit2.text
            listener.setText1(editText2.toString())
        }
    }
    fun setText1(value: String) {
        text2.text = value
    }
}