package app.guerreirosgames.servicos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import app.guerreirosgames.R;

public class Final_OS extends AppCompatActivity {

    private final String[] nome = {"João", "Paulo", "Fernando", "Jonas", "Giovanni", "Eduardo", "Pedro",
            "Luciano Hulk", "Robson", "Gabriel"};
    private final String[] sobre = {"Tecnico Multi-tarefa",
            "Tecnico de TV", "Gerente", "Criador da TV led", "Profissional em consoles", "ERROR-404",
            "Profissional em computadores", "Graduado em Suporte Tecnico", "Operador espacial",
            "Criador de jogos"};
    TextView prestadorInfo;
    private int idade;
    private String hora, data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_os);

        /**
         Intent intent = getIntent();
         hora = intent.getStringExtra("");
         data = intent.getStringExtra("");.*
         */


    }

    public void finalOS_randomPessoa(View view) {
        prestadorInfo = findViewById(R.id.nomePrestador_finalOS);

        Random rng = new Random();
        int n = rng.nextInt(9);
        int m = rng.nextInt(9);
        idade = rng.nextInt(30);

        while (idade < 17) {
            idade = rng.nextInt(30);
            System.out.println(idade);
        }

        if (n == 4) {
            m = 5;
            idade = 20;
        }
        if (n == 3) {
            m = 5;
            idade = 22;
        }
        if (n == 2) {
            m = 5;
            idade = 26;
        }

        prestadorInfo.setText(getString(R.string.nome_prestador_final_os, nome[n], idade, sobre[m]));

    }

    public void finalOS_btnConcluido(View view) {
        Intent intent = new Intent(this, TelaMain.class);
        startActivity(intent);
        finish();
    }

}