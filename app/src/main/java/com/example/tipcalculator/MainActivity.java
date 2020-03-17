package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        EditText amountInput=findViewById(R.id.amountInput);
        String amountString=amountInput.getText().toString();

        EditText taxPercentageInput=findViewById(R.id.taxInput);
        String taxString=taxPercentageInput.getText().toString();

        EditText tipInput=findViewById(R.id.tipInput);
        String tipString=tipInput.getText().toString();

        Intent intent=new Intent(this, YourReceipt.class);
        intent.putExtra("KEY_AMOUNT", amountString);
        intent.putExtra("KEY_TAX",taxString);
        intent.putExtra("KEY_TIP", tipString);
        startActivity(intent);
    }


}
