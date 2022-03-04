package com.example.androidcustomnavigationmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.darwer_layout); //연결
        drawView = findViewById(R.id.drawer);

        Button btn_open = findViewById(R.id.Btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawView);

            }
        });

        Button btn_close = findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawers();
            }
        });




        drawerLayout.setDrawerListener(listner);
        drawView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }


    DrawerLayout.DrawerListener listner = new DrawerLayout.DrawerListener() { //슬라이드 했을떄 상태값을 받아옴
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
        //슬라이드 호출
        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
        //슬라이드를 열였을떄
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
        //슬라이드 메뉴가 닫혔을때
        }

        @Override
        public void onDrawerStateChanged(int newState) {
        //슬라이드 상황이 바꼈을떄
        }
    };

}