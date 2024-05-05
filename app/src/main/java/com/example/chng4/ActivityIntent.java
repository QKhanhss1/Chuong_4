package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityIntent extends AppCompatActivity {
    Button btnExPLI, btnImpli,btnResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_intent);
        btnExPLI = findViewById(R.id.btnEcp);
        btnImpli = findViewById(R.id.btnIm);
        btnResult = findViewById(R.id.btnRes);


        btnExPLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imintent = new Intent(ActivityIntent.this, ActivityChild.class);
                startActivity(imintent);
            }
        });
        btnImpli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(ActivityIntent.this, ActivityEx.class);
                startActivity(myintent);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resintent = new Intent(ActivityIntent.this, InputNameActivity.class);
                startActivity(resintent);
            }
        });
        }
}

