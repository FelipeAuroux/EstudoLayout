package com.example.estudolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        ImageView avatar = findViewById(R.id.imageView4);
        avatar.setImageResource(R.drawable.logomarca);

        ListView menus = findViewById(R.id.listamenu);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.menus, android.R.layout.simple_list_item_1);
        menus.setAdapter(adapter);

        ListView favss = findViewById(R.id.listafavs);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.favss, android.R.layout.simple_list_item_1);
        favss.setAdapter(adapter2);

    }
}