package com.example.jacksonhoang.citygoer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class factsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
    }

    public void mainSelection(View view) {
        Intent startmain = new Intent(this, MainActivity.class);
        startActivity(startmain);
    }
}
