package com.example.abu_nadeem.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tohome(View view) {
        Intent home = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(home, null);
    }

}


