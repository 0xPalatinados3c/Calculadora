package com.example.calculadoraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ApresentacaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        ImageView imgFechar = findViewById(R.id.imgFechar);
        imgFechar.setOnClickListener(v -> finish());
    }
}
