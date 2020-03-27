package com.zj.typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * create by zj on 2020/3/27
 */
public class TypefaceUtils {
    public static void setBold(Context context, TextView textView) {
        if (context != null) {
            Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Bold.ttf");
            textView.setTypeface(typeFace);
        }
    }


    public static void setBook(Context context, TextView textView) {
        if (context != null) {
            Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Book.ttf");
            textView.setTypeface(typeFace);
        }
    }


    public static void setHeavy(Context context, TextView textView) {
        if (context != null) {
            Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Heavy.ttf");
            textView.setTypeface(typeFace);
        }
    }

    public static void setLight(Context context, TextView textView) {
        if (context != null) {
            Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Light.ttf");
            textView.setTypeface(typeFace);
        }
    }


    public static void setMedium(Context context, TextView textView) {
        if (context != null) {
            Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Medium.ttf");
            textView.setTypeface(typeFace);
        }
    }


}
