package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpesifikasiBeatStreet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_beat_street);
    }

    public void Button19(View view) {
        Intent i = new Intent(SpesifikasiBeatStreet.this, Motor.class);
        startActivity(i);
    }
}
