package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

public class ActivityLayout extends AppCompatActivity {
    Button btnLinear,btnRelative,btnGrid,btnFrame,btnConstrain;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_commonlayout);
        btnLinear=findViewById(R.id.btnLinear);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Linear = new Intent(ActivityLayout.this, AcvityLinear.class);
                startActivity(Linear);
            }
        });
        btnRelative=findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relaitve = new Intent(ActivityLayout.this, Relative.class);
                startActivity(relaitve);
    }
        });
        btnGrid=findViewById(R.id.btnGrid);
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relaitve = new Intent(ActivityLayout.this, GridLayout.class);
                startActivity(relaitve);
            }
        });
        btnFrame=findViewById(R.id.btnFrame);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relaitve = new Intent(ActivityLayout.this, Frame.class);
                startActivity(relaitve);
            }
        });
        btnConstrain=findViewById(R.id.btnConstrain);
        btnConstrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relaitve = new Intent(ActivityLayout.this, Constrain.class);
                startActivity(relaitve);
            }
        });
    }
}