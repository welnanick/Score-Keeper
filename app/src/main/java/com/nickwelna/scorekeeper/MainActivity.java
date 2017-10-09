package com.nickwelna.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;
    private int penalty1 = 0;
    private int penalty2 = 0;

    private static final String SCORE_1 = "score 1";
    private static final String SCORE_2 = "score 2";
    private static final String PENALTY_1 = "penalty 1";
    private static final String PENALTY_2 = "penalty 2";

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

        TextView scores1 = findViewById(R.id.score_1);
        scores1.setText(String.format(Locale.US, "%d", score1));

    }

    public void penalty1plus(View view) {

        penalty1++;
        updatePenalty1();

    }

    public void updatePenalty1() {

        TextView penalties1 = findViewById(R.id.penalty_1);
        penalties1.setText(String.format(Locale.US, "%d", penalty1));

    }


    public void score2plus(View view) {

        score2++;
        updateScore2();

    }

    private void updateScore2() {

        TextView scores2 = findViewById(R.id.score_2);
        scores2.setText(String.format(Locale.US, "%d", score2));

    }

    public void penalty2plus(View view) {

        penalty2++;
        updatePenalty2();

    }

    private void updatePenalty2() {

        TextView penalties2 = findViewById(R.id.penalty_2);
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

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

        outState.putInt(SCORE_1, score1);
        outState.putInt(SCORE_2, score2);
        outState.putInt(PENALTY_1, penalty1);
        outState.putInt(PENALTY_2, penalty2);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        score1 = savedInstanceState.getInt(SCORE_1);
        score2 = savedInstanceState.getInt(SCORE_2);
        penalty1 = savedInstanceState.getInt(PENALTY_1);
        penalty2 = savedInstanceState.getInt(PENALTY_2);

        updateScore1();
        updateScore2();
        updatePenalty1();
        updatePenalty2();

    }
}
