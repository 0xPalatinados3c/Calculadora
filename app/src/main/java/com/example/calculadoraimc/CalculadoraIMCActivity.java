package com.example.calculadoraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraIMCActivity extends AppCompatActivity {
    private EditText edtPeso, edtAltura;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        txtResultado = findViewById(R.id.txtResultado);
        Button btnCalcularIMC = findViewById(R.id.btnCalcularIMC);
        Button btnLimparIMC = findViewById(R.id.btnLimparIMC);

        btnCalcularIMC.setOnClickListener(v -> calcularIMC());
        btnLimparIMC.setOnClickListener(v -> limparCampos());
    }

    private void calcularIMC() {
        String pesoStr = edtPeso.getText().toString();
        String alturaStr = edtAltura.getText().toString();

        if (!pesoStr.isEmpty() && !alturaStr.isEmpty()) {
            float peso = Float.parseFloat(pesoStr);
            float altura = Float.parseFloat(alturaStr);
            float imc = peso / (altura * altura);
            String classificacao = "";

            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc < 25) {
                classificacao = "Peso normal";
            } else if (imc < 30) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obesidade";
            }

            txtResultado.setText(String.format("IMC: %.2f\nClassificação: %s", imc, classificacao));
        }
    }

    private void limparCampos() {
        edtPeso.setText("");
        edtAltura.setText("");
        txtResultado.setText("");
    }
}
