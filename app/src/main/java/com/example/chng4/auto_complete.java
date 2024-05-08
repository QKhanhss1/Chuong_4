package com.example.chng4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class auto_complete extends AppCompatActivity {
    Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_auto_complete);

       AutoCompleteTextView autoCompleteTextView = findViewById(R.id.a_c);
       String[] countries= getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<>( this,android.R.layout.simple_list_item_1,countries);

        autoCompleteTextView.setAdapter(arrayadapter);

        };
}
