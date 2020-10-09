package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_a = 0 ,score_b = 0;


    public void addThreeForTeamA(View view)
    {

      score_a = score_a + 3;
      displayForTeamA(score_a);

    }

    public void addTwoForTeamA(View view)
    {

        score_a = score_a + 2;
        displayForTeamA(score_a);

    }

    public void addFreeForTeamA(View view)
    {

        score_a = score_a + 1;
        displayForTeamA(score_a);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addThreeForTeamB(View view)
    {

        score_b = score_b + 3;
        displayForTeamB(score_b);

    }

    public void addTwoForTeamB(View view)
    {

        score_b = score_b + 2;
        displayForTeamB(score_b);

    }

    public void addFreeForTeamB(View view)
    {

        score_b = score_b + 1;
        displayForTeamB(score_b);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v)
    {
        score_a=0;
        score_b=0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }

}