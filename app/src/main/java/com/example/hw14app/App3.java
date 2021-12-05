package com.example.hw14app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class App3 extends AppCompatActivity {

    ArrayList<String> conundrum = new ArrayList();
    ArrayList<String> resultConundrum = new ArrayList();
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app3);
    }

    public void enretCon() {
        conundrum.add(0,"Mary’s father has five daughters – Nana, Nene, Nini, Nono. What is the fifth daughter’s name?");
        conundrum.add(1,"If I drink, I die. If I eat, I am fine. What am I?");
        conundrum.add(2,"1+1?");
        conundrum.add(3,"5+5?");

        resultConundrum.add(0,"Mary");
        resultConundrum.add(1,"fire");
        resultConundrum.add(2,"2");
        resultConundrum.add(3,"10");
    }

    public void onClick31(View view) {
        enretCon();
        TextView text = findViewById(R.id.textView8);
        text.setText(conundrum.get(random()));
    }

    public void onClick32(View view) {
        TextView text = findViewById(R.id.textView10);
        EditText mEditText = findViewById(R.id.editResult);
        String enretRes = mEditText.getText().toString();
        if(enretRes.equalsIgnoreCase(resultConundrum.get(index))){
            text.setText("Right");
        } else {
            text.setText("Not right, answer '"+resultConundrum.get(index)+"'");
        }
    }

    public int random() {
        return index = (int) (Math.random()*conundrum.size());
    }
}