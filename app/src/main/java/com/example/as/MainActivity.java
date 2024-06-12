package com.example.as;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sikdan_make);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.sikdan_make), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button danButton = findViewById(R.id.dan);

        danButton.setOnClickListener(view -> {
            String url1 = "https://www.fatsecret.kr/%EC%B9%BC%EB%A1%9C%EB%A6%AC-%EC%98%81%EC%96%91%EC%86%8C/%EA%B7%B8%EB%A3%B9/%EA%B3%A0%EA%B8%B0(%EC%9C%A1%EB%A5%98)";

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
            startActivity(intent);
        });

        Button tanButton = findViewById(R.id.tan);

        tanButton.setOnClickListener(view -> {
            String url2 = "https://www.fatsecret.kr/%EC%B9%BC%EB%A1%9C%EB%A6%AC-%EC%98%81%EC%96%91%EC%86%8C/%EA%B7%B8%EB%A3%B9/%EB%B9%B5-%EC%8B%9C%EB%A6%AC%EC%96%BC";

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url2));
            startActivity(intent);
        });

        Button jiButton = findViewById(R.id.ji);

        jiButton.setOnClickListener(view -> {
            String url3 = "https://www.fatsecret.kr/%EC%B9%BC%EB%A1%9C%EB%A6%AC-%EC%98%81%EC%96%91%EC%86%8C/%EC%9D%BC%EB%B0%98%EB%AA%85/%EC%97%91%EC%8A%A4%ED%8A%B8%EB%9D%BC-%EB%B2%84%EC%A7%84-%EC%98%AC%EB%A6%AC%EB%B8%8C-%EC%98%A4%EC%9D%BC";

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url3));
            startActivity(intent);
        });

        View sikdanNav = findViewById(R.id.navigation_sikdan);

        sikdanNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sikdan_make.class);
                startActivity(intent);
            }
        });

        View actNav = findViewById(R.id.navigation_home);

        actNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, act_main.class);
                startActivity(intent);
            }
        });

        View myNav = findViewById(R.id.navigation_mypage);

        myNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mypage.class);
                startActivity(intent);
            }
        });

        View calNav = findViewById(R.id.navigation_report);
        calNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calender.class);
                startActivity(intent);
            }
        });
    }


}