package com.example.yvesgust.mylovestory.Data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AppCompatActivity;

public class Record extends AppCompatActivity {

    SharedPreferences UserInfo=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);

    SharedPreferences.Editor editor = UserInfo.edit();


    public void Record(){
        boolean isGenderExsist=UserInfo.contains("IsGender");
        boolean isWhchiPartExsist=UserInfo.contains("WhichPart");
        boolean isMoneyExsist=UserInfo.contains("Money");
        boolean isFeelingExsist=UserInfo.contains("Feeling");
        if(isGenderExsist==false){ editor.putInt("IsGender",0);}
        if(isWhchiPartExsist==false){ editor.putInt("WhichPart",0);}
        if(isMoneyExsist==false){editor.putInt("Money",50);}
        if(isFeelingExsist==false){editor.putInt("Feeling",50);}
        editor.commit();
    }
    public int getNumber(String string){
        int i=UserInfo.getInt(string,0);
        return i;
    }

}
