package com.example.myrecipecalorie;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity3 extends AppCompatActivity {
    SQLiteDatabase database;
    TextView textView2;
    TextView text2;

    public void selectData() {
        database = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
        if (database != null) {
            String sql = "create table if not exists myfood (_id integer PRIMARY KEY autoincrement, ing_name text, gram int, kcal int)";
            database.execSQL(sql);
        }
        System.out.println("");
        String sql = "select * from myfood";
        Cursor cursor = database.rawQuery(sql, null);

        int all_kcal = 0;

        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToNext();
            String name = cursor.getString(1); //첫 칼럼
            int gram = cursor.getInt(2);
            int kcal = cursor.getInt(3);
            System.out.println("#" + i + " -> " + name + ", " + gram + ", " + kcal);
            textView2 = (TextView)findViewById(R.id.textView2);
            textView2.append(name +": "+ gram+"g, "+ kcal+"kcal\n");
            all_kcal+=kcal;
        }
        text2 = (TextView)findViewById(R.id.text2);
        String all_kcal_str = Integer.toString(all_kcal);
        text2.setText(all_kcal_str);
        cursor.close();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search3);
        selectData();

        //뒤로가기, 홈버튼
        Button button32 = (Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        Button button33 = (Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //더 추가하기
        Button button34 = (Button)findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

        //저장하기
        Button button35 = (Button)findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity4.class);
                startActivity(intent);
            }
        });
    }
}