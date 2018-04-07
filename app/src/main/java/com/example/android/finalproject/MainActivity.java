package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.lawrence:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.lynn:
                if (checked) {
                    finalScore += 1;
                }
                    // Ninjas rule

                    break;
            case R.id.lowell:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void displayScore(View view) {
        Toast.makeText(MainActivity.this, "this is the score",
                Toast.LENGTH_LONG).show();
    }
}
