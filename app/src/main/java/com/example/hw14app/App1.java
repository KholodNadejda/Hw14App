package com.example.hw14app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class App1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app1);
    }

    public void onClick11(View v) {
        EditText mEditText = findViewById(R.id.editTextInput);
        String castToString = mEditText.getText().toString();
        TextView text = findViewById(R.id.textView5);

        castToString = castToString.replace('a', 'o');
        castToString = castToString.replace('A', 'O');

        text.setText(castToString);
    }
}