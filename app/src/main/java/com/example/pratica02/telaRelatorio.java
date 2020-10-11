package com.example.pratica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class telaRelatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_relatorio);

        Intent itNome = getIntent();
        String nome = itNome.getStringExtra(MainActivity.EXTRA_NOME);
        Intent itIdade = getIntent();
        String idade = itIdade.getStringExtra(MainActivity.EXTRA_IDADE);
        Intent itPeso = getIntent();
        String peso = itPeso.getStringExtra(MainActivity.EXTRA_PESO);
        Intent itAltura = getIntent();
        String altura = itAltura.getStringExtra(MainActivity.EXTRA_ALTURA);

        double vlrpeso = Double.parseDouble(peso);
        double vlraltura = Double.parseDouble(altura);

        double calc = vlrpeso/(vlraltura*vlraltura);
        String IMC = String.format("%.1f", calc);
        String resp = "";
        if(calc < 18.5) resp = "Abaixo do Peso";
        else if(calc >= 18.5 && calc <= 24.9) resp = "Saudável";
        else if(calc >= 25 && calc <= 29.9) resp = "Sobrepeso";
        else if(calc >= 30 && calc <= 34.9) resp = "Obesidade Grau I";
        else if(calc >= 35 && calc <= 39.9) resp = "Obesidade Grau II (severa)";
        else if(calc >= 40) resp = "Obesidade Grau III (mórbida)";

        TextView respNome = findViewById(R.id.rNome);
        respNome.setText(nome);
        TextView respIdade = findViewById(R.id.rIdade);
        respIdade.setText(idade+" anos");
        TextView respPeso = findViewById(R.id.rPeso);
        respPeso.setText(peso+ " kg");
        TextView respAltura = findViewById(R.id.rAltura);
        respAltura.setText(altura+ " m");
        TextView respIMC= findViewById(R.id.rIMC);
        respIMC.setText(IMC + " kg/m²");
        TextView respClass= findViewById(R.id.rClass);
        respClass.setText(resp);
    }
    public void Button2(View view) {
        Intent it = new Intent(getBaseContext(), MainActivity.class);
        it.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(it);
    }
}