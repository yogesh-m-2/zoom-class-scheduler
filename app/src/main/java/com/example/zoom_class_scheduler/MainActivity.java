package com.example.zoom_class_scheduler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
public void browser1(View view) {
    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://olympus1.greatlearning.in/online_session/join_meeting?access_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwcm9ncmFtX2dyb3VwX2lkIjoyNDk1LCJsbXNfdXNlcl9pZCI6Ijc4NTYwMCIsIm1lbnRvcmVkX3Nlc3Npb25faWQiOjE2NjQ5MiwiZXhwIjoxNjAwMDY1MDAwfQ.T4j1NR3Jxsx9MT4Z4Lp_e0PPmH4MvZBQERENIna1JHk"));
    startActivity(browserIntent);
}

}