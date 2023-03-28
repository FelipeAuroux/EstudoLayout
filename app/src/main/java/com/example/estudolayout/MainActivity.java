package com.example.estudolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button constraint = (Button) findViewById(R.id.btConstraint);
        constraint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(MainActivity.this, Constraint.class);
                startActivity(intent);
            }
        });

        Button linear = (Button)  findViewById(R.id.btLinear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, linear.class);
                startActivity(intent2);
            }
        });

        Button relative = (Button) findViewById(R.id.btRelative);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Relative.class);
                startActivity(intent3);
            }
        });

        Button grid = (Button) findViewById(R.id.btGrid);
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, grid.class);
                startActivity(intent4);

            }
        });
    }
    }