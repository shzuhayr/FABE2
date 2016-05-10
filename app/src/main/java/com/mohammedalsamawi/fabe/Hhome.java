package com.mohammedalsamawi.fabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhome);

    }

    public void Lecturerspage(View view) {

        ImageView lectButton = (ImageView) findViewById(R.id.lecturersid);
        Intent intLect = new Intent(Hhome.this, lecturerspage.class);
        startActivity(intLect);
    }

    public void Timetablepage(View view) {
      //  ImageView lectButton = (ImageView) findViewById(R.id.timetableid);
        Intent timeIntent = new Intent(Hhome.this, Timetable.class);
        startActivity(timeIntent);
    }

    public void Contactpage(View view) {
        ImageView lectButton = (ImageView) findViewById(R.id.Contactsid);
        Intent ConIntent = new Intent(Hhome.this, Contact_us.class);
        startActivity(ConIntent);
    }
    public void Gallerypage(View view) {
        ImageView gallaryButton = (ImageView) findViewById(R.id.gallaryid);
        Intent gallIntent = new Intent(Hhome.this, gallary.class);
        startActivity(gallIntent);
    }
    public void Aboutpage(View view){
        ImageView Aboutbut = (ImageView)findViewById(R.id.aboutbutton);
        Intent aboutint = new Intent(Hhome.this, About.class);
        startActivity(aboutint);

    }
}

