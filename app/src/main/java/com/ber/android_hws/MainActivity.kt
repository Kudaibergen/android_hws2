package com.ber.android_hws

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    private lateinit var email : AppCompatEditText
    private lateinit var subject : AppCompatEditText
    private lateinit var text : AppCompatEditText
    private lateinit var btn : AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.btn)
        val subject = findViewById<AppCompatEditText>(R.id.subject).text.toString()
        val txt = findViewById<AppCompatEditText>(R.id.txt).text.toString()
        val email = findViewById<AppCompatEditText>(R.id.email).text.toString()


        btn.setOnClickListener{
            val emails = email.split(",".toRegex()).toTypedArray()
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL, emails)
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, txt)
            intent.type = "message/rfc822"

            if (intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity, "Приложение не установлено", Toast.LENGTH_SHORT).show()
            }
        }
    }
}