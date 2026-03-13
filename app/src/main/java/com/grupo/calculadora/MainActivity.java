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

        // SUMA 
        btnSumar.setOnClickListener(v -> {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

            int resultado = n1 + n2;

            txtResultado.setText("Resultado: " + resultado);

        });

        // RESTA 
        btnRestar.setOnClickListener(v -> {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

            int resultado = n1 - n2;

            txtResultado.setText("Resultado: " + resultado);

        });

        // MULTIPLICACIÓN
        btnMultiplicar.setOnClickListener(v -> {

            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                txtResultado.setText("Por favor ingresa ambos números");
                return;
            }

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());

            double resultado = n1 * n2;

            txtResultado.setText("Resultado: " + resultado);

        });


// DIVISIÓN
        btnDividir.setOnClickListener(v -> {

            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                txtResultado.setText("Por favor ingresa ambos números");
                return;
            }

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());

            if (n2 == 0) {
                txtResultado.setText("No se puede dividir por 0");
            } else {

                double resultado = n1 / n2;

                txtResultado.setText("Resultado: " + resultado);
            }

        });


    }
}
