package app.guerreirosgames;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        // add button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /***
     * Esse item serve para retornar a tela home, ou no caso a tela de login. Esta declarado como
     * que faça os botão de atalho do android funcione quando aperte para voltar.
     *
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    /***
     * Função que vai em um botão que simplismente fecha a tela de cadastro.
     */

    public void fechar(View view) {
        System.out.println("VOLTOU LOGIN");
        this.finish();

        //startActivity(new Intent(this, MainActivity.class));
    }

    /**
     * Função que tem um DB que cadastra e salva os dados do usuarios quando cadastrados. Faz
     * ligação via SQL (Não se sabe ao certo se será MySQL ou MongoDB [NoSQL]). onde ficará falvo
     * todas as informações presentes em um só db
     */

    public void cadastrar(View view) {

    }

}