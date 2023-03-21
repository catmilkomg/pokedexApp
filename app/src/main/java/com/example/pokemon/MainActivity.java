package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.poekemon.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}