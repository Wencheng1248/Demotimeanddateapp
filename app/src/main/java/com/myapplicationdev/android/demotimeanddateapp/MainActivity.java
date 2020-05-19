package com.myapplicationdev.android.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Button displayTime;
    Button displayDate;
    TextView tvShow;
    DatePicker dp;
    TimePicker tp;
    Button btnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        displayTime = findViewById(R.id.btnDisplayTime);
        displayDate = findViewById(R.id.btnDisplayDate);
        tvShow = findViewById(R.id.textViewshow);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnChange = findViewById(R.id.btnReset);

        displayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
                tvShow.setText(time);



            }
        });
        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String date = "Date is: " + dp.getDayOfMonth() + "/" + (dp.getMonth()+1) +"/"+dp.getYear();
                tvShow.setText(date);



            }
        });
    }
}
