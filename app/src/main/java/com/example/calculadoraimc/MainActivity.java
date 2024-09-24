package com.example.calculadoraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculadoraIMC = findViewById(R.id.btnCalculadoraIMC);
        Button btnCalculadoraCombustivel = findViewById(R.id.btnCalculadoraCombustivel);
        Button btnApresentacao = findViewById(R.id.btnApresentacao);
        Button btnFecharApp = findViewById(R.id.btnFecharApp);

        btnCalculadoraIMC.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculadoraIMCActivity.class);
            startActivity(intent);
        });

        btnCalculadoraCombustivel.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculadoraCombustivelActivity.class);
            startActivity(intent);
        });

        btnApresentacao.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ApresentacaoActivity.class);
            startActivity(intent);
        });

        btnFecharApp.setOnClickListener(v -> finish());
    }
}
