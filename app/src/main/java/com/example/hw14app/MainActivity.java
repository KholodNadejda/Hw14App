package com.example.hw14app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v) {
        Intent intent = new Intent(this, App1.class);
        startActivity(intent);
    }
    public void onClick2(View v) {
        Intent intent = new Intent(this, App2.class);
        startActivity(intent);
    }
    public void onClick3(View v) {
        Intent intent = new Intent(this, App3.class);
        startActivity(intent);
    }
}