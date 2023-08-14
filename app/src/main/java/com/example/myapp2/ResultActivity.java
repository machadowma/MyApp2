package com.example.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = (TextView) findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        Float imc = intent.getFloatExtra("imcresult",0);
        textViewResult.setText("IMC = " + imc.toString());
    }
}