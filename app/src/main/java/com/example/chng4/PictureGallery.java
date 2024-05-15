package com.example.chng4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;


import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;

public class PictureGallery extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_picgallery);

        gridView = findViewById(R.id.gridViewpicgallery);

        List<Integer> imageIDs = new ArrayList<>();
        imageIDs.add(R.drawable.cat);
        imageIDs.add(R.drawable.cat);
        imageIDs.add(R.drawable.cat);
        imageIDs.add(R.drawable.ic_launcher_background);
        imageIDs.add(R.drawable.ic_launcher_background);
        imageIDs.add(R.drawable.ic_launcher_background);

        // Tạo ArrayAdapter với danh sách imageIDs
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, android.R.layout.simple_gallery_item, imageIDs);
        gridView.setAdapter(adapter);
    }
}