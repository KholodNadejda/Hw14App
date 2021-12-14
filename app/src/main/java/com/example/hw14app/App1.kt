package com.example.hw14app

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class App1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app1)
    }

    fun convertLettersClick(view: View) {
        val mEditText = findViewById<EditText>(R.id.editTextInput)
        var castToString = mEditText.text.toString()
        val text = findViewById<TextView>(R.id.textView5)
        castToString = castToString.replace('a', 'o')
        castToString = castToString.replace('A', 'O')
        text.text = castToString
    }

}