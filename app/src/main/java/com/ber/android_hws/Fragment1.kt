package com.ber.android_hws

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment_1) {
    private lateinit var listener: OnClickListener
    private lateinit var text: AppCompatTextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClickListener
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text = view.findViewById((R.id.txt_1))
        val edit = view.findViewById<AppCompatEditText>(R.id.edit_1)
        val btn = view.findViewById<AppCompatButton>(R.id.btn_1)
        btn.setOnClickListener {
            val editText = edit.text
            listener.onClicked(editText.toString())
        }
    }
    fun setText(value: String) {
        text.text = value
    }
}
