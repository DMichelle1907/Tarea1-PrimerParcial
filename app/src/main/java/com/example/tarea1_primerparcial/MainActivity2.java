package com.example.tarea1_primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Resultado;
    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado = findViewById(R.id.resultado);
        btnMenu = findViewById(R.id.btnMenu);
        Resultado.setText(getIntent().getExtras().getString("Resultado"));

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Intent);
            }
        });

    }
}