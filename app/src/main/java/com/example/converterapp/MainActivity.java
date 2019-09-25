package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText amountET;
private RadioButton dollartotkRB,tktodollarRB;
private Button convertBtn;
private TextView resultTV;
private String amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountET=findViewById(R.id.amountET);
        dollartotkRB=findViewById(R.id.dollartotkRB);
        tktodollarRB=findViewById(R.id.tktodollarRB);
        convertBtn=findViewById(R.id.convertBtn);
        resultTV=findViewById(R.id.resultTV);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = amountET.getText().toString();
                if (amount.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter amount", Toast.LENGTH_LONG).show();
                } else {
                    if (dollartotkRB.isChecked()) {
                        double totalAmount = Double.valueOf(amount);
                        double result = totalAmount * 80;
                        resultTV.setText(String.valueOf(result));

                    } else {
                        double totalAmount = Double.valueOf(amount);
                        double result = totalAmount / 80;
                        resultTV.setText(String.valueOf(result));

                    }
                }
            }
        });



    }
}
