package com.example.lastace.courtcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
      Team A Score
      */
    public void displayForTeamA (int score){

        TextView scoreView = findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));

        if (scoreTeamA > scoreTeamB){
            scoreView.setTextColor(Color.GREEN);
        }else{
            scoreView.setTextColor(Color.YELLOW);
        }
    }
    public void threePointsA (View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsA (View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowA (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     Team B Score
     */
    public void displayForTeamB (int score){

        TextView scoreView = findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
        if (scoreTeamB > scoreTeamA){
            scoreView.setTextColor(Color.GREEN);
        }else{
            scoreView.setTextColor(Color.YELLOW);
        }
    }
    public void threePointsB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB (View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void reset (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        findViewById(R.id.tv_winner).setVisibility(View.INVISIBLE);
    }
    public void winner (View v){
        TextView winnerTeam = findViewById(R.id.tv_winner);
        if (scoreTeamB > scoreTeamA){
            winnerTeam.setText(R.string.teamB_wins);
            findViewById(R.id.tv_winner).setVisibility(View.VISIBLE);
        }
        if (scoreTeamB < scoreTeamA){
            winnerTeam.setText(R.string.teamA_wins);
            findViewById(R.id.tv_winner).setVisibility(View.VISIBLE);
        }
        if (scoreTeamA == scoreTeamB){
            winnerTeam.setText(R.string.draw);
            findViewById(R.id.tv_winner).setVisibility(View.VISIBLE);
        }
    }

}
