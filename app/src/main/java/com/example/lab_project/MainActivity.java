package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.UName);
        editText2 = findViewById(R.id.passW);
    }

    public void log_in(View view) {
        String u=editText1.getText().toString();
        String p=editText2.getText().toString();
        if (u.equals("sefat") && p.equals("152989")){
            Intent myintent = new Intent(this,HomePage.class);
            startActivity(myintent);
        }else {
            Toast.makeText(this, "Wrong password or username", Toast.LENGTH_SHORT).show();
        }

    }
}