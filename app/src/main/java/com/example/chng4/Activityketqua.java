package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activityketqua extends AppCompatActivity {
    TextView tvKetqua;
    Button Back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ketqua_im);
        Back= findViewById(R.id.BackResultIm);
        tvKetqua = findViewById(R.id.textViewResult);

        // Nhận Bundle từ Intent
        Bundle bundle = getIntent().getExtras();

        // Lấy dữ liệu từ Bundle
        int numberA = bundle.getInt("numberA");
        int numberB = bundle.getInt("numberB");
        int result = bundle.getInt("result");
        // Hiển thị kết quả
        tvKetqua.setText("Kết quả: " + numberA + " + " + numberB + " = " + result);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
