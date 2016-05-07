package com.mohammedalsamawi.fabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class lecturer_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_info);

        Intent intent = getIntent();
        int id = intent.getIntExtra("LectId", R.id.aiadradio);
        String name = "";
        String qual = "";
        String sub = "";
        String contact = "";
        ImageView img = (ImageView) findViewById(R.id.imageView);
        if (id == R.id.aiadradio) {
            name = " Dr. Yahya Muneeb Ahmed";
            qual = " PhD";
            sub = " Civil Eng. Materials";
            contact = " dr.Yahya@limkokwing.edu.my";
            img.setImageResource(R.drawable.apic);
        } else if (id == R.id.hamedradio) {
            name = " Dr. Hamed";
            qual = " PhD";
            sub = " Civil Eng. Materials";
            contact = " hamed@limkokwing.edu.my";
            img.setImageResource(R.drawable.hpic);
        } else if (id == R.id.qahtanradio) {
            name = " Mr. Qahtan Adnan Hasan";
            qual = " Master";
            sub = " Structural Analysis 1";
            contact = " Qahtan.Hasan@limkokwing.edu.my";
            img.setImageResource(R.drawable.qpic);
        } else if (id == R.id.rezaradio) {
            name = " Dr. Reza Afsharinafar";
            qual = " Master";
            sub = " Eng.Math II";
            contact = " Reza.Afsharinafar@limkokwing.edu.my";
            img.setImageResource(R.drawable.rpic);
        } else if (id == R.id.sarahradio) {
            name = " Ms. Sara";
            qual = " Master";
            sub = " Malay language ";
            contact = " nur.sarah@limkokwing.edu.my";
            img.setImageResource(R.drawable.spic);
        }
        TextView nama = (TextView) findViewById(R.id.nama);
        nama.setText(name);

        TextView qualif = (TextView) findViewById(R.id.qual);
        qualif.setText(qual);

        TextView subject = (TextView) findViewById(R.id.subject);
        subject.setText(sub);

        TextView email = (TextView) findViewById(R.id.email);
        email.setText(contact);


    }
}