package com.example.mission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class popup_yes extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_yes);

        button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            //popup 으로 넘어감.
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),popup.class);
                intent.putExtra("next",4);
                startActivity(intent);

            }
        });
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }

}

