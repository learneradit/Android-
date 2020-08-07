package com.example.memecreator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.topSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This gets called by the Top Fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top,bottom);
    }
}