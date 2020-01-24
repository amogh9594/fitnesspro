package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity implements SensorEventListener {

     SensorManager sensorManager;
     TextView t1;
     boolean running=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        t1 = (TextView) findViewById(R.id.textView2);
        //t1.setText("");
        Button reset=(Button)findViewById(R.id.reset);


        sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                //t1.setText(String.valueOf(0));
                t1.setText(" ");
            }
        });

    }


    @Override
    protected void onResume() {
        t1.setText("");

        super.onResume();
        running=true;
        Sensor countsensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countsensor !=null){
            sensorManager.registerListener(this,countsensor,SensorManager.SENSOR_DELAY_UI);
        }

        else {
            Toast.makeText(this,"Sensor not found!",Toast.LENGTH_SHORT).show();
        }
    }



    @Override
    protected void onPause() {
        //t1.setText("");
        super.onPause();
        running=false;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
     if(running){
         t1.setText(String.valueOf(event.values[0]));
     }
     else{
         event.values[0] = 0;
     }

    }



    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    protected void onDestroy() {
        super.onDestroy();
    }


    }


