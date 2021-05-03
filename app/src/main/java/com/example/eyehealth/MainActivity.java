package com.example.eyehealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);

        textView1.setVisibility(View.VISIBLE);
        CountDownTimer timer= new CountDownTimer(70000,1000) {

            @Override
            public void onTick(long l) {
                int time=(int)(l/1000);
                switch (time) {
                    case 60:
                        textView1.setVisibility(View.INVISIBLE);
                        textView2.setVisibility(View.VISIBLE);
                        break;
                    case 50:
                        textView2.setVisibility(View.INVISIBLE);
                        textView3.setVisibility(View.VISIBLE);
                        break;
                    case 40:
                        textView3.setVisibility(View.INVISIBLE);
                        textView4.setVisibility(View.VISIBLE);
                        break;
                    case 30:
                        textView4.setVisibility(View.INVISIBLE);
                        textView5.setVisibility(View.VISIBLE);
                        break;
                    case 20:
                        textView5.setVisibility(View.INVISIBLE);
                        textView6.setVisibility(View.VISIBLE);
                        break;
                    case 10:
                        textView6.setVisibility(View.INVISIBLE);
                        textView7.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        textView7.setVisibility(View.INVISIBLE);
                        Intent intent = new Intent(MainActivity.this,Ball.class);
                        startActivity(intent);
                        break;
               }



            }

            @Override
            public void onFinish(
            ) {

            }
        };timer.start();


    }
}