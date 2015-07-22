package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import CustomAssembly.DrawViewOfBall;

/**
 *
 * Created by Administrator on 2015/7/22.
 */
public class FingerOfBall extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fingerofball);
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.root);
               final DrawViewOfBall drawViewOfBall=new DrawViewOfBall(this);
        drawViewOfBall.setMinimumHeight(500);
        drawViewOfBall.setMinimumWidth(300);
        linearLayout.addView(drawViewOfBall);
    }
}
