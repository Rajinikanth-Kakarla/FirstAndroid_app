package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // private final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: log_cat comment
        // System.out.println("Hello; World!");
        // for (int i=10;i<15;i++){
            // System.out.println(i);
            // Log.v(LOG_TAG,""+i);
        // }
        // String str = "Rajinikanth";
        // Log.v(LOG_TAG,"Hello"+str);
    }
}