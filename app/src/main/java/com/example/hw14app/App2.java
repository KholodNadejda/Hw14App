package com.example.hw14app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class App2 extends AppCompatActivity {
    ArrayList<String> res = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);
    }

    public void onClick22(View view) {
        results();
        TextView text = findViewById(R.id.textView7);
        text.setText(res.get(random()));
    }
    public void results() {
        res.add("Да");
        res.add("Нет");
        res.add("Скорее всего да");
        res.add("Скорее всего нет");
        res.add("Возможно");
        res.add("Имеются перспективы");
        res.add("Вопрос задан неверно");
    }
    public int random() {
        return (int) (Math.random()*res.size());
    }
}