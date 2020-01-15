package com.app.belajar_membaca;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;

public class HasilSkoring extends Activity {
    TextView mtvHasilAkhir;
    Button mbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_skoring);

        mtvHasilAkhir = (TextView)findViewById(R.id.tvskorakhir);
        mbtnMenu =(Button)findViewById(R.id.btnmenu);

        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HasilSkoring.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void setSkor(){
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorakhir");

        if ( activity.equals("pilihanganda")) {
            mtvHasilAkhir.setText("SKOR : "+skorPilGan);
        }
    }
    public void onBackPressed(){
        Toast.makeText(this, "Tidak Bisa Kembali, Silahkan Tekan Menu",Toast.LENGTH_SHORT).show();
    }
}
