package com.mohammedalsamawi.fabe;
// last project
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Home (View view){


        ImageButton buhome = (ImageButton)findViewById(R.id.button);

        Intent inthome = new Intent(MainActivity.this,Hhome.class);

        startActivity(inthome);

    }
}
