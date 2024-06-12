package com.example.as;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class act_main extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act); // 새로운 화면의 레이아웃 파일을 여기에 설정해주세요.

        Button btnEditMonday = findViewById(R.id.btnEditMonday);
        btnEditMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        Button btnEditTuesday = findViewById(R.id.btnEditTuesday);
        btnEditTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        Button btnEditWednesday = findViewById(R.id.btnEditWednesday);
        btnEditWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        Button btnEditThursday = findViewById(R.id.btnEditThursday);
        btnEditThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        Button btnEditFriday = findViewById(R.id.btnEditFriday);
        btnEditFriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        Button btnEditSaturday = findViewById(R.id.btnEditSaturday);
        btnEditSaturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        Button btnEditSunday = findViewById(R.id.btnEditSunday);
        btnEditSunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act2.class);
                startActivity(intent);
            }
        });

        View sikdanNav = findViewById(R.id.navigation_sikdan);

        sikdanNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, sikdan_make.class);
                startActivity(intent);
            }
        });

        View actNav = findViewById(R.id.navigation_home);

        actNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act_main.class);
                startActivity(intent);
            }
        });

        View myNav = findViewById(R.id.navigation_mypage);

        myNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, mypage.class);
                startActivity(intent);
            }
        });

        View calNav = findViewById(R.id.navigation_report);
        calNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, calender.class);
                startActivity(intent);
            }
        });
    }
}