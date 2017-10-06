package com.khizar1556.mkplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_play) {
                    String url = ((EditText) findViewById(R.id.et_url)).getText().toString();
                    Intent i=new Intent(MainActivity.this,videoplayer.class);
                    i.putExtra("url",url);
                    startActivity(i);
                }
            }
        };
        findViewById(R.id.btn_play).setOnClickListener(clickListener);
    }
}
