package com.app.belajar_membaca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Kuis extends AppCompatActivity {
    TextView mvtSkor, mvtSoal;
    RadioGroup mrgpilihanjawaban;
    RadioButton mrbpilihanjawaban1, mrbpilihanjawaban2, mrbpilihanjawaban3, mrbpilihanjawaban4;
    Button mbtnsubmit;
    int skor=0;
    int arr;
    int x;
    String jawaban;

    SoalPilihanGanda soalPG = new SoalPilihanGanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kuis);


        mvtSkor = (TextView) findViewById(R.id.tvskor);
        mvtSoal = (TextView) findViewById(R.id.tvsoal);
        mrgpilihanjawaban = (RadioGroup) findViewById(R.id.rgpilihanjawaban);
        mrbpilihanjawaban1 = (RadioButton) findViewById(R.id.rbpilihanjawaban1);
        mrbpilihanjawaban2 = (RadioButton) findViewById(R.id.rbpilihanjawaban2);
        mrbpilihanjawaban3 = (RadioButton) findViewById(R.id.rbpilihanjawaban3);
        mrbpilihanjawaban4 = (RadioButton) findViewById(R.id.rbpilihanjawaban4);
        mbtnsubmit = (Button)findViewById(R.id.btnsubmit);

        mvtSkor.setText(""+skor);
        setKonten();

        mbtnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban();
            }
        });
    }

    private void setKonten(){
        mrgpilihanjawaban.clearCheck();
        arr = soalPG.pertanyaan.length;
        if(x >= arr){
            String jumlahskor = String.valueOf(skor);
            Intent i = new Intent( Kuis.this, HasilSkoring.class);

            i.putExtra( "skorakhir", jumlahskor);
            i.putExtra( "activity", "pilihanganda");
            startActivity(i);

        } else {
            mvtSoal.setText(soalPG.getPertanyaan(x));
            mrbpilihanjawaban1.setText(soalPG.getpilihanjawaban1(x));
            mrbpilihanjawaban2.setText(soalPG.getpilihanjawaban2(x));
            mrbpilihanjawaban3.setText(soalPG.getpilihanjawaban3(x));
            mrbpilihanjawaban4.setText(soalPG.getpilihanjawaban4(x));
            jawaban = soalPG.getjawabanbenar(x);
        }

        x++;
    }

    public void cekJawaban() {
        if (mrbpilihanjawaban1.isChecked()) {
            if (mrbpilihanjawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbpilihanjawaban2.isChecked()) {
            if (mrbpilihanjawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbpilihanjawaban3.isChecked()) {
            if (mrbpilihanjawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }

        } else if (mrbpilihanjawaban4.isChecked()) {
            if (mrbpilihanjawaban4.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else {
            Toast.makeText(this, "Silahkan Pilih Jawaban Dulu", Toast.LENGTH_SHORT).show();
        }
    }
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan Kuis", Toast.LENGTH_SHORT).show();
    }
}