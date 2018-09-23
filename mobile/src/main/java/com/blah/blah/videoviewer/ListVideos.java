package com.blah.blah.videoviewer;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.content.CursorLoader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;

public class ListVideos extends AppCompatActivity {
    ArrayList<String>  pathArrList;
    VideoView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_videos);
        view = (VideoView) findViewById(R.id.my_video);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        view.setVideoURI(Uri.parse(path));
        int x = 2;
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(view);
        view.setMediaController(mediaController);
        view.start();

    }


}
