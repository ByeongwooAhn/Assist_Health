package com.example.project58;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class YearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        // NumberPicker 초기화 및 설정
        NumberPicker numberPickerYear = findViewById(R.id.numberPickerYear);
        numberPickerYear.setMinValue(1900);
        numberPickerYear.setMaxValue(2024);
        numberPickerYear.setValue(2000); // 초기값 설정 (예시)
        Button buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YearActivity.this, HeightActivity.class);
                startActivity(intent);
            }
        });
    }
}
