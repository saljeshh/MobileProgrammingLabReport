package com.example.labreports;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.context);

        TextView txt = findViewById(R.id.text_view);

        registerForContextMenu(txt);

    }

    // ctrl+o - oncreatecontext menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.option1){
            Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.option2){
            Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}
