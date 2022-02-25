package com.example.androidedittextbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Et_text;
    Button Btn_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et_text = findViewById(R.id.Et_Text); //연결
        Btn_text = findViewById(R.id.Btn_text);

        Btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Et_text.setText("안드로이드");
            }
        });

    }
}