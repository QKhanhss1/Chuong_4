package com.example.chng4;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityEx extends AppCompatActivity {
    EditText editPhone,editURL;
    Button btnCall, btnURL;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ex);


        editPhone=findViewById(R.id.editPhone);
        editURL=findViewById(R.id.edtURL);
        btnURL=findViewById(R.id.btnURL);
        btnCall=findViewById(R.id.btnGoi);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL   );
                intent.setData(Uri.parse("tel:" + editPhone.getText().toString()));
                startActivity(intent);
            }
        });
        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editURL.getText().toString();

                if (!url.isEmpty()) {
                    // Kiểm tra nếu URL không bắt đầu bằng "http://" hoặc "https://", thì thêm vào đầu để đảm bảo URL hợp lệ
                    if (!url.startsWith("http://") && !url.startsWith("https://")) {
                        url = "http://" + url;
                    }

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                } else {
                    // Xử lý trường hợp URL không hợp lệ
                    Toast.makeText(ActivityEx.this, "URL không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        }


}

