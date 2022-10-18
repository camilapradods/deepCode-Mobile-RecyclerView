package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCart = findViewById(R.id.btCart);
//        btCart.setOnClickListener(view ->{
//            Intent intencao = new Intent()
//        });

        ImageView ivDonut = findViewById(R.id.ivDonut);
        ImageView ivIceCream = findViewById(R.id.ivIceCream);
        ImageView ivFroYo = findViewById(R.id.ivFroYo);





    }
}