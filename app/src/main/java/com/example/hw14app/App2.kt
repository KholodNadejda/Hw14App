package com.example.hw14app

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class App2 : AppCompatActivity() {
    var res: ArrayList<String?> = ArrayList<String?>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app2)
        results()
    }

    fun magicBallClick(view: View?) {
        val text = findViewById<TextView>(R.id.textView7)
        text.text = res[random()]
    }

    private fun results() {
        res.add("Да")
        res.add("Нет")
        res.add("Скорее всего да")
        res.add("Скорее всего нет")
        res.add("Возможно")
        res.add("Имеются перспективы")
        res.add("Вопрос задан неверно")
    }

    private fun random(): Int {
        return (Math.random() * res.size).toInt()
    }
}