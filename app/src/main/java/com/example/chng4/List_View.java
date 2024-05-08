package com.example.chng4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class List_View extends AppCompatActivity {
    Button btn_b2;
    String myshoe [] ={"NIKE","ADIDAS","PUMA","BITTIS HUNTER"," VANS","YEEZY","SAMBA"};
    ArrayAdapter<String> myadapter;
    ListView lv1;
    TextView txt_select;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        //anh xa ID
        txt_select = findViewById(R.id.txt_select);
        lv1 = findViewById(R.id.lv1);
        myadapter = new ArrayAdapter<>(List_View.this, android.R.layout.simple_list_item_1,myshoe );
        lv1.setAdapter(myadapter);
        // Bat su kiet Click vao tung item cua List View
        lv1.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                txt_select.setText("vi tri: "+i+" "+myshoe[i]);

            }


        });
        btn_b2 = findViewById(R.id.btn_b2);
        btn_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}
