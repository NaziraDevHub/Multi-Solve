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

public class FourthActivity extends AppCompatActivity {

    EditText editTextPhysics, editTextChemistry, editTextBiology, editTextMath, editTextComputer;
    TextView resultTextView;
    Button calculateButton,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_layout);

        editTextPhysics = findViewById(R.id.editTextPhysics);
        editTextChemistry = findViewById(R.id.editTextChemistry);
        editTextBiology = findViewById(R.id.editTextBiology);
        editTextMath = findViewById(R.id.editTextMath);
        editTextComputer = findViewById(R.id.editTextComputer);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton = findViewById(R.id.calculateButton);
        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(FourthActivity.this, FifthActivity.class);
                startActivity(myIntent);
            }
        });

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String myphysics = editTextPhysics.getText().toString();
                String mychemistry = editTextChemistry.getText().toString();
                String mybiology = editTextBiology.getText().toString();
                String mymath = editTextMath.getText().toString();
                String mycomputer = editTextComputer.getText().toString();

                if (myphysics.length()>0 && mychemistry.length()>0 && mybiology.length()>0 && mymath.length()>0 && mycomputer.length()>0) {
                    int physics = Integer.parseInt(myphysics);
                    int chemistry = Integer.parseInt(mychemistry);
                    int biology = Integer.parseInt(mybiology);
                    int math = Integer.parseInt(mymath);
                    int computer = Integer.parseInt(mycomputer);

                    float percentage = (physics + chemistry + biology + math + computer) / 5.0f;

                    if (percentage >= 90) {
                        resultTextView.setText("Percentage = " + percentage + "\n Grade A");
                    } else if (percentage >= 80) {
                        resultTextView.setText("Percentage = " + percentage + "\n Grade B");
                    } else if (percentage >= 70) {
                        resultTextView.setText("Percentage = " + percentage + "\n Grade C");
                    } else if (percentage >= 60) {
                        resultTextView.setText("Percentage = " + percentage + "\n Grade D");
                    } else if (percentage >= 40) {
                        resultTextView.setText("Percentage = " + percentage + "\n Grade E");
                    } else {
                        resultTextView.setText("Percentage = " + percentage + "\n Grade F");
                    }
                } else {
                    resultTextView.setText("Please enter marks for all subjects.");
                }

            }
        });

    }
}