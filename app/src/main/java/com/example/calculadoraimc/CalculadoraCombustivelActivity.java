package com.example.calculadoraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraCombustivelActivity extends AppCompatActivity {
    private EditText edtGasolina, edtAlcool;
    private TextView txtResultadoCombustivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_combustivel);

        edtGasolina = findViewById(R.id.edtGasolina);
        edtAlcool = findViewById(R.id.edtAlcool);
        txtResultadoCombustivel = findViewById(R.id.txtResultadoCombustivel);
        Button btnCalcularCombustivel = findViewById(R.id.btnCalcularCombustivel);
        Button btnLimparCombustivel = findViewById(R.id.btnLimparCombustivel);
        RadioGroup radioGroup = findViewById(R.id.radioGroupCombustivel);

        btnCalcularCombustivel.setOnClickListener(v -> calcularCombustivel());
        btnLimparCombustivel.setOnClickListener(v -> limparCampos());
    }

    private void calcularCombustivel() {
        String gasolinaStr = edtGasolina.getText().toString();
        String alcoolStr = edtAlcool.getText().toString();

        if (!gasolinaStr.isEmpty() && !alcoolStr.isEmpty()) {
            float gasolina = Float.parseFloat(gasolinaStr);
            float alcool = Float.parseFloat(alcoolStr);
            float relacao = alcool / gasolina;

            String resultado;
            if (relacao <= 0.7) {
                resultado = "Álcool é mais vantajoso";
            } else {
                resultado = "Gasolina é mais vantajosa";
            }

            txtResultadoCombustivel.setText(resultado + "\nRelação: " + relacao);
        }
    }

    private void limparCampos() {
        edtGasolina.setText("");
        edtAlcool.setText("");
        txtResultadoCombustivel.setText("");
    }
}
