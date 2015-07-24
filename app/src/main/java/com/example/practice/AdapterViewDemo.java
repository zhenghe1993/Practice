package com.example.practice;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2015/7/22.
 */
public class AdapterViewDemo extends Activity {
    Button arraybn;
    Button listbn;
    Button simplebn;
    Button superbasebn;
    Button autoComplete;
    Button Expandable;
    Button views;
    Button search;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapterviewdemo);
        init();
        onClick();

    }

    private void init() {
        arraybn = (Button) findViewById(R.id.arrayadapter);
        listbn = (Button) findViewById(R.id.listactivitydemo);
        simplebn = (Button) findViewById(R.id.simple);
        superbasebn = (Button) findViewById(R.id.superbase);
        autoComplete = (Button) findViewById(R.id.autoComplete);
        Expandable = (Button) findViewById(R.id.Expandable);
        views = (Button) findViewById(R.id.views);
        search = (Button) findViewById(R.id.search);
        menu = (Button) findViewById(R.id.menu);
    }

    private void onClick() {
        arraybn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, ArrayAdapterDemo.class);
                startActivity(intent);
            }
        });
        listbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, listActivityDemo.class);
                startActivity(intent);
            }
        });
        simplebn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, simpleAdapterDemo.class);
                startActivity(intent);

            }
        });
        superbasebn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, baseAdapterDemo.class);
                startActivity(intent);
            }
        });
        autoComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, AutoCompleteTextViewDemo.class);
                startActivity(intent);
            }
        });
        Expandable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, ExpandableDemo.class);
                startActivity(intent);
            }
        });
        views.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, ViewSwitchDemo.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, SearchDemo.class);
                startActivity(intent);
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdapterViewDemo.this, MenuDemo.class);
                startActivity(intent);
            }
        });
    }
}
