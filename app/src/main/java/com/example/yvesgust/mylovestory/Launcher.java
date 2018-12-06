package com.example.yvesgust.mylovestory;


import android.content.Intent;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import com.example.yvesgust.mylovestory.Data.Record;


public class Launcher extends AppCompatActivity {
    Record record=new Record();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);

        TextView gametilte=(TextView)findViewById(R.id.game_title);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"SnellRoundhand.ttf");
        gametilte.setTypeface(typeface);

        startFlick(findViewById(R.id.startgame_lable));


        record.Record();



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

        if(record.getNumber("isGender")==1){
        Intent intent = new Intent(Launcher.this, MainActivity.class);
        startActivity(intent);
        finish();}
        else {
            Intent intent = new Intent(Launcher.this, Gender.class);
            startActivity(intent);
            finish();}
    }


}

