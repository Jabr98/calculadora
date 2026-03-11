package com.grupo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        txtResultado = findViewById(R.id.txtResultado);

        // SUMA (tu parte)
        btnSumar.setOnClickListener(v -> {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

            int resultado = n1 + n2;

            txtResultado.setText("Resultado: " + resultado);

        });

        // RESTA (tu parte)
        btnRestar.setOnClickListener(v -> {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

            int resultado = n1 - n2;

            txtResultado.setText("Resultado: " + resultado);

        });

    }
}