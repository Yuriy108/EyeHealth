package com.example.eyehealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Ball extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);
        imageView=findViewById(R.id.imageView);

        Animation animation1 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation1);
        Animation animation2 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation2);
        Animation animation3 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation3);
        Animation animation4 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation4);
        Animation animation5 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation5);
        Animation animation6 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation6);
        Animation animation7 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation7);
        Animation animation8 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation8);
        Animation animation9 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation9);
        Animation animation10 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation10);
        Animation animation11 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation11);
        Animation animation12 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation12);
        Animation animation13 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation13);
        Animation animation14 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation14);
        Animation animation15 = AnimationUtils.loadAnimation(Ball.this, R.anim.common_animation15);



        CountDownTimer timer= new CountDownTimer(121000,1000) {

            @Override
            public void onTick(long l) {
                int time=(int)(l/1000);
                switch (time) {
                    case 120:
                        imageView.startAnimation(animation1);
                        break;
                    case 118:
                        imageView.startAnimation(animation2);
                        break;
                    case 116:
                        imageView.startAnimation(animation3);
                        break;
                    case 114:
                        imageView.startAnimation(animation4);
                        break;
                    case 112:
                        imageView.startAnimation(animation5);
                        break;
                    case 110:
                        imageView.startAnimation(animation6);
                        break;
                    case 108:
                        imageView.startAnimation(animation7);
                        break;
                    case 106:
                        imageView.startAnimation(animation8);
                        break;
                    case 104:
                        imageView.startAnimation(animation9);
                        break;
                    case 102:
                        imageView.startAnimation(animation10);
                        break;
                    case 100:
                        imageView.startAnimation(animation11);
                        break;
                    case 98:
                        imageView.startAnimation(animation12);
                        break;
                    case 96:
                        imageView.startAnimation(animation13);
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