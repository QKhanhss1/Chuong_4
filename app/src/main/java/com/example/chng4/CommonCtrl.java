package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CommonCtrl extends AppCompatActivity {
    Button btnTxtView, btnEdtView, btnButton, btnImage,btnCheck, btnRadio, btnScrollView;
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
        btnEdtView = findViewById(R.id.editview);
        btnEdtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, EditView.class);
                startActivity(layoutintent);
            }
        });
        btnButton = findViewById(R.id.button);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, com.example.chng4.Button.class);
                startActivity(layoutintent);
            }
        });
        btnCheck = findViewById(R.id.checkbox);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, com.example.chng4.Checkbox.class);
                startActivity(layoutintent);
            }
        });
        btnRadio = findViewById(R.id.radio);
        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, MyRadioButtonActivity.class);
                startActivity(layoutintent);
            }
        });
        btnImage=findViewById(R.id.image);
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, Myimage.class);
                startActivity(layoutintent);
            }
        });

        btnScrollView=findViewById(R.id.scrollView);
        btnScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(CommonCtrl.this, ScrollView.class);
                startActivity(layoutintent);
            }
        });
    }




}
