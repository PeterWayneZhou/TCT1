package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class YourReceipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_receipt);
        setTitle("Your Receipt");

        Intent receivedIntent=getIntent();
        String amountString=receivedIntent.getStringExtra("KEY_AMOUNT");
        String taxString=receivedIntent.getStringExtra("KEY_TAX");
        String tipString=receivedIntent.getStringExtra("KEY_TIP");
        double amount=Double.parseDouble(amountString);
        double taxPercentage=Double.parseDouble(taxString);
        double taxTotal=amount*taxPercentage;
        double tipPercentage=Double.parseDouble(tipString);
        double tipTotal=amount*tipPercentage;
        double totalAmount=amount+taxTotal+tipTotal;

        TextView total=findViewById(R.id.total);
        total.setText("TOTAL: "+amount);

        TextView tax=findViewById(R.id.taxPercentage);
        tax.setText("SALES TAX: "+taxTotal );

        TextView tip=findViewById(R.id.tipPercentage);
        tip.setText("TIP: "+tipTotal);

        TextView grandTotal=findViewById(R.id.grandTotal);
        grandTotal.setText("Grand Total: "+totalAmount);
    }


}
