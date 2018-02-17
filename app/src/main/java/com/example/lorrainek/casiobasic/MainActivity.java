package com.example.lorrainek.casiobasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumberEditText, secondNumberEditText;
    TextView resultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        firstNumberEditText = findViewById(R.id.et_first_number);
        secondNumberEditText = findViewById(R.id.et_second_number);

        int firstNumber = Integer.valueOf(firstNumberEditText.getText().toString());
        int secondNumber = Integer.valueOf(secondNumberEditText.getText().toString());

        int results = firstNumber + secondNumber;

        resultsTextView = findViewById(R.id.results);
        resultsTextView.setText(String.valueOf(results));
    }

    public void minus(View view) {
        firstNumberEditText = findViewById(R.id.et_first_number);
        secondNumberEditText = findViewById(R.id.et_second_number);

        int firstNumber = Integer.valueOf(firstNumberEditText.getText().toString());
        int secondNumber = Integer.valueOf(secondNumberEditText.getText().toString());

        int results = firstNumber - secondNumber;

        resultsTextView = findViewById(R.id.results);
        resultsTextView.setText(String.valueOf(results));
    }

    public void multiply(View view) {
        firstNumberEditText = findViewById(R.id.et_first_number);
        secondNumberEditText = findViewById(R.id.et_second_number);

        int firstNumber = Integer.valueOf(firstNumberEditText.getText().toString());
        int secondNumber = Integer.valueOf(secondNumberEditText.getText().toString());

        int results = firstNumber * secondNumber;

        resultsTextView = findViewById(R.id.results);
        resultsTextView.setText(String.valueOf(results));
    }

    public void divide(View view) {
        firstNumberEditText = findViewById(R.id.et_first_number);
        secondNumberEditText = findViewById(R.id.et_second_number);

        int firstNumber = Integer.valueOf(firstNumberEditText.getText().toString());
        int secondNumber = Integer.valueOf(secondNumberEditText.getText().toString());

        int results = firstNumber / secondNumber;

        resultsTextView = findViewById(R.id.results);
        resultsTextView.setText(String.valueOf(results));
    }
}
