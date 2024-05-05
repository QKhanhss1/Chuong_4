package com.example.chng4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityResult extends AppCompatActivity {
    private static final int REQUEST_CODE = 1;
    private TextView txtFullName;
    private Button btnStartInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sendresult);

        txtFullName = findViewById(R.id.txt_full_name);
        btnStartInput = findViewById(R.id.btn_start_input);

        btnStartInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo Intent để khởi chạy InputNameActivity
                Intent intent = new Intent(ActivityResult.this, InputNameActivity.class);

                // Gọi startActivityForResult để khởi chạy Activity và chờ kết quả trả về
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                // Nhận thông tin tên và họ từ InputNameActivity
                String firstName = data.getStringExtra("firstName");
                String lastName = data.getStringExtra("lastName");

                // Hiển thị thông tin tên và họ
                String fullName = firstName + " " + lastName;
                txtFullName.setText(fullName);
            } else if (resultCode == Activity.RESULT_CANCELED) {
                // Xử lý trường hợp người dùng đã hủy Activity
                Toast.makeText(this, "Hủy", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
