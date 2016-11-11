package com.shahabyari.arpaneteniac.tamrinjalase5;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 11/11/2016.
 */

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        FloatingActionButton fabB=(FloatingActionButton) findViewById(R.id.fbB);
        fabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this,MainActivity.class));
            }
        });
        FloatingActionButton FabF=(FloatingActionButton) findViewById(R.id.fbF);
        FabF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(Activity2.this,activity3.class));
            }
        });


    }
}