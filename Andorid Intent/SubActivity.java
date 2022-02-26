package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub); //연결
        Intent intent = getIntent(); //날라오는 인탠트데이터값 받기
        String str = intent.getStringExtra("Str"); //문자열 형태로 받음
        tv_sub.setText(str); //str 넣기


    }
}