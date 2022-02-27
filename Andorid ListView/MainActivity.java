package com.example.androidlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView List_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List_test = findViewById(R.id.List_text); //연결

        List<String> data = new ArrayList<>();

        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        List_test.setAdapter(adapter); //어뎁터랑 리스트뷰랑 연결댐

        data.add("안드로이드");
        data.add("앱개발");
        data.add("사과");
        adapter.notifyDataSetChanged(); //  add 저장


    }
}