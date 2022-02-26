package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button Btn_move;
    private EditText Et_text;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et_text = findViewById(R.id.Et_text); //연결
        Btn_move = findViewById(R.id.Btn_move); //버튼 연결

        Btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = Et_text.getText().toString(); // text를 가져오고 toString 으로변환
                Intent intent = new Intent(MainActivity.this, SubActivity.class); // 메인에서 서브로
                intent.putExtra("Str", str);
                startActivity(intent); ///액티비티 이동.

            }
        });



    }
}