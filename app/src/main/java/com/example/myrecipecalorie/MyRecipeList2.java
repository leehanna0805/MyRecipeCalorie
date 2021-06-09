package com.example.myrecipecalorie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyRecipeList2 extends AppCompatActivity {
    TextView textView10; //요리 이름
    TextView textView11; //들어가는 재료
    TextView textView12; //총칼로리

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe_list2);

        Button button41 = (Button)findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyRecipeList.class);
                startActivity(intent);
            }
        });
        Button button42 = (Button)findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Intent getIntent = getIntent();
        int id = getIntent.getIntExtra("key",0);
        textView10 = (TextView)findViewById(R.id.textView10);
        textView11 = (TextView)findViewById(R.id.textView11);
        textView12 = (TextView)findViewById(R.id.textView12);
        if(id==1) {
            textView10.setText("ham sandwich");
            textView11.setText("식빵: 250g, 710kcal\n\n샌드위치햄: 70g, 180kcal\n\n토마토: 120g, 20kcal\n");
            textView12.setText("910 Kcal");
        }else if(id==2){
            textView10.setText("juice and bread");
            textView11.setText("토마토주스: 200g, 35kcal\n\n모닝빵: 150g, 470kcal\n");
            textView12.setText("505 Kcal");
        }
        else{
            textView10.setText("spam and fried egg");
            textView11.setText("쌀밥: 240g, 240kcal\n\n스팸: 50g, 50kcal\n\n계란후라이: 250g, 250kcal\n");
            textView12.setText("540 Kcal");
        }
    }
}