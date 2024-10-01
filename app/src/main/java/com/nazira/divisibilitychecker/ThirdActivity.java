package com.nazira.divisibilitychecker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    EditText editTextWeekNumber;
    TextView resultTextView;
    Button checkButton,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        editTextWeekNumber = findViewById(R.id.editTextWeekNumber);
        resultTextView = findViewById(R.id.resultTextView);
        checkButton = findViewById(R.id.checkButton);
        button3 = findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(myIntent);
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myString = editTextWeekNumber.getText().toString();
                if (myString.length()>0) {
                    int weekNumber = Integer.parseInt(myString);


                    if (weekNumber == 1) {
                        resultTextView.setText("Saturday");
                    } else if (weekNumber == 2) {
                        resultTextView.setText("Sunday");
                    } else if (weekNumber == 3) {
                        resultTextView.setText("Monday");
                    } else if (weekNumber == 4) {
                        resultTextView.setText("Tuesday");
                    } else if (weekNumber == 5) {
                        resultTextView.setText("Wednesday");
                    } else if (weekNumber == 6) {
                        resultTextView.setText("Thursday");
                    } else if (weekNumber == 7) {
                        resultTextView.setText("Friday");
                    } else {
                        resultTextView.setText("Invalid week number! Please enter a number between 1 and 7.");
                    }
                } else {
                    resultTextView.setText("Please enter a week number.");
                }
            }
        });

    }
}