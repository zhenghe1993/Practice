package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 *
 * Created by Administrator on 2015/7/22.
 */
public class UIActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        super.setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        final TextView show = new TextView(this);
        Button bn = new Button(this);
        bn.setText("OK");
        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
         linearLayout.addView(show);
        linearLayout.addView(bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("Hello,android!"+new java.util.Date());
            }
        });
    }
}
