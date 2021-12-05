package com.example.hw14app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class App4 extends AppCompatActivity {

    int toInt1;
    int toInt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app4);
    }

    public void onClick41(View view) {
        enretInt();
        TextView text = findViewById(R.id.textView12);
        text.setText("Результат: " + (toInt1+toInt2));
    }

    public void onClick42(View view) {
        enretInt();
        TextView text = findViewById(R.id.textView12);
        text.setText("Результат: " + (toInt1-toInt2));
    }

    public void onClick43(View view) {
        enretInt();
        TextView text = findViewById(R.id.textView12);
        text.setText("Результат: " + (toInt1*toInt2));
    }

    public void onClick44(View view) {
        enretInt();
        TextView text = findViewById(R.id.textView12);
        if(toInt2 == 0) {
            text.setText("Ошибка! Деление на 0");
        } else {
            text.setText("Результат: " + (toInt1/toInt2));
        }
    }

    public void enretInt() {
        EditText int1 = findViewById(R.id.editTextNumber);
        EditText int2 = findViewById(R.id.editTextNumber2);
        toInt1 = Integer.parseInt(int1.getText().toString());
        toInt2 = Integer.parseInt(int2.getText().toString());
    }
}