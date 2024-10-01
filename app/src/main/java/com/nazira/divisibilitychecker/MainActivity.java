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

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    Button checkButton,button;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        checkButton = findViewById(R.id.checkButton);
        resultTextView = findViewById(R.id.resultTextView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(myIntent);
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myString = editTextNumber.getText().toString();

                if (myString.length()>0) {

                    int myNumber = Integer.parseInt(myString);
                    if (myNumber % 5 == 0 && myNumber % 11 == 0) {
                        resultTextView.setText("The number " + myNumber + " is divisible by both 5 and 11.");
                    } else {
                        resultTextView.setText("The number " + myNumber + " is NOT divisible by both 5 and 11.");
                    }
                } else  {
                    resultTextView.setText("Please enter a number.");
                }
            }
        });

    }
}