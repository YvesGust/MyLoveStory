package com.example.yvesgust.mylovestory;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import java.util.Timer;

public class Launcher extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);

        TextView gametilte=(TextView)findViewById(R.id.game_title);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"SnellRoundhand.ttf");
        gametilte.setTypeface(typeface);

        startFlick(findViewById(R.id.startgame_lable));

    }






    private void startFlick( View view ){

        if( null == view ){

            return;

        }

        Animation alphaAnimation = new AlphaAnimation( 1, 0 );

        alphaAnimation.setDuration( 300 );

        alphaAnimation.setInterpolator( new LinearInterpolator( ) );

        alphaAnimation.setRepeatCount( Animation.INFINITE );

        alphaAnimation.setRepeatMode( Animation.REVERSE );

        view.startAnimation( alphaAnimation );

    }

    public void touch(View view){
        Intent intent = new Intent(Launcher.this, MainActivity.class);
        startActivity(intent);
        finish();
    }





}

