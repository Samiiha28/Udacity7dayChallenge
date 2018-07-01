package com.example.android.myquizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
/**
 * This app contains a quiz of questions about parts of a plant
 */

public class MainActivity extends AppCompatActivity {

    int score = 0;
    boolean checkAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is used to display the selected answer and assign a score accordingly on question one
     */
    public void selectAnswer(View view) {

        boolean checked = ((android.widget.RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.leaves: // check point for option 1
                if (checked)

                    break;

            case R.id.stem:   // check point for option 2
                if (checked)

                    break;
            case R.id.roots:    // check point for option 3
                if (checked)
                    score = score + 1;

                break;

        }


    }

    /**
     * This method is used to display the selected answer and assign a score accordingly on question two
     */

    public void selectAnswer1(View view) {
        boolean checked = ((android.widget.RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.leaves1:    // check point for option 1
                if (checked)
                    score += 1;
                break;

            case R.id.stem1:    // check point for option 2
                if (checked)
                    break;
            case R.id.roots1:  // check point for option 3
                if (checked)
                    break;


        }
    }

    /**
     * This method is used to display the selected answer and assign a score accordingly on question three
     */
    public void selectAnswer2(View view) {
        boolean checked = ((android.widget.RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.leaves2: // check point for option 1
                if (checked)
                    break;

            case R.id.stem2: // check point for option 2
                if (checked)
                    break;
            case R.id.roots2: // check point for option 3
                if (checked)
                    score += 1;
                break;


        }

    }

    /**
     * This method is used to display the selected answer and assign a score accordingly on question four
     */

    public void question4(View view) {
        switch (view.getId()) {
            case R.id.stem3:          // check point for option 1
                checkAnswer = true;
                break;

            case R.id.root3:           // check point for option 2
                checkAnswer = false;
                break;

            case R.id.none:            // check point for option 3
                checkAnswer = false;
                break;

        }
    }

    /**
     * This method is used to display the selected answer and assign a score accordingly on question five
     */

    public void selectAnswer3(View view) {
        boolean checked = ((android.widget.RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.leaves4: // check point for option 1
                if (checked)
                    score += 1;
                break;
            case R.id.stem4: // check point for option 2
                if (checked)
                    break;
            case R.id.roots4: // check point for option 3
                if (checked)
                    break;

        }


    }


    /**
     * This method is called when the submit button is clicked.
     */
    public void submitAnswer(View view) {

        if (checkAnswer) {

            score += 1;
        }

        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_LONG).show();

    }


}