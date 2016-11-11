package com.shahabyari.arpaneteniac.tamrinjalase5;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by Administrator on 11/11/2016.
 */

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/fontawesome-webfont.ttf");
        TextView tx=(TextView) findViewById(R.id.cor);
        tx.setTypeface(tf);

    }
}