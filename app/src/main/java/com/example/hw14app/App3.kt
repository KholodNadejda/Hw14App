package com.example.hw14app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class App3 : AppCompatActivity() {
    private var conundrum: ArrayList<String?> = ArrayList<String?>()
    private var resultConundrum: ArrayList<String?> = ArrayList<String?>()
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app3)
        enterCon()
    }

    private fun enterCon() {
        conundrum.add(
            0,
            "Mary’s father has five daughters – Nana, Nene, Nini, Nono. What is the fifth daughter’s name?"
        )
        conundrum.add(1, "If I drink, I die. If I eat, I am fine. What am I?")
        conundrum.add(2, "1+1?")
        conundrum.add(3, "5+5?")
        resultConundrum.add(0, "Mary")
        resultConundrum.add(1, "fire")
        resultConundrum.add(2, "2")
        resultConundrum.add(3, "10")
    }

    fun onClick31(view: View) {
        val text = findViewById<TextView>(R.id.textView8)
        text.text = conundrum[random()]
    }

    @SuppressLint("SetTextI18n")
    fun onClick32(view: View) {
        val text = findViewById<TextView>(R.id.textView10)
        val mEditText = findViewById<EditText>(R.id.editResult)
        val enterRes = mEditText.text.toString()
        if (enterRes.equals(resultConundrum[index], ignoreCase = true)) {
            text.text = "Right"
        } else {
            text.text = "Not right, answer '" + resultConundrum[index] + "'"
        }
    }

    private fun random(): Int {
        index = (0..conundrum.size).random()
        return index
    }
}