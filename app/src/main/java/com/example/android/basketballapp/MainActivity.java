package com.example.android.basketballapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
     displayForTeamA( scoreTeamA);
    }

    int scoreTeamA ;
    int scoreTeamB ;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

  public void add3forteamA (View view){
         scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
  }

    public void add2forteamA (View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void add1forteamA (View view){
       scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3forteamB (View view){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void add2forteamB (View view){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void add1forteamB (View view){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    public void destroy (View view){

        displayForTeamB(scoreTeamB=0 );
        displayForTeamA(scoreTeamA=0);
    }


}




