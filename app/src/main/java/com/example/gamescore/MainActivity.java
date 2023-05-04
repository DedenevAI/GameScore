package com.example.gamescore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int countScoreForFirst = 0;
    private int countScoreForSecond = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView first = findViewById(R.id.scoreFirst);
        TextView second = findViewById(R.id.scoreSecond);

        first.setText(String.valueOf(countScoreForFirst));
        second.setText(String.valueOf(countScoreForSecond));

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(String.valueOf(++countScoreForFirst));
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second.setText(String.valueOf(++countScoreForFirst));
            }
        });
    }
}