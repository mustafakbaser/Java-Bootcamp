package com.mustafabaser.javabootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this = bulunduğumuz sınıf.
        // super = superclass (üst sınıf).
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}