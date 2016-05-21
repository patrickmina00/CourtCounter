package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fetching Buttons
        //Team A
        Button freeThrowA = this.getFreeThrowA();
        Button twoPointsA = this.getTwoPointsA();
        Button threePointsA = this.getThreePointsA();

        //TeamB
        Button freeThrowB = this.getFreeThrowB();
        Button twoPointsB = this.getTwoPointsB();
        Button threePointsB = this.getThreePointsB();

        Button reset = this.getResetButton();

        //Adding button listeners
        //Team A
        freeThrowA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamA += 1;
                MainActivity.this.displayForTeamA(MainActivity.this.scoreTeamA);
            }
        });

        twoPointsA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamA += 2;
                MainActivity.this.displayForTeamA(MainActivity.this.scoreTeamA);
            }
        });

        threePointsA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamA += 3;
                MainActivity.this.displayForTeamA(MainActivity.this.scoreTeamA);
            }
        });

        //Team B
        freeThrowB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamB += 1;
                MainActivity.this.displayForTeamB(MainActivity.this.scoreTeamB);
            }
        });

        twoPointsB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamB += 2;
                MainActivity.this.displayForTeamB(MainActivity.this.scoreTeamB);
            }
        });

        threePointsB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamB += 3;
                MainActivity.this.displayForTeamB(MainActivity.this.scoreTeamB);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.scoreTeamA = 0;
                MainActivity.this.scoreTeamB = 0;
                MainActivity.this.displayForTeamA(MainActivity.this.scoreTeamA);
                MainActivity.this.displayForTeamB(MainActivity.this.scoreTeamB);
            }
        });
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Methods to get Buttons
     **/
    //Team A
    public Button getFreeThrowA() {
        return (Button) findViewById(R.id.free_throw_team_a);
    }

    public Button getTwoPointsA() {
        return (Button) findViewById(R.id.two_points_team_a);
    }

    public Button getThreePointsA() {
        return (Button) findViewById(R.id.three_points_team_a);
    }

    //Team B
    public Button getFreeThrowB() {
        return (Button) findViewById(R.id.free_throw_team_b);
    }

    public Button getTwoPointsB() {
        return (Button) findViewById(R.id.two_points_team_b);
    }

    public Button getThreePointsB() {
        return (Button) findViewById(R.id.three_points_team_b);
    }

    public Button getResetButton(){
        return (Button) findViewById(R.id.reset);
    }
}
