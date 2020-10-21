package app.guerreirosgames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaEsqueciSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_esqueci_senha);

        // add button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}