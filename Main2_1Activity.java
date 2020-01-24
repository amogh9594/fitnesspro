package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2_1Activity extends AppCompatActivity {
    VideoView v1,v2,v3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_1);

        v1 = (VideoView) findViewById(R.id.videoView1);
        //v2 = (VideoView) findViewById(R.id.videoView2);
        //v3 = (VideoView) findViewById(R.id.videoView3);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.abs3;
        Uri uri = Uri.parse(videoPath);
        v1.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        v1.setMediaController(mediaController);
        mediaController.setAnchorView(v1);

        //MediaController mediaController=new MediaController(this);

        //Uri uri1=Uri.parse("android.resourse://"+getPackageName()+"/"+R.raw.abs1);
        //v1.setMediaController(mediaController);
        //v1.setVideoURI(uri1);
        //v1.start();


        //Uri uri2=Uri.parse("android.resourse://"+getPackageName()+"/"+R.raw.abs2);
        //v2.setMediaController(mediaController);
        //v2.setVideoURI(uri2);
        //v2.start();

        //Uri uri3=Uri.parse("android.resourse://"+getPackageName()+"/"+R.raw.abs3);
        //v3.setMediaController(mediaController);
        //v3.setVideoURI(uri3);
        //v3.start();


    }






}
