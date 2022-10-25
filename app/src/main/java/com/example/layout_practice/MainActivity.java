package com.example.layout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    public void change(View view) throws InterruptedException {
        ImageView soap = (ImageView) findViewById(R.id.soap);
        ImageView price = (ImageView) findViewById(R.id.price);
        soap.animate().translationYBy(1000f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}