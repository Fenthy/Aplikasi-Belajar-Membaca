package com.app.belajar_membaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.abc);
        Button btn2=(Button)findViewById(R.id.mengeja);
        Button btn3=(Button)findViewById(R.id.kalimat);
        Button btn4=(Button)findViewById(R.id.kuis);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent i =new Intent(getApplicationContext(),Abc.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent i =new Intent(getApplicationContext(),Mengeja.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent i =new Intent(getApplicationContext(),Kalimat.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent i =new Intent(getApplicationContext(),Kuis.class);
                startActivity(i);
            }
        });
    }
}
