package com.example.chng4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class InputNameActivity extends AppCompatActivity {
    private EditText editFirstName, editLastName;
    private Button btnSubmit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_result);

            editFirstName = findViewById(R.id.edit_first_name);
            editLastName = findViewById(R.id.edit_last_name);
            btnSubmit = findViewById(R.id.btn_submit);

            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String firstName = editFirstName.getText().toString();
                    String lastName = editLastName.getText().toString();

                    // Tạo một Intent để chứa kết quả
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("firstName", firstName);
                    resultIntent.putExtra("lastName", lastName);

                    // Đặt kết quả thành công và gửi nó trở lại cho Activity gọi
                    setResult(Activity.RESULT_OK, resultIntent);
                    finish(); // Kết thúc Activity và quay trở lại Activity gọi
                }
            });
        }
    }