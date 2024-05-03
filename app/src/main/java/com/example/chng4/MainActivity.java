package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnChuyenMH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnChuyenMH= findViewById(R.id.btnDoimanhinh);
    }

    public void sukienChuyenmanHinh(View view) {
        //Tao button trong trang moi
        Button btnMoi= new Button(MainActivity.this){
            //onclick quay ve giao dien cu
            @Override
            public boolean performLongClick() {
                setContentView(R.layout.activity_main);
                return super.performLongClick();
            }
        };
        btnMoi.setText("Quay ve");
        btnMoi.setHeight(400);
        btnMoi.setWidth(200);
        //hien thi button moi trong man hinh
        setContentView(btnMoi);
    }
}
