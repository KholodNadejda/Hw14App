package com.example.hw14app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick1(view: View) {
        val intent = Intent(this, App1::class.java)
        startActivity(intent)
    }

    fun onClick2(view: View) {
        val intent = Intent(this, App2::class.java)
        startActivity(intent)
    }

    fun onClick3(view: View) {
        val intent = Intent(this, App3::class.java)
        startActivity(intent)
    }

    fun onClick4(view: View) {
        val intent = Intent(this, App4::class.java)
        startActivity(intent)
    }
}