package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * 自动完成文本框
 * Created by Administrator on 2015/7/22.
 */
public class AutoCompleteTextViewDemo extends Activity {

    AutoCompleteTextView auto;
    MultiAutoCompleteTextView mul;
    String[] books = new String[]{
            "android01",
            "android01",
            "android01",
            "android01"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompletetextviewdemo);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,books);
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        auto.setAdapter(aa);
        mul=(MultiAutoCompleteTextView)findViewById(R.id.mul);
        mul.setAdapter(aa);
        //设置分隔符
        mul.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
