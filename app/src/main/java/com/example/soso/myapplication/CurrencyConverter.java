package com.example.soso.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {

    public void Convert(View view){
        try {
            EditText dollarField = (EditText)findViewById(R.id.dollarfield);
            Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
            Double poundAmount = dollarAmount * 0.65 ;
            Toast.makeText(getApplicationContext(),"poundAmount = " +poundAmount.toString(),Toast.LENGTH_LONG).show();

        }catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(),"please enter value",Toast.LENGTH_LONG).show();
            return;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }
}
