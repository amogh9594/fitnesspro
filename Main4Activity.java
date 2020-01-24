package com.example.myfirst;



import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main4Activity extends Activity {

    Button b1;
    EditText e1;
    EditText e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b1 = (Button) findViewById(R.id.button1);
        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                float BMI = a / (b * b);

                if (BMI < 16) {
                    Toast.makeText(getApplicationContext(), "Serverely Uenderweight", Toast.LENGTH_LONG).show();
                }

                else if(BMI < 18.5) {
                    Toast.makeText(getApplicationContext(), " Uenderweight", Toast.LENGTH_LONG).show();
                }

                else if(BMI < 25) {
                    Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_LONG).show();
                }

                else if(BMI < 30) {
                    Toast.makeText(getApplicationContext(), " Overweight", Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(getApplicationContext(), "obese", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}







