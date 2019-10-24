package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class spesifikasi_jazz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_jazz);
    }

    public void Button7(View view) {
        Intent i = new Intent(spesifikasi_jazz.this, Mobil.class);
        startActivity(i);
    }
}
