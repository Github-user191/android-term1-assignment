package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LauncherScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_screen);

        Button launcherNextBtn = (Button) findViewById(R.id.launcherNextBtn);
        EditText launcherVisitorNameEditText = (EditText) findViewById(R.id.launcherVisitorNameEditText);
        TextView launcherVisitorNameErrorTextView = (TextView) findViewById(R.id.launcherVisitorNameErrorTextView);

        launcherVisitorNameErrorTextView.setText("");

        // Using lambda function instead of anonymous inner class since it's a functional interface
        launcherNextBtn.setOnClickListener((View v) -> {

            String visitorName = launcherVisitorNameEditText.getText().toString();

            if (visitorName.equals("")) {
                launcherVisitorNameErrorTextView.setText("Please enter a value");
            } else {
                launcherVisitorNameErrorTextView.setText("");
                Intent goToMenuActivity = new Intent(LauncherScreen.this, MenuScreen.class);
                goToMenuActivity.putExtra("visitorName", visitorName);
                startActivity(goToMenuActivity);
            }


        });


    }
}