package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when submit button is clicked
     */

    public void submitTotalScore(View view) {

        //evaluates answer for question1
        CheckBox action11Box = (CheckBox) findViewById(R.id.checkbox_country1);
        boolean hasAnswer11 = action11Box.isChecked();
        CheckBox action12Box = (CheckBox) findViewById(R.id.checkbox_country2);
        boolean hasAnswer12 = action12Box.isChecked();
        CheckBox action13Box = (CheckBox) findViewById(R.id.checkbox_country3);
        boolean hasAnswer13 = action13Box.isChecked();
        CheckBox action14Box = (CheckBox) findViewById(R.id.checkbox_country4);
        boolean hasAnswer14 = action14Box.isChecked();

        if (hasAnswer12 && hasAnswer14) {
            totalScore += 1;
        }


        //evaluates answer for question2

        RadioButton action21Button = (RadioButton) findViewById(R.id.button_yes);
        boolean hasAnswer21 = action21Button.isChecked();
        RadioButton action22Button = (RadioButton) findViewById(R.id.button_no);
        boolean hasAnswer22 = action22Button.isChecked();

        if (hasAnswer21)

        {
            totalScore += 1;
        }


        //evaluates answer for question 4

        CheckBox action41Box = (CheckBox) findViewById(R.id.checkbox_name1);
        boolean hasAnswer41 = action41Box.isChecked();
        CheckBox action42Box = (CheckBox) findViewById(R.id.checkbox_name2);
        boolean hasAnswer42 = action42Box.isChecked();
        CheckBox action43Box = (CheckBox) findViewById(R.id.checkbox_name3);
        boolean hasAnswer43 = action43Box.isChecked();
        CheckBox action44Box = (CheckBox) findViewById(R.id.checkbox_name4);
        boolean hasAnswer44 = action44Box.isChecked();

        if (hasAnswer41 == false)

        {
            totalScore += 1;
        }

//evaluates answer for question5

        RadioButton action51Button = (RadioButton) findViewById(R.id.button_yes2);
        boolean hasAnswer51 = action51Button.isChecked();
        RadioButton action52Button = (RadioButton) findViewById(R.id.button_no2);
        boolean hasAnswer52 = action52Button.isChecked();

        if (hasAnswer51 == false)

        {
            totalScore += 1;
        }}


        //    evaluates answer to Question 3 and checks for an empty text field

    public void evaluateblankAnswer3(String checkString) {

        EditText action31Field = (EditText) findViewById(R.id.edittext_option);
        checkString = action31Field.getText().toString();
        if (checkString.matches("")) {
            Toast.makeText(this, "Your question 3 field is empty!", LENGTH_SHORT).show();
        }
        if (checkString.contains("knight")) {
            totalScore += 1;
        }
        {
            Toast.makeText(this, "You are done! Your score is " + totalScore, LENGTH_SHORT).

                    show();
        }
    }


    /**
     * This method erases all the data after Reset button is clicked
     */

    public void resetTotalScore(View view) {


        CheckBox action11Box = (CheckBox) findViewById(R.id.checkbox_country1);
        action11Box.setChecked(false);
        CheckBox action12Box = (CheckBox) findViewById(R.id.checkbox_country2);
        action12Box.setChecked(false);
        CheckBox action13Box = (CheckBox) findViewById(R.id.checkbox_country3);
        action13Box.setChecked(false);
        CheckBox action14Box = (CheckBox) findViewById(R.id.checkbox_country4);
        action14Box.setChecked(false);
        RadioButton action21Button = (RadioButton) findViewById(R.id.button_yes);
        action21Button.setChecked(false);
        RadioButton action22Button = (RadioButton) findViewById(R.id.button_no);
        action22Button.setChecked(false);
        CheckBox action41Box = (CheckBox) findViewById(R.id.checkbox_name1);
        action41Box.setChecked(false);
        CheckBox action42Box = (CheckBox) findViewById(R.id.checkbox_name2);
        action42Box.setChecked(false);
        CheckBox action43Box = (CheckBox) findViewById(R.id.checkbox_name3);
        action43Box.setChecked(false);
        CheckBox action44Box = (CheckBox) findViewById(R.id.checkbox_name4);
        action44Box.setChecked(false);
        RadioButton action51Button = (RadioButton) findViewById(R.id.button_yes2);
        action51Button.setChecked(false);
        RadioButton action52Button = (RadioButton) findViewById(R.id.button_no2);
        action52Button.setChecked(false);
    }
}







