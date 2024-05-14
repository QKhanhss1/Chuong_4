package com.example.chng4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeSelection extends AppCompatActivity {
    TimePicker timePicker;
    TextView textViewTime;

    private boolean is24HView = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time_selection);
        this.textViewTime = (TextView) this.findViewById(R.id.textView_time);
        this.timePicker = (TimePicker) this.findViewById(R.id.timePicker);
        this.timePicker.setIs24HourView(this.is24HView);

        this.timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textViewTime.setText(hourOfDay + ":" + minute);
            }
        });
    }
}