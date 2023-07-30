package com.example.labreports;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    // ctrl + o
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.item1){
            Toast.makeText(this,"Item 1 selected", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item2){
            Toast.makeText(this,"Item 2 is selected", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3){
            Toast.makeText(this,"Item 3 is selected", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.subitem1){
            Toast.makeText(this,"Sub Item 1 is selected", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.subitem2){
            Toast.makeText(this,"Sub Item 2 is selected", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
