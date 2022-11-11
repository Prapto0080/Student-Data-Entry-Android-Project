package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class view_Info extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4 ,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);
        textView1 =findViewById(R.id.textView1);
        textView2 =findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 =findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        Intent myIntent2 = getIntent();
        String name = myIntent2.getStringExtra(Student_info.extra);
        String gender = myIntent2.getStringExtra(Student_info.extra1);
        String id = myIntent2.getStringExtra(Student_info.extra2);
        String sec = myIntent2.getStringExtra(Student_info.extra3);
        String email = myIntent2.getStringExtra(Student_info.extra4);
        textView1.setText("Name : "+ name);
        textView2.setText("Id : "+id);
        textView3.setText("Gender : "+gender);
        textView4.setText("Section : "+sec);
        textView5.setText("Email: "+email);


    }
}