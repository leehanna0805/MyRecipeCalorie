package com.example.myrecipecalorie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyRecipeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe_list);

        //뒤로가기, 홈버튼
        Button button39 = (Button)findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Button button40 = (Button)findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //recipes
        Button button43 = (Button)findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyRecipeList2.class);
                intent.putExtra("key",1);
                startActivity(intent);
            }
        });
        Button button44 = (Button)findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyRecipeList2.class);
                intent.putExtra("key",2);
                startActivity(intent);
            }
        });
        Button button45 = (Button)findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyRecipeList2.class);
                intent.putExtra("key",3);
                startActivity(intent);
            }
        });
    }
}