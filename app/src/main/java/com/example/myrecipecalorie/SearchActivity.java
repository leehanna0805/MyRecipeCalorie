package com.example.myrecipecalorie;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    Button button3;
    Button button4;
    SQLiteDatabase database;
    //DB
    public void openDatabase(){
        database=openOrCreateDatabase("myDB", MODE_PRIVATE, null);
        if(database!=null) {
            String sql = "create table if not exists ingredients (_id integer PRIMARY KEY autoincrement, ing_name text, ing_kcal float)";
            database.execSQL(sql);
        }
    }
    /*
    public void insertData(){
        if(database!=null){
            String sql = "insert into ingredients(ing_name, ing_kcal) values ('계란',155.10)";
            database.execSQL(sql);
        }
    }
    */
    public void selectData(){
        String sql = "select ing_name, ing_kcal from ingredients";
        Cursor cursor = database.rawQuery(sql, null);

        while(cursor.moveToNext()){
            String name = cursor.getString(0);
            float kcal = cursor.getFloat(1);
            System.out.println("#: "+name+", "+kcal);
        }
        cursor.close();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        openDatabase();
        selectData();

        //뒤로가기, 홈버튼
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //재료들
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",1);
                startActivity(intent);
            }
        });
        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",2);
                startActivity(intent);
            }
        });
        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",3);
                startActivity(intent);
            }
        });
        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",4);
                startActivity(intent);
            }
        });
        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",5);
                startActivity(intent);
            }
        });
        Button button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",6);
                startActivity(intent);
            }
        });
        Button button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",7);
                startActivity(intent);
            }
        });
        Button button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",8);
                startActivity(intent);
            }
        });
        Button button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",9);
                startActivity(intent);
            }
        });
        Button button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",10);
                startActivity(intent);
            }
        });
        Button button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",11);
                startActivity(intent);
            }
        });
        Button button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",12);
                startActivity(intent);
            }
        });
        Button button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",13);
                startActivity(intent);
            }
        });
        Button button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",14);
                startActivity(intent);
            }
        });
        Button button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",15);
                startActivity(intent);
            }
        });
        Button button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",16);
                startActivity(intent);
            }
        });
        Button button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",17);
                startActivity(intent);
            }
        });
        Button button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",18);
                startActivity(intent);
            }
        });
        Button button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",19);
                startActivity(intent);
            }
        });
        Button button24 = (Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",20);
                startActivity(intent);
            }
        });
        Button button25 = (Button)findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",21);
                startActivity(intent);
            }
        });
        Button button26 = (Button)findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity2.class);
                intent.putExtra("key",22);
                startActivity(intent);
            }
        });
    }
}