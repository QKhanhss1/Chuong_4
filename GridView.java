package com.example.chng4;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridView extends AppCompatActivity {
    GridView gvTen;
    String[] arrayName = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view);
        gvTen = (GridView) findViewById(R.id.GridView);
        ArrayAdapter adapter = new ArrayAdapter(
                GridView.this,
                android.R.layout.simple_expandable_list_item_1,
                arrayName
        );
        gvTen.setAdapter(adapter);
        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick (AdapterView<?> adapterView, View view), int i, long l) {
                                             Toast.makeText(GridView.this, arrayName[i],Toast.LENGTH_SHORT).show());
                                         }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}