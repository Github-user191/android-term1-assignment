package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_screen);

        Button calculationBackBtn = (Button) findViewById(R.id.calculationBackBtn);

        calculationBackBtn.setOnClickListener((View v) -> {
            Intent goToMenuActivity = new Intent(getApplicationContext(), MenuScreen.class);
            startActivity(goToMenuActivity);
        });
    }
}