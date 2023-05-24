package com.mitusov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView1 = findViewById(R.id.myText);
        myTextView1.setText("New text in TextView");
        Button myBtn = findViewById(R.id.myBtn);
        myBtn.setText("My button");
        myBtn.setEnabled(false);
    }
}