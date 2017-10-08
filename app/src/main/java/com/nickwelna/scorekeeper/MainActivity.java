package com.nickwelna.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public int score1 = 0;
    public int score2 = 0;
    public int penalty1 = 0;
    public int penalty2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score1plus(View view) {

        score1++;
        updateScore1();

    }

    public void updateScore1() {

        TextView scores1 = (TextView) findViewById(R.id.score_1);
        scores1.setText(String.format(Locale.US, "%d", score1));

    }

    public void penalty1plus(View view) {

        penalty1++;
        updatePenalty1();

    }

    public void updatePenalty1() {

        TextView penalties1 = (TextView) findViewById(R.id.penalty_1);
        penalties1.setText(String.format(Locale.US, "%d", penalty1));

    }


    public void score2plus(View view) {

        score2++;
        updateScore2();

    }

    private void updateScore2() {

        TextView scores2 = (TextView) findViewById(R.id.score_2);
        scores2.setText(String.format(Locale.US, "%d", score2));

    }

    public void penalty2plus(View view) {

        penalty2++;
        updatePenalty2();

    }

    private void updatePenalty2() {

        TextView penalties2 = (TextView) findViewById(R.id.penalty_2);
        penalties2.setText(String.format(Locale.US, "%d", penalty2));

    }

    public void reset(View view) {
        score1 = 0;
        score2 = 0;
        penalty1 = 0;
        penalty2 = 0;
        updateScore1();
        updateScore2();
        updatePenalty1();
        updatePenalty2();

    }

}
