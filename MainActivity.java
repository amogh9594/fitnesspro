package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4,b5,b6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = getIntent().getStringExtra("username");


       // TextView tv = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.Button1);
       // tv.setText("Welcome ,"+getIntent().getExtras().getString("username"));
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

        b5 = (Button) findViewById(R.id.Button5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveToActivtysix();
                //System.out.println("Button Clicked");
            }

        });

        b6 = (Button) findViewById(R.id.Button6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveToActivtyseven();
                //System.out.println("Button Clicked");
            }

        });


    }

    private void moveToActivtytwo() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    private void moveToActivtythree() {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    private void moveToActivtyfour() {
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }

    private void moveToActivtyfive() {
        Intent intent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }

    private void moveToActivtysix() {
        Intent intent = new Intent(MainActivity.this, Main10Activity.class);
        startActivity(intent);
    }

    private void moveToActivtyseven() {
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Sign In", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Main8Activity.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, Main7Activity.class);
                startActivity(intent1);
                return true;
            case R.id.item3:
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, Main9Activity.class);
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}