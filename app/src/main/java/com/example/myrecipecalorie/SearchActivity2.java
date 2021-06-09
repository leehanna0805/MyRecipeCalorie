package com.example.myrecipecalorie;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity2 extends AppCompatActivity {

    SQLiteDatabase database;
    String name;
    int kcal;
    int input_kcal;

    public void selectData(int id){
        database=openOrCreateDatabase("myDB", MODE_PRIVATE, null);
        if(database!=null) {
            String sql = "create table if not exists ingredients (_id integer PRIMARY KEY autoincrement, ing_name text, ing_kcal float)";
            database.execSQL(sql);
        }
        String sql = "select * from ingredients where _id="+id;
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToNext();
        name = cursor.getString(1);
        kcal = (int)cursor.getFloat(2);
        cursor.close();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);

        //뒤로가기, 홈버튼
        Button button27 = (Button)findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        Button button28 = (Button)findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Intent getIntent = getIntent();
        int id = getIntent.getIntExtra("key",0);
        selectData(id);
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setText(name);

        Button button29 = (Button)findViewById(R.id.button29);
        button29.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText2 = findViewById(R.id.editText2);
                String inputstr = editText2.getText().toString().trim();
                input_kcal = Integer.parseInt(inputstr);
                kcal = (kcal/100)*input_kcal;
                String cal = Integer.toString(kcal);
                TextView textView9 = (TextView)findViewById(R.id.textView9);
                textView9.setText(cal);
            }
        });

        Button button30 = (Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        Button button31 = (Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //db 테이블 만들고 추가하기. ing_name, (int)input_kcal, (int)kcal
                if(database!=null) {
                    String sql = "create table if not exists myfood (_id integer PRIMARY KEY autoincrement, ing_name text, gram int, kcal int)";
                    database.execSQL(sql);
                    String sql2 = "insert into myfood(ing_name, gram, kcal) values ('"+name+"',"+ input_kcal +","+kcal+")";
                    database.execSQL(sql2);
                }
                Intent intent = new Intent(getApplicationContext(), SearchActivity3.class);
                startActivity(intent);
            }
        });
    }


}