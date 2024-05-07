package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.chng4.R.id;

public class MyRadioButtonActivity extends AppCompatActivity {
    View btnBack;
    RadioGroup radioGroup;
    RadioButton rd1,rd2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
        radioGroup=(RadioGroup) findViewById(id.RadioGrgioitinh);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if (i == id.optionnu) {
                    Toast.makeText(MyRadioButtonActivity.this, "Bạn chọn nữ", Toast.LENGTH_SHORT).show();
                } else if (i == id.optionnam) {
                    Toast.makeText(MyRadioButtonActivity.this, "Bạn chọn nam", Toast.LENGTH_SHORT).show();
                }
            }
        });
       btnBack=findViewById(id.BackRadiobutton);
       btnBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });

    }
}
