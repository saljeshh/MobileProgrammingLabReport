package com.example.labreports;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Receiver extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receiver_layout);

        //receiving the data
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String religion = i.getStringExtra("Religion");
        String god = i.getStringExtra("Favourite_god");

        TextView text = findViewById(R.id.showdata);
        text.setText("Name: " + name + "\n" + "Religion: " + religion + "\n" + "Fav god: " + god);
    }
}
