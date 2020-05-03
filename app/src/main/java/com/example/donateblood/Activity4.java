package com.example.donateblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity4 extends AppCompatActivity {
    Button s,h,v;
    ImageView i1;
    int array[] ={R.drawable.y1,R.drawable.y2,R.drawable.y3,R.drawable.y4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        i1 = findViewById(R.id.img1);
    }
    public void prev(View view)
    {
        switch (view.getId())
        {
            case R.id.myButton3: i1.setImageResource(R.drawable.y1);
            break;
        }
    }
    public void nex(View view)
    {
        switch (view.getId())
        {
            case R.id.myButton4: i1.setImageResource(R.drawable.y2);
                break;

        } }
    public void abc(View view)
    {

    }
}
