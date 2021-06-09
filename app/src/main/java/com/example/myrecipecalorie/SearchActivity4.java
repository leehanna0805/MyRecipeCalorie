package com.example.myrecipecalorie;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity4 extends AppCompatActivity {
    SQLiteDatabase database;

    public void deleteDB(){
        database = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
        if (database != null) {
            String sql = "delete from myfood";
            database.execSQL(sql);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search4);

        //뒤로가기, 홈버튼
        Button button36 = (Button)findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity3.class);
                startActivity(intent);
            }
        });
        Button button37 = (Button)findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        //저장하기
        Button button38 = (Button)findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                deleteDB();
                Toast toast = Toast.makeText(getApplicationContext(), "레시피 저장됨",Toast.LENGTH_LONG);

                toast.show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}