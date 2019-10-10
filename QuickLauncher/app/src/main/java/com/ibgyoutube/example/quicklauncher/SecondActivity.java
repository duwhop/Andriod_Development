package com.ibgyoutube.example.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.ibgyoutube.example.quicklauncher.SOMETHING"))
        {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.ibgyoutube.example.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
