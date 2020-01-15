package com.app.belajar_membaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class Mengeja extends AppCompatActivity {

    MediaPlayer mp;
    Button mbtnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mengeja);
        mbtnmenu =(Button)findViewById(R.id.btnmenu2);
        mbtnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Mengeja.this, MainActivity.class);
                startActivity(i);
                mp.stop();
            }
        });
    }

    public void playsaya(View view){
        mp = MediaPlayer.create( this, R.raw.saya);
        mp.start();
    }

    public void playrara(View view){
        mp = MediaPlayer.create( this, R.raw.rara);
        mp.start();
    }

    public void playyang(View view){
        mp = MediaPlayer.create( this, R.raw.yang);
        mp.start();
    }

    public void playlama(View view){
        mp = MediaPlayer.create( this, R.raw.lama);
        mp.start();
    }

    public void playmakan(View view){
        mp = MediaPlayer.create( this, R.raw.makan);
        mp.start();
    }

    public void playminum(View view){
        mp = MediaPlayer.create( this, R.raw.minum);
        mp.start();
    }

    public void playgitar(View view){
        mp = MediaPlayer.create( this, R.raw.gitar);
        mp.start();
    }

    public void playmusik(View view){
        mp = MediaPlayer.create( this, R.raw.musik);
        mp.start();
    }

    public void playaku(View view){
        mp = MediaPlayer.create( this, R.raw.aku);
        mp.start();
    }

    public void playdia(View view){
        mp = MediaPlayer.create( this, R.raw.dia);
        mp.start();
    }
}