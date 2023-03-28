package com.example.estudolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class linear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);



        ListView listamenu = findViewById(R.id.listamenu);
            String[] menu = {"Bebidas", "Comida", "Mercearia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        listamenu.setAdapter(adapter);

        ListView listafavs = findViewById(R.id.listafavs);
            String[] favs = {"Latte", "Cappuccino", "Filter"};
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favs);
            listafavs.setAdapter(adapter2);
    }
}