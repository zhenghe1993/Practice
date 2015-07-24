package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/7/24.
 */
public class MenuDemo extends Activity {
    final int FONT_10 = 0x111;
    final int FONT_12 = 0x112;
    final int FONT_14 = 0x113;
    final int FONT_16 = 0x114;
    final int FONT_18 = 0x115;
    final int PLAIN_ITEM = 0x11b;
    final int fONT_RED = 0x116;
    final int fONT_BLUE = 0x117;
    final int fONT_GREEN = 0x118;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        SubMenu subMenu = menu.addSubMenu("font");
        subMenu.setIcon(R.drawable.practice);
        subMenu.setHeaderIcon(R.drawable.practice);
        subMenu.setHeaderTitle("choose the font size");
        subMenu.add(0, FONT_10, 0, "10 FONT");
        subMenu.add(0, FONT_12, 0, "12 FONT");
        subMenu.add(0, FONT_14, 0, "14 FONT");
        subMenu.add(0, FONT_16, 0, "16 FONT");
        subMenu.add(0, FONT_18, 0, "18 FONT");
        menu.add(0, PLAIN_ITEM, 0, "normal menu item");
        SubMenu colorMenu = menu.addSubMenu("font color");
        colorMenu.setIcon(R.drawable.practice);
        colorMenu.setHeaderIcon(R.drawable.practice);
        colorMenu.setHeaderTitle("choose the font color");
        colorMenu.add(0, fONT_RED, 0, "red");
        colorMenu.add(0, fONT_BLUE, 0, "blue");
        colorMenu.add(0, fONT_GREEN, 0, "green");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case FONT_10:
                Toast.makeText(MenuDemo.this, "FONT_10", Toast.LENGTH_SHORT).show();
                break;
            case FONT_12:
                Toast.makeText(MenuDemo.this, "FONT_12", Toast.LENGTH_SHORT).show();
                break;
            case FONT_14:
                Toast.makeText(MenuDemo.this, "FONT_14", Toast.LENGTH_SHORT).show();
                break;
            case FONT_16:
                Toast.makeText(MenuDemo.this, "FONT_16", Toast.LENGTH_SHORT).show();
                break;
            case FONT_18:
                Toast.makeText(MenuDemo.this, "FONT_18", Toast.LENGTH_SHORT).show();
                break;
            case fONT_RED:
                Toast.makeText(MenuDemo.this, "fONT_RED", Toast.LENGTH_SHORT).show();
                break;
            case fONT_BLUE:
                Toast.makeText(MenuDemo.this, "fONT_BLUE", Toast.LENGTH_SHORT).show();
                break;
            case fONT_GREEN:
                Toast.makeText(MenuDemo.this, "fONT_GREEN", Toast.LENGTH_SHORT).show();
                break;
            case PLAIN_ITEM:
                Toast.makeText(MenuDemo.this, "PLAIN_ITEM", Toast.LENGTH_SHORT).show();
                break;


        }


        return true;
    }
}
