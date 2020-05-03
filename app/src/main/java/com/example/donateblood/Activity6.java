package com.example.donateblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity6 extends AppCompatActivity {
Button b;
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        b = findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database md = new database(getApplicationContext());
                md.insertValues(et1.getText().toString(), et2.getText().toString());
                finish();
                Intent i = new Intent(Activity6.this, Activity7.class);
                startActivity(i);
            }
        });
    }}
