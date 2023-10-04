package com.example.tarea1_primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText numero2, numero1;
    int total;
    Button btnSumar, btnRestar,btnMultiplicar,btnDividir;
    String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText) findViewById(R.id.Numero1);
        numero2= (EditText) findViewById(R.id.Numero2);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar= (Button) findViewById(R.id.btnRestar);
        btnMultiplicar= (Button) findViewById(R.id.btnMultiplicar);
        btnDividir= (Button) findViewById(R.id.btnDividir);
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        //Suma
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                if (n1.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero1.setError("Este campo no puede estar vacío");
                }
                else if(n2.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero2.setError("Este campo no puede estar vacío");

                }else {
                    total = Integer.parseInt(n1) + Integer.parseInt(n2);
                    resultado = String.valueOf(total);
                    intent.putExtra("Resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        //Resta
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                if (n1.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero1.setError("Este campo no puede estar vacío");
                }
                else if(n2.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero2.setError("Este campo no puede estar vacío");

                }else {
                    total = Integer.parseInt(n1) - Integer.parseInt(n2);
                    resultado = String.valueOf(total);
                    intent.putExtra("Resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        //Multiplicar
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                if (n1.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero1.setError("Este campo no puede estar vacío");
                }
                else if(n2.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero2.setError("Este campo no puede estar vacío");

                }else {
                    total = Integer.parseInt(n1) * Integer.parseInt(n2);
                    resultado = String.valueOf(total);
                    intent.putExtra("Resultado", resultado);
                    startActivity(intent);
                }
            }
        });
        //Dividir
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                if (n1.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero1.setError("Este campo no puede estar vacío");
                }
                else if(n2.isEmpty()) {
                    // El campo de texto está vacío, muestra un mensaje de error o realiza alguna acción apropiada.
                    numero2.setError("Este campo no puede estar vacío");

                }else {
                    total = Integer.parseInt(n1) / Integer.parseInt(n2);
                    resultado = String.valueOf(total);
                    intent.putExtra("Resultado", resultado);
                    startActivity(intent);
                }
            }
        });
    }
}
