package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button) findViewById(R.id.Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveToActivtytwo();
                //System.out.println("Button Clicked");
            }

        });

        b2 = (Button) findViewById(R.id.Button2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveToActivtythree();
                //System.out.println("Button Clicked");
            }

        });

        b3 = (Button) findViewById(R.id.Button3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveToActivtyfour();
                //System.out.println("Button Clicked");
            }

        });

        b4 = (Button) findViewById(R.id.Button4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveToActivtyfive();
                //System.out.println("Button Clicked");
            }

        });
    }

    private void moveToActivtytwo(){
        Intent intent=new Intent(Main2Activity.this,Main2_1Activity.class);
                startActivity(intent);
    }

    private void moveToActivtythree(){
        Intent intent=new Intent(Main2Activity.this,Main2_2Activity.class);
        startActivity(intent);
    }

    private void moveToActivtyfour(){
        Intent intent=new Intent(Main2Activity.this,Main2_3Activity.class);
        startActivity(intent);
    }

    private void moveToActivtyfive(){
        Intent intent=new Intent(Main2Activity.this,Main2_4Activity.class);
        startActivity(intent);
    }
}
