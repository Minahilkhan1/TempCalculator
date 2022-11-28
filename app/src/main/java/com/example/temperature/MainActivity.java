package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Convertor();

    }

    private void Convertor() {
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);


        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           EditText editText = findViewById(R.id.value);
                                           TextView textView = findViewById(R.id.tv);
                                           float C = Float.parseFloat(editText.getText().toString());
                                           float result = C * 9 / 5 + 32;
                                           textView.setText(String.valueOf(result) + "F");
                                       }
                                   }
        );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.value);
                TextView textView = findViewById(R.id.tv2);
                float C = Float.parseFloat(editText.getText().toString());
                double result = C + 275.15;
                textView.setText(String.valueOf(result) + "K");


            }
        });

    }}