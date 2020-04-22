package com.zj.typeface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        TypefaceUtils.setBold(this, tv2, "TypefaceUtils");
        TypefaceUtils.setBook(this, tv3, "TypefaceUtils");
        TypefaceUtils.setHeavy(this, tv4, "TypefaceUtils");
        TypefaceUtils.setLight(this, tv5, "TypefaceUtils");
        TypefaceUtils.setMedium(this, tv6, "TypefaceUtils");

    }

    public void init() {
        tv1 = findViewById(R.id.tv_type1);
        tv2 = findViewById(R.id.tv_type2);
        tv3 = findViewById(R.id.tv_type3);
        tv4 = findViewById(R.id.tv_type4);
        tv5 = findViewById(R.id.tv_type5);
        tv6 = findViewById(R.id.tv_type6);
    }
}
