package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mobil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);
    }
    public void Button3(View view){
        Intent i = new Intent(Mobil.this, SpesifikasiVios.class);
        startActivity(i);

    }

    public void Button4(View view) {
        Intent i = new Intent(Mobil.this, spesifikasi_jazz.class);
        startActivity(i);
    }

    public void Button10(View view) {
        Intent i = new Intent(Mobil.this, SpesifikasiMobilio.class);
        startActivity(i);
    }
}
