package com.example.chng4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityChild extends AppCompatActivity {
    Button btnKetqua;
    EditText soA, soB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutim);

        btnKetqua = findViewById(R.id.btnKq);
        soA = findViewById(R.id.EdtA);
        soB = findViewById(R.id.EdtB);

        btnKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText
                String soAText = soA.getText().toString();
                String soBText = soB.getText().toString();

                // Chuyển đổi sang số (xử lý lỗi nếu cần thiết)
                int numberA = Integer.parseInt(soAText);
                int numberB = Integer.parseInt(soBText);

                // Tính toán kết quả
                int result = numberA + numberB;

                // Tạo Bundle để truyền dữ liệu
                Bundle bundle = new Bundle();
                bundle.putInt("numberA", numberA);
                bundle.putInt("numberB", numberB);
                bundle.putInt("result", result);

                // Tạo Intent để chuyển sang ActivityKetqua
                Intent intent = new Intent(ActivityChild.this, Activityketqua.class);
                intent.putExtras(bundle); // Gắn Bundle vào Intent
                startActivity(intent);
            }
        });
    }
}
