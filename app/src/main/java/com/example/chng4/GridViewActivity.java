package com.example.chng4;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity {
    GridView gvTen;
    String[] arrayName={ "A","B","C","D","E","F","G", "H","I","J","K","L","M","N", "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        gvTen = (GridView) findViewById(R.id.gridview_id);

        ArrayAdapter adapter = new ArrayAdapter(
                GridViewActivity.this,
                android.R.layout.simple_list_item_1,arrayName
        );
        gvTen.setAdapter(adapter);
        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(GridViewActivity.this, arrayName[i], Toast.LENGTH_SHORT).show();
            }
        });
        }

    public void BackGridview(View view) {
        finish();
    }
}

