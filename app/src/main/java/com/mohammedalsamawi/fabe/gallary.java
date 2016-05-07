package com.mohammedalsamawi.fabe;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class gallary extends AppCompatActivity {

    ViewPager viewpager;
    swipe adpter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallary);

        viewpager = (ViewPager) findViewById(R.id.gallary_id);
        adpter = new swipe(this);
        viewpager.setAdapter(adpter);
    }
}
