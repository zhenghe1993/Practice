package com.example.practice;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/7/23.
 */
public class ViewSwitchDemo extends Activity{

    public static final int NUMBER_PER_SCREEN=12;
    public static class DataItem{
        public String dataName;
        public Drawable drawable;
    }
    private ArrayList<DataItem> items=new ArrayList<DataItem>();
    private int screenNo=-1;
    private int screenCount;
    ViewSwitcher switcher;
    LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.viewswitchdemo);
        inflater=LayoutInflater.from(ViewSwitchDemo.this);
        for (int i=0;i<40;i++){
            String label=""+i;
            Drawable drawable=getResources().getDrawable(R.drawable.practice);
            DataItem item=new DataItem();
            item.dataName=label;
            item.drawable=drawable;
            items.add(item);
        }
        screenCount=items.size()%NUMBER_PER_SCREEN==0?
                items.size()/NUMBER_PER_SCREEN:
                items.size()/NUMBER_PER_SCREEN+1;
        switcher=(ViewSwitcher)findViewById(R.id.viewswitch);
             switcher.setFactory(new ViewSwitcher.ViewFactory() {
                 @Override
                 public View makeView() {

                     return inflater.inflate(R.layout.slidelistview,null);
                 }
             });
        next(null)   ;
    }
    public void next(View v){
        if (screenNo<screenCount-1){
            screenNo++;
            switcher.setInAnimation(this, R.anim.slide_in_ringht);
            switcher.setOutAnimation(this, R.anim.slide_in_left);
            ((GridView)switcher.getNextView()).setAdapter(baseAdapter);
            switcher.showNext();
        }
    }
    public void prev(View v){

        if (screenNo>0){
            screenNo--;
            switcher.setInAnimation(this,R.anim.slide_in_left);
            switcher.setOutAnimation(this, R.anim.slide_in_ringht);
            ((GridView)switcher.getNextView()).setAdapter(baseAdapter);
            switcher.showPrevious();
        }
    }
    private BaseAdapter baseAdapter=new BaseAdapter() {
        @Override
        public int getCount() {
            if (screenNo==screenCount-1&&items.size()%NUMBER_PER_SCREEN!=0){
                 return  items.size()%NUMBER_PER_SCREEN;
            }
            return NUMBER_PER_SCREEN;
        }

        @Override
        public DataItem getItem(int position) {
            return items.get(screenNo*NUMBER_PER_SCREEN+position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
               View view=convertView;
            if (convertView==null){
                view=inflater.inflate(R.layout.viewswitch_item,null);
            }
            ImageView imageView=(ImageView)findViewById(R.id.image);
            imageView.setImageDrawable(getItem(position).drawable);
            TextView textView=(TextView)findViewById(R.id.text);
            textView.setText(getItem(position).dataName);
            return view;
        }
    };
}
