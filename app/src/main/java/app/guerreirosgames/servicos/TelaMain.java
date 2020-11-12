package app.guerreirosgames.servicos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.arcondicionado.ArUm;
import app.guerreirosgames.servicos.videogames.VideoUm;

public class TelaMain extends AppCompatActivity {


    /**
     * Essas linhas, principalmente a String, Serve para lista de serviços que irá aparecer dentro
     * da box de pesquisa.*
     */
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    String[] servicos = {"Ar-condicionado", "Vídeo-game", "Tablet", "GPS", "Celular", "Computador",
            "Notebook", "CFTV", "Câmera", "Drone", "Canecas", "Camisetas", "Aquecedor",
            "Bolinho-de-chuva"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_main);

        /**
         * O código nas proximas linhas (antes de fechar o "onCreate") servem para que funcione o
         * corretor da caixa de texto apresentada no layout.*
         */

        autoCompleteTextView = findViewById(R.id.actvPesquisa_servicos);
        textView = findViewById(R.id.textViewPrecisa);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , servicos);

        autoCompleteTextView.setThreshold(1);

        autoCompleteTextView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Esse metodo serve para verificar o que está escrito no EditText para enviar o usuario para a
     * tela de serviço desejado e suas opções.
     *
     * @param view O parametro de "view" serve para poder mostrar a janela após selecionado.*
     */
    public void servicos_btnConfirmar(View view) {
        String cfm = autoCompleteTextView.getText().toString();
        cfm = cfm.toLowerCase().replace("-", "");
        switch (cfm) {
            case "arcondicionado":
                startActivity(new Intent(this, ArUm.class));
                break;
            case "vídeogame":
                startActivity(new Intent(this, VideoUm.class));
                break;
            case "ferias":
                MediaPlayer mp = MediaPlayer.create(this, R.raw.my_song);
                mp.start();
                setContentView(R.layout.activity_main_importante);
                break;

        }
    }

    /**
     * Botão será acionado e levará o usuario ate a parte de suporte onde tudo poderá ser mostrado
     * tanto erros comums quando a possibilidade de falar com atendente.
     *
     * @param view O parametro de "view" serve para poder mostrar a janela após selecionado.*
     */
    public void servicos_btnSuporte(View view) {

    }

    /**
     * Este botão serve para volta a tela de serviços, porem ele está sendo usando em um Easter egg
     * dentro do programa, se não fosse algo extremamente IMPORTANTE não teria nada disso escrito no
     * código do aplicativo, porem já que está aqui... pense um pouco e vá tirar umas "ferias".*
     */
    public void servicos_btnVoltar(View view) {
        //startActivity(new Intent(this, TelaMain.class));
        finish();
    }
}