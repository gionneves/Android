package app.guerreirosgames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class TelaEsqueciSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_esqueci_senha);

        // add button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void esqueci(View view) {
        /**
         * Sera adicionado futuramente linhas que mandará um email com campo para preencher a senha
         * nisso alterando para a nova. Ainda tem muito o que fazer, principalmente em parte de
         * bando de dados e alterações.*
         */
    }
}