package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_screen);

        // buttons
        Button calculationBackBtn = (Button) findViewById(R.id.calculationBackBtn);
        Button calculationResultBtn = (Button) findViewById(R.id.calculationResultBtn);
        Button calculationClearBtn = (Button) findViewById(R.id.calculationClearBtn);

        TextView calculationErrorTextView = (TextView) findViewById(R.id.calculationErrorTextView);

        EditText calculationBase1EditText = (EditText) findViewById(R.id.calculationBase1EditText);
        EditText calculationBase2EditText = (EditText) findViewById(R.id.calculationBase2EditText);
        EditText calculationHeightEditText = (EditText) findViewById(R.id.calculationHeightEditText);


        TextView calculationResultTextView = (TextView) findViewById(R.id.calculationResultTextView);

        calculationErrorTextView.setText("");

        calculationBackBtn.setOnClickListener((View v) -> {
            onBackPressed();
        });

        calculationResultBtn.setOnClickListener((View v) -> {
            if(calculationBase1EditText.getText().toString().equals("") || calculationBase2EditText.getText().toString().equals("") || calculationHeightEditText.getText().toString().equals("")) {
                calculationErrorTextView.setText("Please fill out all the fields");
                return;
            } else {
                calculationErrorTextView.setText("");
            }

            Double base1 = Double.parseDouble(calculationBase1EditText.getText().toString());
            Double base2 = Double.parseDouble(calculationBase2EditText.getText().toString());
            Double height = Double.parseDouble(calculationHeightEditText.getText().toString());

            // Area = 0.5 * (base1 + base2) * height;
            Double areaOfTrapezoid = 0.5 * (base1 + base2) * height;

            calculationResultTextView.setText(String.valueOf(areaOfTrapezoid));
        });

        calculationClearBtn.setOnClickListener((View v) -> {
            calculationBase1EditText.setText("");
            calculationBase2EditText.setText("");
            calculationHeightEditText.setText("");
            calculationResultTextView.setText("");
            calculationErrorTextView.setText("");
        });
    }


}