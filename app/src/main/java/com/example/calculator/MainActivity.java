package com.example.calculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button zero, one, two, three, four, five, six, seven, eight, nine, divided, multiply, minus,
            pluse, equal, dot, clear,root,power,parcend;
    ImageButton back;
    double valueOne=Double.NaN, valueTwo=Double.NaN,vpower;
    int action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.content);
        textView2 = (TextView) findViewById(R.id.result);

    }
}