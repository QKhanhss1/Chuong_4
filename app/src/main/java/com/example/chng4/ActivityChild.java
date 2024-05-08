package com.example.chng4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityChild extends AppCompatActivity {
    Button btnKetqua;
    EditText soA, soB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutim);
        btnKetqua = findViewById(R.id.btnKq);
        soA = findViewById(R.id.EdtA);
        soB = findViewById(R.id.EdtB);
        int numberA = Integer.parseInt(soA.getText().toString());
        int numberB = Integer.parseInt(soA.getText().toString());
        int result = numberA + numberB;

        btnKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Chuyển hướng đến trang kkahsc và truyền kết quả
                Intent intent = new Intent(ActivityChild.this, Activityketqua.class);
                intent.putExtra("numberA", numberA);
                intent.putExtra("numberB", numberB);
                startActivity(intent);
            }
        });
    }
}
