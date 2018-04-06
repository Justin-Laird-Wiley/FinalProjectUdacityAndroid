package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

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
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.lowell:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}
