package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void studentinfofunction(View view) {
        Intent myintent = new Intent(this,Student_info.class);
        startActivity(myintent);
    }

    public void fragmentfunction(View view) {
        Intent myintent = new Intent(this,FragmentActivity.class);
        startActivity(myintent);
    }
}