package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2015/7/22.
 */
public class simpleAdapterDemo extends Activity {
    private String[] names = new String[]{"java01", "java02", "java03", "java04"};
    private String[] descs = new String[]{"android01", "android02", "android03", "android04"};
    private int[] imageIds = new int[]{
            android.R.drawable.alert_dark_frame, android.R.drawable.alert_dark_frame, android.R.drawable.alert_dark_frame, android.R.drawable.alert_dark_frame,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpledemo);
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> list1 = new HashMap<String, Object>();
            list1.put("header", imageIds[i]);
            list1.put("personName", names[i]);
            list1.put("desc", descs[i]);
            list2.add(list1);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list2, R.layout.simple_item, new String[]{"personName", "header", "desc"}, new int[]{R.id.name, R.id.head, R.id.desc});
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(simpleAdapter);
    }
}
