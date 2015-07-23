package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

/**
 * zhengheming is a Administrator
 * Created by Administrator on 2015/7/23.
 */
public class SearchDemo extends Activity implements SearchView.OnQueryTextListener {
    SearchView searchView;
    ListView listView;
    private final String[] names = new String[]{
            "sw", "fg", "gf", "yt", "mj"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchdemo);
        searchView = (SearchView) findViewById(R.id.search);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names));
        listView.setTextFilterEnabled(true);
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryHint("search");

    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)) {
            listView.clearTextFilter();
        } else {
            listView.setFilterText(newText);
        }
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Toast.makeText(SearchDemo.this, "" + query, Toast.LENGTH_SHORT).show();
        return false;
    }
}
