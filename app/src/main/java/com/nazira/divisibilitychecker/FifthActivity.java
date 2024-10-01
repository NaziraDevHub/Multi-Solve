package com.nazira.divisibilitychecker;

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

public class FifthActivity extends AppCompatActivity {

    EditText editTextUnits;
    TextView resultTextView;
    Button calculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_layout);

        editTextUnits = findViewById(R.id.editTextUnits);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myString = editTextUnits.getText().toString();

                if (myString.length()>0) {
                    double units = Double.parseDouble(myString);
                    double bill = 0.0;

                    if (units <= 50) {
                        bill = units * 0.50;
                    } else if (units <= 150) {
                        bill = (50 * 0.50) + (units - 50) * 0.75;
                    } else if (units <= 250) {
                        bill = (50 * 0.50) + (100 * 0.75) + (units - 150) * 1.20;
                    } else {
                        bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 250) * 1.50;
                        bill += bill * 0.20; // Add 20% surcharge for units above 250
                    }

                    // Display the result
                    resultTextView.setText("Electricity Bill = BDT " + String.format("%.2f", bill));
                } else {
                    resultTextView.setText("Please enter the units consumed.");
                }
            }
        });

    }
}