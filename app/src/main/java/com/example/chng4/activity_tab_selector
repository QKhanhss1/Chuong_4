package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import androidx.activity.EdgeToEdge;
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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tab_selector);
        addControl();
        addEvent();
    }
    private Integer Interger;
    private void addEvent() {
        btncong.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int a = Interger.parseInt(edit_a.getText().toString());
                int b = Interger.parseInt(edit_b.getText().toString());
                int c = a + b;
                mylist.add(a+" + "+ b +" = "+ c); //thm du lieu vao mang
                myadapter.notifyDataSetChanged();
            }
        });

    }

    private void addControl() {
        //anh xa id
        edit_a = findViewById(R.id.edit_a);
        edit_b = findViewById(R.id.edit_b);
        btncong =findViewById(R.id.btncong);

        //xu ly lv
        lv = findViewById(R.id.lv);
        mylist = new ArrayList<>();
        myadapter = new ArrayAdapter<>(tab_selector.this, android.R.layout.simple_list_item_1);
        lv.setAdapter(myadapter);

        //xu ly TabHost
        mytab = findViewById(R.id.mytap);
        mytab.setup();

        //khai bao tap 1 va 2
        TabHost.TabSpec spec1, spec2;
       //tab1
        spec1 = mytab.newTabSpec("t1");
        spec1.setContent(R.id.tab1);

        mytab.addTab(spec1); //them tab 1

        //tab2
        spec2 = mytab.newTabSpec("t2");
        spec2.setContent(R.id.tab2);

        mytab.addTab(spec2); //them tab 2

    }
}
