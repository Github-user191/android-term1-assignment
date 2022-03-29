package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        Button menuHomeBtn = (Button) findViewById(R.id.menuHomeBtn);
        Button menuCalculationBtn = (Button) findViewById(R.id.menuCalculationBtn);
        Button menuAboutMeBtn = (Button) findViewById(R.id.menuAboutMeBtn);
        Button menuMyDevProfileBtn = (Button) findViewById(R.id.menuMyDevProfileBtn);
        TextView nameTextView  = (TextView) findViewById(R.id.nameTextView);

        String name = getIntent().getStringExtra("name");
        nameTextView.setText("Dear " + visitorName);


        menuHomeBtn.setOnClickListener((View v) -> {
            Intent goToLauncherActivity = new Intent(MenuScreen.this, LauncherScreen.class);
            startActivity(goToLauncherActivity);
        });

        menuCalculationBtn.setOnClickListener((View v) -> {
            Intent goToCalculatorActivity = new Intent(MenuScreen.this, CalculationScreen.class);
            startActivity(goToCalculatorActivity);
        });


        menuAboutMeBtn.setOnClickListener((View v) -> {
            Intent goToAboutMeActivity = new Intent(MenuScreen.this, AboutMeScreen.class);
            startActivity(goToAboutMeActivity);
        });


        menuMyDevProfileBtn.setOnClickListener((View v) -> {
            Intent goToMyDevProfileActivity = new Intent(MenuScreen.this, MyDevProfileScreen.class);
            startActivity(goToMyDevProfileActivity);
        });

    }
}