package com.ber.android_hws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ber.android_hws.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply{
            btn0.setOnClickListener{setTextFields("0")}
            btn1.setOnClickListener{setTextFields("1")}
            btn2.setOnClickListener{setTextFields("2")}
            btn3.setOnClickListener{setTextFields("3")}
            btn4.setOnClickListener{setTextFields("4")}
            btn5.setOnClickListener{setTextFields("5")}
            btn6.setOnClickListener{setTextFields("6")}
            btn7.setOnClickListener{setTextFields("7")}
            btn8.setOnClickListener{setTextFields("8")}
            btn9.setOnClickListener{setTextFields("9")}

            btnMinus.setOnClickListener{setTextFields("-")}
            btnMultiply.setOnClickListener{setTextFields("*")}
            btnDivision.setOnClickListener{setTextFields("/")}
            btnPlus.setOnClickListener{setTextFields("+")}
            btnOpenBracket.setOnClickListener{setTextFields("(")}
            btnCloseBracket.setOnClickListener{setTextFields(")")}
            btnDot.setOnClickListener{setTextFields(".")}

            btnClear.setOnClickListener {
                mathOperation.text = ""
                resultText.text = ""
            }
            backBtn.setOnClickListener {
                val str = mathOperation.text.toString()
                if (str.isNotEmpty()) {
                    mathOperation.text = str.substring(0, str.length - 1)

                    resultText.text = ""
                }
            equalsBtn.setOnClickListener {
                try {
                    val ex = ExpressionBuilder(mathOperation.text.toString()).build()
                    val result = ex.evaluate()

                    val longRes = result.toLong()
                    if (result == longRes.toDouble())
                        resultText.text = longRes.toString()
                    else
                        resultText.text = result.toString()
                } catch (e: Exception) {
                    Log.d("Error", "${e.message}")
                }
            }
            }
        }
    }
    fun setTextFields(str: String) {
        if(binding.resultText.text != "") {
            binding.mathOperation.text = binding.resultText.text
            binding.resultText.text = ""
        }
        binding.mathOperation.append(str)
    }
}
