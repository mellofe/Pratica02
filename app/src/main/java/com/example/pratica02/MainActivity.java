package com.example.pratica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOME = "com.example.pratica02.NOME";
    public static final String EXTRA_IDADE = "com.example.pratica02.IDADE";
    public static final String EXTRA_PESO = "com.example.pratica02.PESO";
    public static final String EXTRA_ALTURA = "com.example.pratica02.ALTURA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button(View view) {
        final EditText editNome = (EditText) findViewById(R.id.editNome);
        final EditText editIdade = (EditText) findViewById(R.id.editIdade);
        final EditText editPeso = (EditText) findViewById(R.id.editPeso);
        final EditText editAltura = (EditText) findViewById(R.id.editAltura);

        String nome = editNome.getText().toString();
        String idade = editIdade.getText().toString();
        String peso = editPeso.getText().toString();
        String altura = editAltura.getText().toString();

        Intent it = new Intent(getBaseContext(), telaRelatorio.class);

        it.putExtra(EXTRA_NOME, nome);
        it.putExtra(EXTRA_IDADE, idade);
        it.putExtra(EXTRA_PESO, peso);
        it.putExtra(EXTRA_ALTURA, altura);

        startActivity(it);
    }

}