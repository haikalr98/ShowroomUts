package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpesifikasiNinja250 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_ninja250);
    }

    public void Button13(View view) {
        Intent i = new Intent(SpesifikasiNinja250.this, Motor.class);
        startActivity(i);
    }
}
