package com.example.showroomuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Motor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);
    }

    public void Button9(View view) {
        Intent i = new Intent(Motor.this, SpesifikasiNinja250.class);
        startActivity(i);
    }
}
