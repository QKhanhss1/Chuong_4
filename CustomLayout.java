package com.example.chng4;

import static android.view.View.inflate;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class CustomLayout extends AppCompatActivity {
    private ImageView avatarImageView;
    private TextView nameTextView;

    public CustomLayout(Context context) {
        super();
        inflate(context, R.layout.activity_custom_layout, this); // Nạp layout XML

        avatarImageView = findViewById(R.id.avatar);
        nameTextView = findViewById(R.id.name);
    }

    private void inflate(Context context, int activityCustomLayout, CustomLayout customLayout) {
    }

    public void setAvatar(Bitmap avatar) {
        avatarImageView.setImageBitmap(avatar);
    }

    public void setName(String name) {
        nameTextView.setText(name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       
    }
    }
