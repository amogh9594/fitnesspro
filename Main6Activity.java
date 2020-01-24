package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button b1;
    EditText e1;
    EditText e2;
    EditText e3;
    RadioButton rb1,rb2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        b1 = (Button) findViewById(R.id.button1);
        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);
        e3 = (EditText) findViewById(R.id.ed3);
        rg=(RadioGroup)findViewById(R.id.groupradio);
        rb1 = (RadioButton) findViewById(R.id.radia_id1);
        rb2 = (RadioButton) findViewById(R.id.radia_id2);

        //String gender= "";

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                int age = Integer.parseInt(e3.getText().toString());

                if(rb1.isChecked()) {


                    double BMR = 66 + (13.7 * a) + (5 * b) - (6.8 * age);
                    Toast.makeText(getApplicationContext(), "Your BMR:+" + BMR, Toast.LENGTH_LONG).show();

                }

                else if (rb2.isChecked()) {

                    double BMR = 665 + (9.6 * a) + (1.8 * b) - (4.7 * age);
                    Toast.makeText(getApplicationContext(), "Your BMR:+" + BMR, Toast.LENGTH_LONG).show();

                }

              //  if (BMR < 16) {
                  //  Toast.makeText(getApplicationContext(), "Serverely Uenderweight", Toast.LENGTH_LONG).show();
                //}

                //else if(BMR < 18.5) {
                  //  Toast.makeText(getApplicationContext(), " Uenderweight", Toast.LENGTH_LONG).show();
                //}

                //else if(BMR < 25) {
                  //  Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_LONG).show();
                //}

                //else if(BMR < 30) {
                  //  Toast.makeText(getApplicationContext(), " Overweight", Toast.LENGTH_LONG).show();
                //}

               // else{
                 //   Toast.makeText(getApplicationContext(), "obese", Toast.LENGTH_LONG).show();
                //}
            }
        });
    }
}



