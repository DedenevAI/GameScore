package com.example.gamescore;

import androidx.annotation.NonNull;
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
        if (savedInstanceState != null) {
            countScoreForFirst = savedInstanceState.getInt("score1");
            countScoreForSecond = savedInstanceState.getInt("score2");
        }

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

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", countScoreForFirst);
        outState.putInt("score2", countScoreForSecond);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}