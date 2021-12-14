package com.example.hw14app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class App4 : AppCompatActivity() {
    private var toInt1 = 0
    private var toInt2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app4)
    }

    @SuppressLint("SetTextI18n")
    fun onClick41(view: View) {
        enterInt()
        val text = findViewById<TextView>(R.id.textView12)
        text.text = "Результат: " + (toInt1 + toInt2)
    }

    @SuppressLint("SetTextI18n")
    fun onClick42(view: View) {
        enterInt()
        val text = findViewById<TextView>(R.id.textView12)
        text.text = "Результат: " + (toInt1 - toInt2)
    }

    @SuppressLint("SetTextI18n")
    fun onClick43(view: View) {
        enterInt()
        val text = findViewById<TextView>(R.id.textView12)
        text.text = "Результат: " + toInt1 * toInt2
    }

    @SuppressLint("SetTextI18n")
    fun onClick44(view: View) {
        enterInt()
        val text = findViewById<TextView>(R.id.textView12)
        if (toInt2 == 0) {
            text.text = "Ошибка! Деление на 0"
        } else {
            text.text = "Результат: " + toInt1 / toInt2
        }
    }

    private fun enterInt() {
        val int1 = findViewById<EditText>(R.id.editTextNumber)
        val int2 = findViewById<EditText>(R.id.editTextNumber2)
        toInt1 = int1.text.toString().toInt()
        toInt2 = int2.text.toString().toInt()
    }
}