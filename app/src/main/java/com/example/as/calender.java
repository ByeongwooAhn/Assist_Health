package com.example.as;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class calender extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender); // 새로운 화면의 레이아웃 파일을 여기에 설정해주세요.

        View sikdanNav = findViewById(R.id.navigation_sikdan);

        sikdanNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calender.this, sikdan_make.class);
                startActivity(intent);
            }
        });

        View actNav = findViewById(R.id.navigation_home);

        actNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calender.this, act_main.class);
                startActivity(intent);
            }
        });

        View myNav = findViewById(R.id.navigation_mypage);

        myNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calender.this, mypage.class);
                startActivity(intent);
            }
        });

        View calNav = findViewById(R.id.navigation_report);
        calNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calender.this, calender.class);
                startActivity(intent);
            }
        });
    }
}