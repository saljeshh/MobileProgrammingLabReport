package com.example.labreports;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sender extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sender_layout);

        Button btn = findViewById(R.id.send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sender.this,Receiver.class);
                i.putExtra("name", "Saljesh Maharjan");
                i.putExtra("Religion", "Sanatani");
                i.putExtra("Favourite_god", "Mahadev, Krishna, Ram, Ganesh");
                startActivity(i);
            }
        });

    }
}
