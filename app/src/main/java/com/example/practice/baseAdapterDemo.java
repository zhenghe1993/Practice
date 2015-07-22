package com.example.practice;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


/**
 *
 * Created by Administrator on 2015/7/22.
 */
public class baseAdapterDemo extends Activity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basedemo);
        listView = (ListView) findViewById(R.id.list);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return 40;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LinearLayout line = new LinearLayout(baseAdapterDemo.this);
                line.setOrientation(LinearLayout.HORIZONTAL);
                ImageView imageView = new ImageView(baseAdapterDemo.this);
                imageView.setImageResource(android.R.drawable.bottom_bar);
                TextView textView = new TextView(baseAdapterDemo.this);
                textView.setText(""+position + 1);
                textView.setTextSize(20);
                textView.setTextColor(Color.RED);
                line.addView(imageView);
                line.addView(textView);
                return line;
            }
        };
        listView.setAdapter(adapter);
    }
}
