package com.example.estudolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Relative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);

        ImageView avatar = findViewById(R.id.imageView3);
        avatar.setImageResource(R.drawable.logomarca);

        ListView listamenu = findViewById(R.id.listamenu);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.menus, android.R.layout.simple_list_item_1);
        listamenu.setAdapter(adapter);

        ListView listafavs = findViewById(R.id.listafavs);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.favss, android.R.layout.simple_list_item_1);
        listafavs.setAdapter(adapter2);
    }
}