package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Checkbox extends AppCompatActivity {
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    View btnBack;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        cb1=(CheckBox)findViewById(R.id.checkbox1);
        cb2=(CheckBox)findViewById(R.id.checkbox2);
        cb3=(CheckBox)findViewById(R.id.checkbox3);
        cb4=(CheckBox)findViewById(R.id.checkbox4);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    Toast.makeText(Checkbox.this, "bạn đã chọn Tôi", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Checkbox.this, "bạn bỏ chọn Tôi", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btnBack = findViewById(R.id.BackCheckbox);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
