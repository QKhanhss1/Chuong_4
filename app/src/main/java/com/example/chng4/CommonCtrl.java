package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CommonCtrl extends AppCompatActivity {
    Button btnTxtView, btnEdtView, btnButton, btnImage,btnCheck, btnRadio, btnScrool;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_commoncontrol);
        btnTxtView = findViewById(R.id.textView);
        btnTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, TextView.class);
                startActivity(layoutintent);
            }
        });
    }




}
