package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class advaced_control extends AppCompatActivity {

    Button btn1; Button bt4;
    Button bt2;  Button bt5;
    Button bt3,bt6,bt7,bt8,bt9,bt10;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advaced_control);
        btn1 = findViewById(R.id.bt1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //KB intent
                Intent myintent = new Intent(advaced_control.this, List_View.class);
                // star
                startActivity(myintent);
            }
        });
        bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this, Spiner.class);
                // star
                startActivity(myintent);
            }
        });

        bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this, sliding_drawer.class);
                // star
                startActivity(myintent);
            }
        });
        bt4 = findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,auto_complete.class);
                // star
                startActivity(myintent);
            }
        });

        bt5 = findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,text_view.class);
                // star
                startActivity(myintent);
            }
        });
        bt6 = findViewById(R.id.bt6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,GridViewActivity.class);
                // star
                startActivity(myintent);
            }
        });
        bt10 = findViewById(R.id.bt10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,MenuActivity.class);
                // star
                startActivity(myintent);
            }
        });

        bt7 = findViewById(R.id.bt7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,TimeSelection.class);
                // star
                startActivity(myintent);
            }
        });
        
        bt9 = findViewById(R.id.bt9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,tab_selector.class);
                // star
                startActivity(myintent);
            }
        });
        bt8 = findViewById(R.id.bt8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //KB intent
                Intent myintent = new Intent(advaced_control.this,PictureGallery.class);
                // star
                startActivity(myintent);
            }
        });

    }
}
