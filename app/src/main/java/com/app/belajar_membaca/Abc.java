package com.app.belajar_membaca;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Abc extends AppCompatActivity {

    MediaPlayer mp;
    Button mbtnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);
        mbtnmenu =(Button)findViewById(R.id.btnmenu3);
        mbtnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Abc.this, MainActivity.class);
                startActivity(i);
                mp.stop();
            }
        });
    }

    public void playa(View view){
        mp = MediaPlayer.create( this, R.raw.a);
        mp.start();
    }

    public void playb(View view){
        mp = MediaPlayer.create( this, R.raw.b);
        mp.start();
    }

    public void playc(View view){
        mp = MediaPlayer.create( this, R.raw.c);
        mp.start();
    }

    public void playd(View view){
        mp = MediaPlayer.create( this, R.raw.d);
        mp.start();
    }

    public void playe(View view){
        mp = MediaPlayer.create( this, R.raw.e);
        mp.start();
    }

    public void playf(View view){
        mp = MediaPlayer.create( this, R.raw.f);
        mp.start();
    }

    public void playg(View view){
        mp = MediaPlayer.create( this, R.raw.g);
        mp.start();
    }

    public void playh(View view){
        mp = MediaPlayer.create( this, R.raw.h);
        mp.start();
    }

    public void playi(View view){
        mp = MediaPlayer.create( this, R.raw.i);
        mp.start();
    }

    public void playj(View view){
        mp = MediaPlayer.create( this, R.raw.j);
        mp.start();
    }
    public void playk(View view){
        mp = MediaPlayer.create( this, R.raw.k);
        mp.start();
    }

    public void playl(View view){
        mp = MediaPlayer.create( this, R.raw.l);
        mp.start();
    }

    public void playm(View view){
        mp = MediaPlayer.create( this, R.raw.m);
        mp.start();
    }

    public void playn(View view){
        mp = MediaPlayer.create( this, R.raw.n);
        mp.start();
    }

    public void playo(View view){
        mp = MediaPlayer.create( this, R.raw.o);
        mp.start();
    }

    public void playp(View view){
        mp = MediaPlayer.create( this, R.raw.p);
        mp.start();
    }

    public void playq(View view){
        mp = MediaPlayer.create( this, R.raw.q);
        mp.start();
    }

    public void playr(View view){
        mp = MediaPlayer.create( this, R.raw.r);
        mp.start();
    }

    public void plays(View view){
        mp = MediaPlayer.create( this, R.raw.s);
        mp.start();
    }

    public void playt(View view){
        mp = MediaPlayer.create( this, R.raw.t);
        mp.start();
    }
    public void playu(View view){
        mp = MediaPlayer.create( this, R.raw.u);
        mp.start();
    }

    public void playv(View view){
        mp = MediaPlayer.create( this, R.raw.v);
        mp.start();
    }

    public void playw(View view){
        mp = MediaPlayer.create( this, R.raw.w);
        mp.start();
    }

    public void playx(View view){
        mp = MediaPlayer.create( this, R.raw.x);
        mp.start();
    }

    public void playy(View view){
        mp = MediaPlayer.create( this, R.raw.y);
        mp.start();
    }

    public void playz(View view){
        mp = MediaPlayer.create( this, R.raw.z);
        mp.start();
    }
}
