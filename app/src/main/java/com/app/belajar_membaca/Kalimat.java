package com.app.belajar_membaca;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Kalimat extends AppCompatActivity {

    MediaPlayer mp;
    Button mbtnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalimat);
        mbtnmenu =(Button)findViewById(R.id.btnmenu1);
        mbtnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalimat.this, MainActivity.class);
                startActivity(i);
                mp.stop();
            }
        });
    }

    public void playnamasaya(View view){
        mp = MediaPlayer.create( this, R.raw.namasaya);
        mp.start();
    }

    public void playmaumakan(View view){
        mp = MediaPlayer.create( this, R.raw.raramau);
        mp.start();
    }

    public void playdiamarah(View view){
        mp = MediaPlayer.create( this, R.raw.diamarah);
        mp.start();
    }

    public void playlagimain(View view){
        mp = MediaPlayer.create( this, R.raw.akulagi);
        mp.start();
    }

    public void playminumjus(View view){
        mp = MediaPlayer.create( this, R.raw.sayaminum);
        mp.start();
    }

    public void playmakannasi(View view){
        mp = MediaPlayer.create( this, R.raw.raramakan);
        mp.start();
    }

    public void playgitaritu(View view){
        mp = MediaPlayer.create( this, R.raw.gitaritu);
        mp.start();
    }

    public void playsayursawi(View view){
        mp = MediaPlayer.create( this, R.raw.sayursawi);
        mp.start();
    }

    public void playadikmarah(View view){
        mp = MediaPlayer.create( this, R.raw.adikmarah);
        mp.start();
    }

    public void playsayuritu(View view){
        mp = MediaPlayer.create( this, R.raw.sayuritu);
        mp.start();
    }
}
