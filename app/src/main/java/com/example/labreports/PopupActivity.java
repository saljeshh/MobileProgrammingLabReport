package com.example.labreports;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PopupActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
    }

    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        int id = menuItem.getItemId();
        if(id == R.id.item11){
            Toast.makeText(this,"Item1 clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item21){
            Toast.makeText(this,"Item2 clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item31){
            Toast.makeText(this,"Item3 clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item41){
            Toast.makeText(this,"Item4 clicked", Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}
