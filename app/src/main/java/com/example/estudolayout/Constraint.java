package com.example.estudolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Constraint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        ImageView avatar = findViewById(R.id.imageView);
        avatar.setImageResource(R.drawable.logomarca);

        ListView lista= findViewById(R.id.lista);
            String[] menu = {"Bebidas", "Comida", "Mercearia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        lista.setAdapter(adapter);

        ListView favs = findViewById(R.id.listafavs);
            String[] bebidas = {"Latte", "Cappuccino", "Filter"};
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bebidas);
            favs.setAdapter(adapter2);



    }
}