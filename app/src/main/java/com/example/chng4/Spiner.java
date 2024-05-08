package com.example.chuong3;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Spiner extends AppCompatActivity {
    Button btn_b1;
    Spinner spinnerDanhSachTraiCay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner);
//anh xa
        spinnerDanhSachTraiCay =(android.widget.Spinner)findViewById(R.id.spinner);
//tao D.sach
        ArrayList<String> arrayCacLoaiTraiCay = new ArrayList<String>();
        arrayCacLoaiTraiCay.add(" Trái cây ");
        arrayCacLoaiTraiCay.add(" Nho ");
        arrayCacLoaiTraiCay.add(" Lựu ");
        arrayCacLoaiTraiCay.add(" Nhãn ");
        arrayCacLoaiTraiCay.add(" Cam ");
        arrayCacLoaiTraiCay.add(" Chuối ");
//truyen vao adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arrayCacLoaiTraiCay);
       //dieu chinh dan cach cac chu cho de nhin
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDanhSachTraiCay.setAdapter(arrayAdapter);


        btn_b1 = findViewById(R.id.btn_b2);
        btn_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
