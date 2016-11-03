package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
added to gradle.properties:
org.gradle.daemon=true
org.gradle.parallel=true

two checks for offline work


 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testGit() {
        int s = 23 + 25;
        int ss = 124;
    }
    int something=10;

}
