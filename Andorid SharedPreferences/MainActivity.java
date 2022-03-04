package com.example.androidsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Et_save;
    String share = "file"; //앱 빌드를 진행하게됬을때, xml의 확장자로 file 이라는 이름으로 명명된 임시데이터가 폰 내부데이터로 저장

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et_save = findViewById(R.id.Et_save); //연결

        SharedPreferences sharedPreferences = getSharedPreferences(share, 0); //파일 액세스 권한
        String value = sharedPreferences.getString("ji", "");
        Et_save.setText(value);


    }

    @Override // 종료되었을때 실행되는 구문
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(share, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit(); //sharedPreferences변수 에디터 연결
        String value = Et_save.getText().toString();
        editor.putString("ji",value);// ji로 별명된 value로 저장
        editor.commit(); //저장 해라

    }
}
//SharedPreferences: 간단하게 임시 데이터 저장 및 불러오기 (자바)
//*스위치로 앱 설정화면에서 활용하기 좋음, 앱 삭제시 데이터 날라가는 단점.