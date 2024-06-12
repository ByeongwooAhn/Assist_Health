package com.example.project58;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);

        Button buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 Activity로 이동하는 코드
                Intent intent = new Intent(HeightActivity.this, TargetActivity.class); // NextActivity를 실제 이동하고자 하는 Activity로 변경하세요.
                startActivity(intent);
            }
        });
    }
}
