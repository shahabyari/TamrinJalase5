package com.shahabyari.arpaneteniac.tamrinjalase5;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 11/11/2016.
 */

public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        Typeface dn = Typeface.createFromAsset(getAssets(),"fonts/fontawesome-webfont.ttf");
        TextView tv = (TextView) findViewById(R.id.toolbar);
        tv.setTypeface(dn);


    }
}
