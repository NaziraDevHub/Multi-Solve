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

public class SecondActivity extends AppCompatActivity {

    EditText editTextYear;
    Button checkButton,button2;
    TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        editTextYear = findViewById(R.id.editTextYear);
        checkButton = findViewById(R.id.checkButton);
        button2 = findViewById(R.id.button2);
        resultTextView = findViewById(R.id.resultTextView);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(myIntent);
            }
        });



        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myString = editTextYear.getText().toString();
                if (myString.length()>0) {
                    int year = Integer.parseInt(myString);

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        resultTextView.setText(year + " is a leap year.");
                    } else {
                        resultTextView.setText(year + " is not a leap year.");
                    }
                } else {
                    resultTextView.setText("Please enter a year.");
                }


            }
        });

    }
}