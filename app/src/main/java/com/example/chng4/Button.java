package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Button extends AppCompatActivity {
    android.widget.Button btnBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        btnBack = findViewById(R.id.BackButton);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void go(View view) {
        Toast.makeText(this, "Tôi đã bị nhấn", Toast.LENGTH_SHORT).show();
    }

    public void go2(View view) {
        Toast.makeText(this, "Tôi đã bị nhấn\"đỏ\"", Toast.LENGTH_SHORT).show();
    }

    public void go3(View view) {
        Toast.makeText(this, "Một tôi khác đã bị nhấn", Toast.LENGTH_SHORT).show();
    }
}

