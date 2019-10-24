package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpesifikasiMobilio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_mobilio);
    }

    public void Button5(View view) {
        Intent i = new Intent(SpesifikasiMobilio.this, Mobil.class);
        startActivity(i);
    }
}
