package com.example.arithmeticapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.arithmeticapp.Evodd;
import com.example.arithmeticapp.Largest;
import com.example.arithmeticapp.R;
import com.example.arithmeticapp.Smallest;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2,b3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1= (AppCompatButton) findViewById(R.id.lar);
        b2= (AppCompatButton) findViewById(R.id.small);
        b3= (AppCompatButton) findViewById(R.id.evodd);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Largest.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Smallest.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Evodd.class);
                startActivity(i);
            }
        });
    }
}