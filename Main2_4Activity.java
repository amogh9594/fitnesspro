package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2_4Activity extends AppCompatActivity {
VideoView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_4);
        v1 = (VideoView) findViewById(R.id.videoView1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.glutes1;
        Uri uri = Uri.parse(videoPath);
        v1.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        v1.setMediaController(mediaController);
        mediaController.setAnchorView(v1);


        //MediaController mediaController=new MediaController(this);

        //Uri uri1=Uri.parse("android.resourse://"+getPackageName()+"/"+R.raw.glutes1);
        //v1.setMediaController(mediaController);
        //v1.setVideoURI(uri1);


    }
}
