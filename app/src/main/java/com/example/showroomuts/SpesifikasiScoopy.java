package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpesifikasiScoopy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_scoopy);
    }

    public void Button14(View view) {
        Intent i = new Intent(SpesifikasiScoopy.this, Motor.class);
        startActivity(i);
    }
}
