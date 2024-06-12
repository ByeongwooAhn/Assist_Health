package com.example.project58;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        String text = "Welcome";
        SpannableString spannableString = new SpannableString(text);

        // "W" 문자의 색상을 #D9A86C으로 변경
        spannableString.setSpan(
                new ForegroundColorSpan(Color.parseColor("#D9A86C")),
                0, 1, // "W"의 시작과 끝 인덱스
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        textView.setText(spannableString);

        // 버튼 찾기
        Button loginButton = findViewById(R.id.button2);
        Button signUpButton = findViewById(R.id.button);

        // 로그인 버튼 클릭 리스너 설정
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // 회원가입 버튼 클릭 리스너 설정
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
