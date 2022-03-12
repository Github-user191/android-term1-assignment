package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyDevProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile_screen);

        Button myDevProfileBackBtn = (Button) findViewById(R.id.myDevProfileBackBtn);
        TextView myDevProfileLinkedInTextView = (TextView) findViewById(R.id.myDevProfileLinkedInTextView);
        TextView myDevProfileContactNumberTextView = (TextView) findViewById(R.id.myDevProfileContactNumberTextView);
        TextView myDevProfileEmailTextView = (TextView) findViewById(R.id.myDevProfileEmailTextView);

        myDevProfileBackBtn.setOnClickListener((View v) -> {
            Intent goToMenuActivity = new Intent(MyDevProfileScreen.this, MenuScreen.class);
            startActivity(goToMenuActivity);
        });

        myDevProfileLinkedInTextView.setOnClickListener((View v) -> {
            Intent goToWebPage = new Intent(Intent.ACTION_VIEW);
            goToWebPage.setData(Uri.parse("https://www.linkedin.com/in/muhammad-luqmaan-h-297505210/"));
            startActivity(goToWebPage);
        });

        myDevProfileEmailTextView.setOnClickListener((View v) -> {
            Intent goToEmailIntent = new Intent(Intent.ACTION_SENDTO);
            goToEmailIntent.setData(Uri.parse("mailto:" + myDevProfileEmailTextView.getText().toString()));
            goToEmailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
            goToEmailIntent.putExtra(Intent.EXTRA_TEXT, "My Email message");
            startActivity(goToEmailIntent);
        });


        myDevProfileContactNumberTextView.setOnClickListener((View v) ->{
            Intent goToDialerIntent = new Intent(Intent.ACTION_DIAL);
            goToDialerIntent.setData(Uri.parse("tel:" + myDevProfileContactNumberTextView.getText().toString()));
            startActivity(goToDialerIntent);
        });

    }
}