package com.example.lesson8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw1;
    ToggleButton tg1;
    Button b1;
    View main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (View) findViewById(R.id.main);

        sw1 = (Switch) findViewById(R.id.sw1);
        tg1 = (ToggleButton) findViewById(R.id.tg1);
        b1 = (Button)findViewById(R.id.b1);
    }

    public void click(View view) {
        if (sw1.isChecked()){
            if (tg1.isChecked()){
                main.setBackgroundColor(Color.rgb(255, 101, 101));
            }
            else {
                main.setBackgroundColor(Color.rgb(111, 101, 255));
            }
        }
        else {
            if (tg1.isChecked()) {
                main.setBackgroundColor(Color.rgb(0, 166, 55));
            } else {
                main.setBackgroundColor(Color.rgb(255, 171, 0));
            }
        }
    }
}