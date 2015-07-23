package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * Created by Administrator on 2015/7/22.
 */
public class NeonActivity extends Activity {

    private int currentColor = 0;
    final int[] colors = new int[]{
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5,
            R.color.color6
    };
    final int[] names = new int[]{
            R.id.view01,
            R.id.view02,
            R.id.view03,
            R.id.view04,
            R.id.view05,
            R.id.view06
    };
    TextView[] textViews = new TextView[names.length];
    Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            if (msg.what==0x123){
                for (int i=0;i<names.length;i++){
                    textViews[i].setBackgroundResource(colors[(i+currentColor)%names.length]);
                }
                currentColor++;
            }

            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neon);
        for (int i = 0; i < names.length; i++) {
            textViews[i] = (TextView) findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,200);

    }

}
