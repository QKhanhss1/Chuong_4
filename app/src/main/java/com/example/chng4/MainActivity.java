package com.example.chng4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnIntent,btnLayout,btnCommonCtrl,btnWebkit,btnAdva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIntent = findViewById(R.id.btn36);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this, ActivityIntent.class);
                startActivity(myintent);
            }
        });
        btnLayout = findViewById(R.id.btn31);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(MainActivity.this, XML_Layout.class);
                startActivity(layoutintent);
            }
        });
        btnCommonCtrl = findViewById(R.id.btn32);
        btnCommonCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(MainActivity.this, CommonCtrl.class);
                startActivity(layoutintent);
            }
        });
        btnWebkit = findViewById(R.id.btn35);
        btnWebkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(MainActivity.this, Webkit.class);
                startActivity(layoutintent);
            }
        });

        btnAdva = findViewById(R.id.btn33);
        btnAdva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(MainActivity.this, advaced_control.class);
                startActivity(layoutintent);
            }
        });
    }
}



