package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Student_info extends AppCompatActivity {
    public static final String extra="thing",extra2="g",extra1="hing",extra3="s",extra4="sasas";
    EditText editText1,editText2,editText3;
    RadioGroup radioGroup;
    RadioButton gender;
    Spinner spinner;
    String[] section;
    TextView textView;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        editText1 = findViewById(R.id.Fname);
        editText2 = findViewById(R.id.Sid);
        editText3= findViewById(R.id.Email);
        radioGroup =findViewById(R.id.rGroup);
        spinner=findViewById(R.id.spn);
        section= getResources().getStringArray(R.array.section);
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(this,R.layout.simplelayout,R.id.sampleLay,section);
        spinner.setAdapter(adapter);
    }

    public void insertMul(View view) {
        int a= radioGroup.getCheckedRadioButtonId();
        gender=findViewById(a);
        String genders =gender.getText().toString();
        String id =editText2.getText().toString();
        String name = editText1.getText().toString();
        String email = editText3.getText().toString();
        String sec =spinner.getSelectedItem().toString();
        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        String key = myRef.push().getKey();
        FirebaseData mlFire = new FirebaseData(name,id,genders,email,sec);
        myRef.child(key).setValue(mlFire);
        Toast.makeText(this, "DATA INSERTED", Toast.LENGTH_SHORT).show();


    }

    public void View_Info(View view) {
        int a= radioGroup.getCheckedRadioButtonId();
        gender=findViewById(a);
        String genders =gender.getText().toString();
        String id =editText2.getText().toString();
        String name = editText1.getText().toString();
        String email = editText3.getText().toString();
        String sec =spinner.getSelectedItem().toString();
        Intent myIntent1 = new Intent(this,view_Info.class);
        myIntent1.putExtra(extra,name);
        myIntent1.putExtra(extra1,genders);
        myIntent1.putExtra(extra2,id);
        myIntent1.putExtra(extra3,sec);
        myIntent1.putExtra(extra4,email);
        startActivity(myIntent1);

    }
}