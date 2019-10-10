package com.ibgyoutube.example.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attempts to launch an activity within our own app
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.ibgyoutube.example.quicklauncher.SOMETHING", "HELLO WORLD!");
                startActivity(startIntent);
            }
        });

        // Attempt to launch an activity outside our app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.google.com";
                String yahoo = "http://www.yahoo.com";
                Uri webaddress = Uri.parse(yahoo);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotoGoogle.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(gotoGoogle);
                }
            }
        });
    }
}
