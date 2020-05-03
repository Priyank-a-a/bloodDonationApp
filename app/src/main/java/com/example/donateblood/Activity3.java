package com.example.donateblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void bClick3(View view){
        Intent i = new Intent(view.getContext(), Activity4.class);
        startActivity(i);
    }
    public void bClick4(View view){
        Intent i = new Intent(view.getContext(), Activity5.class);
        startActivity(i);
    }}
