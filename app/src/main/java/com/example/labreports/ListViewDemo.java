package com.example.labreports;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewDemo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ListView listView = findViewById(R.id.mylist);
        String gods[] ={"Krishna", "Hanuman", "Shiva", "Ram", "Bramha"};

        // displaying the list using arrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_items, R.id.list, gods);
        listView.setAdapter(adapter);
    }
}
