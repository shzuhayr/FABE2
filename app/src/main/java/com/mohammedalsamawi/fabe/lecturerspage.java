package com.mohammedalsamawi.fabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class lecturerspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturerspage);
    }


    public void lectpick (View view) {
        ImageButton img = (ImageButton) findViewById(R.id.aiadpic2);
        if (view.getId() == R.id.aiadradio) {
            img.setImageResource(R.drawable.apic);
        } else if (view.getId() == R.id.hamedradio) {
            img.setImageResource(R.drawable.hpic);
        } else if (view.getId() == R.id.qahtanradio) {
            img.setImageResource(R.drawable.qpic);
        } else if (view.getId() == R.id.rezaradio) {
            img.setImageResource(R.drawable.rpic);
        } else if (view.getId() == R.id.sarahradio) {
            img.setImageResource(R.drawable.spic);
        }

    }

    public void lectPage(View view) {

        Intent myintent = new Intent(this, lecturer_info.class);

        RadioGroup group = (RadioGroup) findViewById(R.id.lectradgp);
        int id = group.getCheckedRadioButtonId();
        myintent.putExtra("LectId", id);
        startActivity(myintent);
    }}
