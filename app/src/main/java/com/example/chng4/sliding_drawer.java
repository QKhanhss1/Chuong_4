package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class sliding_drawer extends AppCompatActivity {

    private View simpleSlidingDrawer;
    private Button handleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_drawer);

        // Khoi tao view
        simpleSlidingDrawer = findViewById(R.id.simpleSlidingDrawer);
        handleButton = findViewById(R.id.handle);

        // Ánh xạ khi click
        handleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (simpleSlidingDrawer.callOnClick()){
                    simpleSlidingDrawer.callOnClick();
                    handleButton.setText("Open");
                } else {
                    simpleSlidingDrawer.callOnClick();
                    handleButton.setText("Close");
                }
            }
        });
    }
}
