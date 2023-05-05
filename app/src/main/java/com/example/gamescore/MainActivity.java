package com.example.gamescore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int countScoreForFirst = 0;
    private int countScoreForSecond = 0;
    private TextView first;
    private TextView second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity","onCreate invoked");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            countScoreForFirst = savedInstanceState.getInt("score1");
            countScoreForSecond = savedInstanceState.getInt("score2");
        }
        first = findViewById(R.id.scoreFirst);
        second = findViewById(R.id.scoreSecond);


        updateScore(first,countScoreForFirst);
        updateScore(second,countScoreForSecond);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Clicked score1");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                countScoreForFirst++;
                updateScore(first,countScoreForFirst);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Clicked score2");
                countScoreForSecond++;
                updateScore(second,countScoreForSecond);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","OnStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","OnResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","Pause invoked");
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity","OnStop invoked");
        super.onStop();
    }

    private void updateScore(TextView textView, int counter){
        textView.setText(String.valueOf(counter));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", countScoreForFirst);
        outState.putInt("score2", countScoreForSecond);
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity","onDestroy invoked");
        super.onDestroy();
    }
}