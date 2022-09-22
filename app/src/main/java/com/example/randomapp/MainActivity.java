package com.example.randomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText edMin;
    private EditText edMax;
    private Button btnGenerate;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.edMin = (EditText)  findViewById(R.id.editTextMin);
        this.edMax = (EditText) findViewById(R.id.editTextMax);
        this.btnGenerate = (Button) findViewById(R.id.buttonGenerate);
        this.txtResult = (TextView) findViewById(R.id.textResult);

        this.btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(edMin.getText().toString());
                int max = Integer.parseInt(edMax.getText().toString());
                Random generate = new Random();
                txtResult.setText((generate.nextInt((max - min) +1 ) + min) + "");
            }
        });
    }
}