package com.example.donateblood;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;


public class EditTextCustom extends AppCompatEditText
{
    private String sethint;
    private boolean setcolor;
    Drawable darkButton, lightButton;

    public EditTextCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tarry1 = context.obtainStyledAttributes(attrs,R.styleable.editTextCustom);
        try {
            sethint = tarry1.getString(R.styleable.editTextCustom_setHint);
            if(sethint == null)
            {
                setHint("enter");
            }
            else
            {
                setHint("enter here");
            }
            setcolor = tarry1.getBoolean(R.styleable.editTextCustom_setColor1,false);
            if(setcolor == true)
            {
                setTextColor(Color.BLUE);
            } }
        finally {
            tarry1.recycle();
            init();
        }
    }
    void init()
    {
        darkButton = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_clear_black_24dp,null);
        lightButton = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_clear_black_22dp,null);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                showButton();
                show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    void show()
    {
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                boolean isClicked = false;
                float clearButtonStart = getWidth() - getPaddingEnd() - darkButton.getIntrinsicWidth();
                if(motionEvent.getX()>clearButtonStart)
                {
                    isClicked = true;

                    if(isClicked)
                    {
                        switch (motionEvent.getAction())
                        {
                            case MotionEvent.ACTION_DOWN: getText().clear();
                                break;
                            case  MotionEvent.ACTION_UP: hideButton();
                                break;
                        }
                    }

                }return  true;}
        });
    }
    public  void showButton()
    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,darkButton,null);
    }
    public void hideButton()
    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,lightButton,null);
    }}
