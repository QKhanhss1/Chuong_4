package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activityketqua extends AppCompatActivity {
   TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ketqua_im);
        textView=(TextView) findViewById (R.id.textViewResult);

        Intent intent = getIntent();
        int numberA = intent.getIntExtra("numberA", 0);
        int numberB = intent.getIntExtra("numberB", 0);

        // Tính toán kết quả
        int result = numberA + numberB;
        // Hiển thị kết quả
        textView.setText("result"+result);
    }
}
