package com.example.project58;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project58.R;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        Button increaseMuscleButton = findViewById(R.id.buttonIncreaseMuscle);
        Button reduceFatButton = findViewById(R.id.buttonReduceFat);
        Button maintainButton = findViewById(R.id.buttonMaintain);

        increaseMuscleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increase Muscle 버튼을 클릭했을 때의 동작
                Intent intent = new Intent(TargetActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });

        reduceFatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reduce Fat 버튼을 클릭했을 때의 동작
                Intent intent = new Intent(TargetActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });

        maintainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Maintain 버튼을 클릭했을 때의 동작
                Intent intent = new Intent(TargetActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });
    }
}
