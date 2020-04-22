package com.zj.typeface;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import static com.zj.typeface.CommonTextView.TypeFaceEnum.BOLD;
import static com.zj.typeface.CommonTextView.TypeFaceEnum.BOOK;
import static com.zj.typeface.CommonTextView.TypeFaceEnum.HEAVY;
import static com.zj.typeface.CommonTextView.TypeFaceEnum.LIGHT;
import static com.zj.typeface.CommonTextView.TypeFaceEnum.MEDIUM;


/**
 * create by zj on 2020/4/21
 * 设置特有字体的textview
 */
public class CommonTextView extends AppCompatTextView {
    private int typefaceStr;
    private Context context;

    public CommonTextView(Context context) {
        this(context, null);
    }

    public CommonTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CommonTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init(context, attrs, defStyleAttr);
    }

    public void init(Context context, AttributeSet attrs, int defStyleAttr) {

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CommonTextView, defStyleAttr, 0);
        if (typedArray != null)
            typefaceStr = typedArray.getInt(R.styleable.CommonTextView_typeface, MEDIUM);
        typedArray.recycle();
        setTypefaceStr();
    }

    public void setTypefaceStr() {
        Typeface typeFace;
        if (typefaceStr == BOLD) {
            typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Bold.ttf");
            setTypeface(typeFace);
        } else if (typefaceStr == MEDIUM) {
            typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Medium.ttf");
            setTypeface(typeFace);
        } else if (typefaceStr == HEAVY) {
            typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Heavy.ttf");
            setTypeface(typeFace);
        } else if (typefaceStr == LIGHT) {
            typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Light.ttf");
            setTypeface(typeFace);
        } else if (typefaceStr == BOOK) {
            typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Book.ttf");
            setTypeface(typeFace);
        } else {
        }
    }

    class TypeFaceEnum {
        static final int BOLD = 0;
        static final int MEDIUM = 1;
        static final int HEAVY = 2;
        static final int BOOK = 3;
        static final int LIGHT = 4;
        static final int NORMAL = 5;
    }

}
