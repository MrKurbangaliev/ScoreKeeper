package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusSixPointsToA(View v) {
        scoreA += 6;
        displayForTeamA(scoreA);
    }

    public void plusThreePointsToA(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void plusTwoPointsToA(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void extraPointToA(View v) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void plusSixPointsToB(View v) {
        scoreB += 6;
        displayForTeamB(scoreB);
    }

    public void plusThreePointsToB(View v) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void plusTwoPointsToB(View v) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void extraPointToB(View v) {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void resetAll(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView text = findViewById(R.id.score_A);
        text.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView text = findViewById(R.id.score_B);
        text.setText(String.valueOf(score));
    }
}