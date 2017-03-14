package com.udacity.shahd.arabicpodcasts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button podItem=(Button) findViewById(R.id.podcastsItem);
        podItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NowPlaying.class);
                startActivity(intent);
            }
        });

        Button podInfo=(Button) findViewById(R.id.addPodcasts);
        podInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AddPodcast.class);
                startActivity(intent);
            }
        });

        Button downloaded=(Button) findViewById(R.id.downloaded);
        downloaded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DownloadedPodcasts.class);
                startActivity(intent);
            }
        });
    }
}
