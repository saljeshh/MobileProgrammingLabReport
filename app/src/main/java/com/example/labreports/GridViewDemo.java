package com.example.labreports;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewDemo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        GridView gridView = findViewById(R.id.mygrid);

        String names [] = {"Jay shree ram", "Om nama Shivaya", "Jay shree Krishna", "Har har Mahadev"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.grid_view_items, R.id.list, names);

        gridView.setAdapter(adapter);

    }
}
