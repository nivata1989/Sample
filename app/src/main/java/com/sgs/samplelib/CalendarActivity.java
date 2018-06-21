package com.sgs.samplelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sgs.util.DateConvert;

import java.util.Date;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        DateConvert.getFormatedDate(new Date().toString());

    }
}
