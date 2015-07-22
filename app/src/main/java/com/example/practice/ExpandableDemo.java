package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 可展开的列表组件
 * Created by Administrator on 2015/7/22.
 */
public class ExpandableDemo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandable);
        ExpandableListAdapter adapter = new BaseExpandableListAdapter() {
            int[] logos = new int[]{
                    R.drawable.practice,
                    R.drawable.practice,
                    R.drawable.practice
            };
            private String[] armTypes = new String[]{
                    "android01",
                    "android02",
                    "android03",


            };
            private String[][] arms = new String[][]{
                    {"android01",
                            "android02",
                            "android03",
                            "android04"},
                    {"android01",
                            "android02",
                            "android03",
                            "android04"},
                    {"android01",
                            "android02",
                            "android03",
                            "android04"}

            };

            @Override
            public int getGroupCount() {
                return armTypes.length;
            }

            @Override
            public int getChildrenCount(int groupPosition) {
                return arms[groupPosition].length;
            }

            @Override
            public Object getGroup(int groupPosition) {
                return armTypes[groupPosition];
            }

            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return arms[groupPosition][childPosition];
            }

            @Override
            public long getGroupId(int groupPosition) {
                return groupPosition;
            }

            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return childPosition;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            private TextView getTextView (){
                AbsListView.LayoutParams lp=new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,64);
                TextView textView=new TextView(ExpandableDemo.this);
                textView.setLayoutParams(lp);
                textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
                textView.setPadding(36, 0, 0, 0);
                textView.setTextSize(20);
                return textView;
            }
            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
                LinearLayout l1=new LinearLayout(ExpandableDemo.this);
                l1.setOrientation(LinearLayout.HORIZONTAL);
                ImageView logo=new ImageView(ExpandableDemo.this);
                logo.setImageResource(logos[groupPosition]);
                l1.addView(logo);
                TextView textView=getTextView();
                textView.setText(getGroup(groupPosition).toString());
                l1.addView(textView);

                return l1;
            }

            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
                TextView textView=getTextView();
                textView.setText(getChild(groupPosition, childPosition).toString());
                return textView;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }
        } ;
        ExpandableListView expandableListView=(ExpandableListView)findViewById(R.id.Expandable);
        expandableListView.setAdapter(adapter);

    }
}
