package com.example.melodyhacker.tutor.Font;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class CTextView extends android.support.v7.widget.AppCompatTextView {
    int mystyle;

    public CTextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public CTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public CTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface NormalFont = FontCache.getTypeface("font/Italic.ttf", context);
        setTypeface(NormalFont);
    }

}