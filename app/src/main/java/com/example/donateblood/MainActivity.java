package com.example.donateblood;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.donateblood.R;
public class MainActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //name1=findViewById(R.id.name);
        b= findViewById(R.id.button1);
        //phn= findViewById(R.id.phn);
        //simpleList=findViewById(R.id.listview);



    }
    public void clickme(View view)
    {
        Intent i=new Intent(this,Activity2.class);
        startActivity(i);
    }
    public void clickme1(View view)
    {
        Intent i=new Intent(this,Activity2.class);
        startActivity(i);
    }
    public void clickme2(View view)
    {
        Intent i=new Intent(this,Activity6.class);
        startActivity(i);
    }

}


