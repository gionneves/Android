package app.guerreirosgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.servicos.arcondicionado.ArUm;
import app.guerreirosgames.servicos.celular.CelUm;
import app.guerreirosgames.servicos.celular.tablet.TabletUm;
import app.guerreirosgames.servicos.computador.ComputadorUm;
import app.guerreirosgames.servicos.computador.montar.MontarComputadorUm;
import app.guerreirosgames.servicos.videogames.VideoUm;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void telaPrincipal_irArCondicionado(View view) {
        startActivity(new Intent(this, ArUm.class));
    }

    public void telaPrincipal_irVideoGames(View view) {
        startActivity(new Intent(this, VideoUm.class));
    }

    public void telaPrincipal_irCelular(View view) {
        startActivity(new Intent(this, CelUm.class));
    }

    public void telaPrincipal_irComputador(View view) {
        startActivity(new Intent(this, ComputadorUm.class));
    }

    public void telaPrincipal_irMontarComputador(View view) {
        startActivity(new Intent(this, MontarComputadorUm.class));
    }

    public void telaPrincipal_irTablet(View view) {
        startActivity(new Intent(this, TabletUm.class));
    }
}