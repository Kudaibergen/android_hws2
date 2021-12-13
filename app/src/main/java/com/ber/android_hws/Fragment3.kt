package com.ber.android_hws

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment

class Fragment3: Fragment(R.layout.fragment_3) {
    private lateinit var listener: Navigator

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as Navigator
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editMail = view.findViewById<AppCompatEditText>(R.id.edit_mail)
        val editPassword = view.findViewById<AppCompatEditText>(R.id.edit_password)

        val login = "bembakyt@gmail.com"
        val password = "Memento"
        val btnSignIn = view.findViewById<AppCompatButton>(R.id.btn_sign_in)
        btnSignIn.setOnClickListener {
            if (login == editMail.text.toString() && password == editPassword.text.toString()) {
                listener.showMainFragment()
            } else {
                Toast.makeText(
                    requireContext(),
                    "Error: Incorrect login and password",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}