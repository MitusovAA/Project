package com.mitusov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);


        View.OnClickListener oclBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        btnOk.setOnClickListener(oclBtnOK);

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка Cancel");

            }
        };
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}