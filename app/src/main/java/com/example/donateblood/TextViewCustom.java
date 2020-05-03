package com.example.donateblood;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class TextViewCustom extends AppCompatTextView {
    private String title;
    private boolean color;
    public TextViewCustom(Context context) {
        super(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tarry = context.obtainStyledAttributes(attrs,R.styleable.textViewCustom);
        try {
            title = tarry.getString(R.styleable.textViewCustom_setTitle);
            if(title==null)
                setText("custom email");
            else
                setText("Email");
            color = tarry.getBoolean(R.styleable.textViewCustom_setColor,false);
            setTextColor(Color.BLUE);
        }finally {
            tarry.recycle();
        }
    }

    public TextViewCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
