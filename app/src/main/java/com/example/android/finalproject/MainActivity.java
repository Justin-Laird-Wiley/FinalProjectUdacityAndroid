package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    boolean question1 = false;
    boolean question2 = false;
    boolean question3 = false;
    boolean question4 = false;
    boolean question5 = false;
    boolean question6 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkCorrect(View view) {

        boolean thisTemp = false;

        // check question 1
        if (view.getId() == R.id.lynn)
            question1 = true;
        else if ((view.getId() == R.id.lawrence) || (view.getId() == R.id.lowell))
            question1 = false;

        // check question 2
        if (view.getId() == R.id.amherst)
            question2 = true;
        else if ((view.getId() == R.id.northampton) || (view.getId() == R.id.south_hadley))
            question2 = false;

        // check question 3
        if (view.getId() == R.id.year_1926)
            question3 = true;
        else if ((view.getId() == R.id.year_1933) || (view.getId() == R.id.year_1940))
            question3 = false;

        // check question 4
        if (view.getId() == R.id.boston_university)
            question4 = true;
        else if ((view.getId() == R.id.harvard) || (view.getId() == R.id.boston_college))
            question4 = false;

        // check question 5
        if (view.getId() == R.id.springfield)
            question5 = true;
        else if ((view.getId() == R.id.wocrcester) || (view.getId() == R.id.pittsfield))
            question5 = false;

        // check question 6
        if (view.getId() == R.id.religious_liberty)
            question6 = true;
        else if ((view.getId() == R.id.unpaid_taxes) || (view.getId() == R.id.plagarism))
            question6 = false;
    }




    private int calculateScore() {

        int totalScore = 0;

        if (question1)
            totalScore+=1;
        if (question2)
            totalScore+=1;
        if (question3)
            totalScore+=1;
        if (question4)
            totalScore+=1;
        if (question5)
            totalScore+=1;
        if (question6)
            totalScore+=1;

        return totalScore;
    }

    private void findScoreBoxByID(String idToFind) {
        String currentEnd = "current end";
        int idOfScoreBox = getResources().getIdentifier(idToFind,"id", getPackageName());   // Reverse lookup
        TextView scoreBox = (TextView)findViewById(idOfScoreBox);
        String currentEndScoreText = "" + currentEnd;
        scoreBox.setText(currentEndScoreText);          // Set correct scorebox with currentEnd
    }

    public void displayScore(View view) {

        int score = 0;
        score = calculateScore();


        Toast.makeText(MainActivity.this, "Your score is:  " + score,
                Toast.LENGTH_LONG).show();
    }
}
