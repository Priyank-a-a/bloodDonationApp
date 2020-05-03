package com.example.donateblood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3,e4,e5;
    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b1=findViewById(R.id.myButton1);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        e3=findViewById(R.id.edit3);
        e4=findViewById(R.id.edit5);
        e5=findViewById(R.id.edit6);
        sp1=findViewById(R.id.spinner1);
    }
    public void bClick(View view)
    {
        Intent i = new Intent(view.getContext(), MainActivity.class);
        startActivity(i);
    }
    public void bClick2(View v)
    {
        if(e1.getText().length()==0)
        {
            e1.setError("Field cannot be left blank.");
        }
        else if(e2.getText().length()==0)
        {
            e2.setError("Field cannot be left blank.");
        }
        else if(e2.getText().length()!=2 )
        {
            e2.setError("Enter a valid age");
        }
        else if(e3.getText().length()==0)
        {
            e3.setError("Field cannot be left blank.");
        }
        else if(e5.getText().length()==0)
        {
            e5.setError("Field cannot be left blank.");
        }
        else if(e4.getText().length()==0)
        {
            e4.setError("Field cannot be left blank.");
        }
        else if(e5.getText().length()!=10)
        {
            e5.setError("Enter a valid 10 digit phone number");
        }
        else
            {
            Toast.makeText(this,"successfully saved",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(v.getContext(), Activity3.class);
            startActivity(i);


        }


    }
}
