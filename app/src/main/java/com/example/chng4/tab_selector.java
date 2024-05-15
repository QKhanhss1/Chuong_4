package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class tab_selector extends AppCompatActivity {
    EditText edit_a, edit_b;
    Button btncong;
    TabHost mytab;
    //khai bao lissview
    ListView lv;
    ArrayList<String> mylist;
    ArrayAdapter<String> myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_selector);
        addControl();
        addEvent();
    }

    private void addEvent() {
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edit_a.getText().toString());
                int b = Integer.parseInt(edit_b.getText().toString());
                int c = a + b;
                mylist.add(a + " + " + b + " = " + c); //thêm dữ liệu vào mảng
                myadapter.notifyDataSetChanged();
            }
        });
    }

    private void addControl() {
        // ánh xạ id
        edit_a = findViewById(R.id.edit_a);
        edit_b = findViewById(R.id.edit_b);
        btncong = findViewById(R.id.btncong);

        // xử lý ListView
        lv = findViewById(R.id.lv);
        mylist = new ArrayList<>();
        myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mylist);
        lv.setAdapter(myadapter);

        // xử lý TabHost
        mytab = findViewById(R.id.mytap);
        mytab.setup();

        // khai báo tab 1 và 2
        TabHost.TabSpec spec1, spec2;

        // tab 1
        spec1 = mytab.newTabSpec("t1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Tab 1"); // Đặt nội dung của tab indicator
        mytab.addTab(spec1); // thêm tab 1

        // tab 2
        spec2 = mytab.newTabSpec("t2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Tab 2"); // Đặt nội dung của tab indicator
        mytab.addTab(spec2); // thêm tab 2
    }
}