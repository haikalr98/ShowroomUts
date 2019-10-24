package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpesifikasiVios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_vios);
    }

    public void Button6(View view) {
        Intent i = new Intent(SpesifikasiVios.this, Mobil.class);
        startActivity(i);
    }
}
