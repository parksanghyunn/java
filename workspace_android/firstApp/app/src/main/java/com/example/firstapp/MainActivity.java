package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 앱에서 동작하기 위한 기본 동작을 매번 모두 정의할 수 없으므로
 * Activity 클래스(초기) 또는 AppCompatActivity 클래스(최신)를 상속받는다.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * onCreate 메소드가 실행되면서 액티비티가 생성되고 동작할 수 있게 된다.
     * 레이아웃 파일을 지정하거나 사용자에게 액티비티를 보여주기 전에
     * 실행할 코드가 있다면 이 메소드에 작성해야 한다.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * R.layout.activity_main은 /res/layout/activity_name.xml 파일을 지칭하며
         * 사용자에게 보여지는 화면이다. 이를 레이아웃 파일이라고 부르며, 버튼 또는 텍스트 등을 작성한다.
         */
        TextView nameText = findViewById(R.id.name);
        nameText.setText("텍스트 내용 변경");



    }
    public void changeText(View view){
        TextView changeText = findViewById(R.id.name);
        changeText.setText("버튼 클릭했어요");
    }
}