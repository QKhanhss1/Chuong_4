package com.example.chng4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class XML_Layout extends AppCompatActivity {
    Button btnView, btnLayout1,btnToast;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_xml_layout);
        btnView = findViewById(R.id.btnView);
        btnLayout1 = findViewById(R.id.btnLayout1);
        btnToast = findViewById(R.id.btnToast);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imintent = new Intent(XML_Layout.this, VIewGroup.class);
                startActivity(imintent);
            }
        });
        btnLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(XML_Layout.this, ActivityLayout.class);
                startActivity(myintent);
            }
        });
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resintent = new Intent(XML_Layout.this, Toast_Dialog.class);
                startActivity(resintent);
            }
        });
    }
}

