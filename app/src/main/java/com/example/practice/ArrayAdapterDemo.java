package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 *
 * Created by Administrator on 2015/7/22.
 */
public class ArrayAdapterDemo extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setContentView(R.layout.arrayadapterdemo);
        ListView listView1=(ListView)findViewById(R.id.list1);
        String [] arr1={"java01","java02","java03"};
        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,R.layout.array_item,arr1);
        listView1.setAdapter(arrayAdapter1);
        ListView listView2=(ListView)findViewById(R.id.list1);
        String [] arr2={"java01","java02","java03"};
        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(this,R.layout.array_item,arr2);
        listView2.setAdapter(arrayAdapter2);
    }
}
