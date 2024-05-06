package com.example.chng4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnIntent,btnLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIntent = findViewById(R.id.btn36);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this, ActivityIntent.class);
                startActivity(myintent);
            }
        });
        btnLayout = findViewById(R.id.btn31);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutintent =new Intent(MainActivity.this, ActivityLayout.class);
                startActivity(layoutintent);
            }
        });
    }
}

public class MainActivity extends AppCompatActivity {
    Button btn3;
    private Object setOnClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3.1 = findViewById(R.btn3.1);
        btn3.1 setOnClickListener( new View.OnClickListener(){
            private String packageContext;

            @Override
        public void onClick( View view)
                //khai bao intent
          Intent myintent = new Intent(packageContext: MainActivity.this, Mainviewandviewgroup.class);
          startActivity(myintent);
    }

    });
 }
}  


