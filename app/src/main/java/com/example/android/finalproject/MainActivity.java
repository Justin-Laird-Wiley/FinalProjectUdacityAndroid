package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //  Boolean values for each question:  false for incorrect; true for correct.
    //  All variables set to false initially.
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

    /**
     * This method performs an "if-else" statement on each question to see if the correct
     * radio button was clicked.  The "if" part will set a boolean value to true for a
     * correct answer, and the "else" part will set the boolean to false if either of the
     * incorrect answers are checked.  Called whenever a radio button is clicked.
     *
     * @param view
     */
    public void checkCorrect(View view) {

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

    /**
     * Method to calculate the number of correct answers.  Called by "displayScore" when the
     * "Total Score" button is pressed at the end of the quiz.   Tests if the boolean for each
     * question - "questionX" is true, and if true adds 1 to "totalScore".
     *
     * @return int total score -- the number of correct answers
     */
    private int calculateScore() {
        int totalScore = 0;

        if (question1)
            totalScore += 1;
        if (question2)
            totalScore += 1;
        if (question3)
            totalScore += 1;
        if (question4)
            totalScore += 1;
        if (question5)
            totalScore += 1;
        if (question6)
            totalScore += 1;

        return totalScore;
    }

    /**
     * Method to display the number of correct answers in the quiz.  Called when the "Total Score"
     * button is pressed.  Method calls "calculateScore" and uses the returned "score" in a toast
     * message.
     *
     * @param view
     */
    public void displayScore(View view) {
        int finalScore = 0;

        finalScore = calculateScore();
        Toast.makeText(MainActivity.this, "Your score is:  " + finalScore,
                Toast.LENGTH_LONG).show();
    }
}
