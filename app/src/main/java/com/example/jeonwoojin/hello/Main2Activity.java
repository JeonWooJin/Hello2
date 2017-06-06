package com.example.jeonwoojin.hello;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onButton1Clicked(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(i);
    }

    public void onButton2Clicked(View v){

    }
    public void onButton3Clicked(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"));
        startActivity(i);
    }

    public void onButton4Clicked(View v){
        Intent myIntent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(myIntent);
    }
}
