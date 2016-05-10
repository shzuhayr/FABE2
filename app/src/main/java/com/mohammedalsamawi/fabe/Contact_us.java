package com.mohammedalsamawi.fabe;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;


public class Contact_us extends AppCompatActivity {




    TextView call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        call = (TextView) findViewById(R.id.Callid);

        call.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                Intent callint = new Intent(Intent.ACTION_CALL);

                callint.setData(Uri.parse("tel:01128804709"));

                startActivity(callint);
            }

        });

    }

    public void onClickSend(View view) {

        Intent sendInt = new Intent(this, sendingemail.class);
        startActivity(sendInt);
    }
}


