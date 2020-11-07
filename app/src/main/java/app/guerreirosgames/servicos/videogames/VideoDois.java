package app.guerreirosgames.servicos.videogames;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class VideoDois extends AppCompatActivity {

    AutoCompleteTextView modelos;
    TextView tvMarca;
    CheckBox nLiga, lNaoDaTela, pOutros;

    /**
     * Lista de modelos de cada marca de video-games disponiveis aqui na Guerreiros para reparo.*
     */

    String[] nintendo = {"Nintendo Wii", "Nintendo 3DS", "Nintendo New 3DS", "Nintendo 2DS",
            "Nintendo New 2DS", "Nintendo WiiU", "Nintendo DS", "Nintendo DSi", "Nintendo DSi-Lite",
            "Nintendo Switch"};
    ArrayAdapter<String> adapterNintendo;

    String[] sony = {"Playstation", "Playstation 2", "Sony PSP 1000", "Sony PSP 2000",
            "Sony PSP 3000", "Sony PSP GO", "Playstation 3 Fat", "Playstation 3 Slim",
            "Playstation 3 Super-Slim"};
    ArrayAdapter<String> adapterSony;

    String[] microsoft = {"Xbox 360 Arcade", "Xbox 360 Slim", "Xbox 360 Super-Slim", "Xbox One",
            "Xbox One S", "Xbox One Fat", "Xbox One S (digital)",};
    ArrayAdapter<String> adapterMicrosoft;

    String[] outros = {"Raspberry 3", "Outros", "Arcade generico", "Raspberry 2", "Raspberry"};
    ArrayAdapter<String> adapterOutros;

    private String marca, chave64, modelo, adicional, defeito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_dois);

        /** Importa os dados da atividade anterior para esta.* */
        Intent intent = getIntent();
        marca = intent.getStringExtra("VIDEOUM_MARCA");
        chave64 = intent.getStringExtra("CHAVE64_ATIVADO");

        tvMarca = findViewById(R.id.videoDois_tvMarca);
        tvMarca.setText(marca);

        modelos = findViewById(R.id.videoDois_actvModelo);

        /**
         * Esse switch é responsavel por compara a String "marca" e ver qual marca foi selecionada
         * na tela passada e fazer aparecer somente os modelos de determinada marca no autocorretor.*
         */

        switch (marca) {
            case "Nintendo":

                modelos.setHint("Nintendo Wii, Nintendo 3DS");
                adapterNintendo = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, nintendo);
                modelos.setThreshold(1);
                modelos.setAdapter(adapterNintendo);

                break;
            case "Sony":

                modelos.setHint("Playstation 3 Slim");
                adapterSony = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, sony);
                modelos.setThreshold(1);
                modelos.setAdapter(adapterSony);


                break;
            case "Microsoft":

                modelos.setHint("Xbox One");
                adapterMicrosoft = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, microsoft);
                modelos.setThreshold(1);
                modelos.setAdapter(adapterMicrosoft);

                break;
            default:

                modelos.setHint("Raspberry 3, N64");
                adapterOutros = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, outros);
                modelos.setThreshold(1);
                modelos.setAdapter(adapterOutros);

                break;
        }

        /**Faz os checkbox desmarcar e ficar em negrito quando apertados.* */

        nLiga = findViewById(R.id.videoDois_checkBox1);
        lNaoDaTela = findViewById(R.id.videoDois_checkBox2);
        pOutros = findViewById(R.id.videoDois_checkBox3);

        nLiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nLiga.isChecked()) {

                    nLiga.setTypeface(null, Typeface.BOLD);

                    lNaoDaTela.setChecked(false);
                    lNaoDaTela.setTypeface(null, Typeface.NORMAL);

                    pOutros.setChecked(false);
                    pOutros.setTypeface(null, Typeface.NORMAL);
                } else {
                    nLiga.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        lNaoDaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lNaoDaTela.isChecked()) {

                    lNaoDaTela.setTypeface(null, Typeface.BOLD);

                    nLiga.setChecked(false);
                    nLiga.setTypeface(null, Typeface.NORMAL);

                    pOutros.setChecked(false);
                    pOutros.setTypeface(null, Typeface.NORMAL);
                } else {
                    lNaoDaTela.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        pOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pOutros.isChecked()) {

                    pOutros.setTypeface(null, Typeface.BOLD);

                    nLiga.setChecked(false);
                    nLiga.setTypeface(null, Typeface.NORMAL);

                    lNaoDaTela.setChecked(false);
                    lNaoDaTela.setTypeface(null, Typeface.NORMAL);
                } else {
                    pOutros.setTypeface(null, Typeface.NORMAL);
                }
            }
        });


        if (defeito == "defeitro") {

        }


    }

    private void isNSF() { /**Esse é um segredo, não conte a ninguem.* */
        modelos = findViewById(R.id.videoDois_actvModelo);
        String is64 = modelos.getText().toString();

        is64 = is64.replace(" ", "");
        is64 = is64.toLowerCase();
        try {
            if (is64.equals("nintendo64") && chave64.equals("GNSchaveON")) {
                MediaPlayer mp = MediaPlayer.create(this, R.raw.nintendo64);
                mp.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Esses botões são auto explicativos, um adendo no primeiro "videoDois_btnProximo" que ele salva
     * as informações e depois envia para proxima activity.*
     */

    public void videoDois_btnProximo(View view) {
        isNSF();
        EditText etAdicional = findViewById(R.id.videoDois_etAdicional);

        Intent intent = new Intent(this, VideoTres.class);
        modelo = modelos.getText().toString();
        adicional = etAdicional.getText().toString();


        intent.putExtra("VIDEODOIS_MARCA", marca);
        intent.putExtra("VIDEODOIS_MODELO", modelo);
        intent.putExtra("VIDEODOIS_ADICIONAL", adicional);

        startActivity(intent);

    }

    public void videoDois_btnVolta(View view) {
        finish();
    }

}