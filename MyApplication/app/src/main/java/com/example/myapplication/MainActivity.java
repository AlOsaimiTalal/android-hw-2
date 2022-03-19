package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Intent ticket = new Intent(MainActivity.this,MainActivity2.class);


        EditText Name =findViewById(R.id.YourName);
        EditText Age =findViewById(R.id.YourAge);
        EditText job =findViewById(R.id.YourJob);
        EditText Num =findViewById(R.id.YourNO);
        EditText mail =findViewById(R.id.YourEmail);


        Button fly = findViewById(R.id.transferring);
        Button reset = findViewById(R.id.resetButton);

        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().toString().isEmpty() || Age.getText().toString().isEmpty()
                        || job.getText().toString().isEmpty() || Num.getText().toString().isEmpty()
                        || mail.getText().toString().isEmpty()
                ) {
                    Toast.makeText(MainActivity.this, "Please check your info again", Toast.LENGTH_SHORT).show();

                } else {
                    String N = Name.getText().toString();
                    String A = Age.getText().toString();
                    String J = job.getText().toString();
                    String NO = Num.getText().toString();
                    String M = mail.getText().toString();
                    ticket.putExtra("simple", N);
                    ticket.putExtra("simple1", A);
                    ticket.putExtra("simple2", J);
                    ticket.putExtra("simple3", NO);
                    ticket.putExtra("simple4", M);
                }
            }




        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Name.setText(null);
                        Age.setText(null);
                        job.setText(null);
                        Num.setText(null);
                        mail.setText(null);
            }
        });




        }
}
