package com.example.yvesgust.mylovestory;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Gender extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender);
        }
    public void chosen(View view){
        Intent intent = new Intent(Gender.this, MainActivity.class);
        startActivity(intent);
        finish();

    }

}
