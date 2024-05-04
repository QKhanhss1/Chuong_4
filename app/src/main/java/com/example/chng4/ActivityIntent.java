package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityIntent extends AppCompatActivity {
    Button btnIMPLI;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_intent);
        btnIMPLI = findViewById(R.id.btnIm);

        btnIMPLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imintent = new Intent(ActivityIntent.this, ActivityChild.class);
                startActivity(imintent);
            }
        });

        }
}

