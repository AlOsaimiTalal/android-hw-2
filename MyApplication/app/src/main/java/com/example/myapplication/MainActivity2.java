package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView mName = findViewById(R.id.textView4);
        TextView mAge = findViewById(R.id.jdvn);
        TextView mJob = findViewById(R.id.textView);
        TextView mNum = findViewById(R.id.textView3);
        TextView mEmail = findViewById(R.id.textView6);

        Bundle des = getIntent().getExtras();

        String NameF = des.getString("simple");
        String AgeF = des.getString("simple1");
        String JobF = des.getString("simple2");
        String NumF = des.getString("simple3");
        String EmailF = des.getString("simple4");

        mName.setText(NameF);
        mAge.setText(AgeF);
        mJob.setText(JobF);
        mNum.setText(NumF);
        mEmail.setText(EmailF);





        }
        }
