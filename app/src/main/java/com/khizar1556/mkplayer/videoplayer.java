package com.khizar1556.mkplayer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.khizar1556.mkvideoplayer.MKPlayer;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * Created by khizar1556 on 10/6/2017.
 */

public class videoplayer extends AppCompatActivity {
private MKPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videoplayer);
        player=new MKPlayer(this);
        player.onComplete(new Runnable() {
            @Override
            public void run() {
                //callback when video is finish
                Toast.makeText(getApplicationContext(), "video play completed",Toast.LENGTH_SHORT).show();
            }
        }).onInfo(new MKPlayer.OnInfoListener() {
            @Override
            public void onInfo(int what, int extra) {
                switch (what) {
                    case IMediaPlayer.MEDIA_INFO_BUFFERING_START:
                        //do something when buffering start
                        break;
                    case IMediaPlayer.MEDIA_INFO_BUFFERING_END:
                        //do something when buffering end
                        break;
                    case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH:
                        //download speed
                        break;
                    case IMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:
                        //do something when video rendering
                        break;
                }
            }
        }).onError(new MKPlayer.OnErrorListener() {
            @Override
            public void onError(int what, int extra) {
                Toast.makeText(getApplicationContext(), "video play error",Toast.LENGTH_SHORT).show();
            }
        });
        player.setPlayerCallbacks(new MKPlayer.playerCallbacks() {
            @Override
            public void onNextClick() {
                String url = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8";

                player.play(url);
                player.setTitle(url);
            }

            @Override
            public void onPreviousClick() {
                String url = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";

                player.play(url);
                player.setTitle(url);
                /*String url = ((EditText) findViewById(R.id.et_url)).getText().toString();
                MKPlayerActivity.configPlayer(videoplayer.this).setTitle(url).play(url);*/
            }
        });
        String url=getIntent().getStringExtra("url");
        player.play(url);
        player.setTitle(url);
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (player != null) {
            player.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (player != null) {
            player.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (player != null && player.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
}