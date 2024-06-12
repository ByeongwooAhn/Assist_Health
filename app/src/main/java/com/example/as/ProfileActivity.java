package com.example.project58;

import android.content.Intent; // Intent 클래스 import 추가
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // 각 뷰 요소들을 찾습니다.
        TextView textViewNickname = findViewById(R.id.textViewNickname);
        editTextName = findViewById(R.id.editTextName);
        buttonNext = findViewById(R.id.buttonNext);

        // 다음 버튼 클릭 이벤트 처리
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // GenderActivity로 이동하는 Intent 생성
                Intent intent = new Intent(ProfileActivity.this, GenderActivity.class);

                // Intent를 통해 다음 액티비티로 이동
                startActivity(intent);
            }
        });
    }
}
