package app.guerreirosgames.servicos.videogames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.Agendamento;

public class VideoTres extends AppCompatActivity {

    TextView tvModelo, tvMarca, tvAdicional;
    private String modelo, marca, adicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tres);

        /** Recebe e grava em váriaveis os dados do VideoDois.java
         * nisso também já troca os TextView pelas informações passadas.* */
        Intent intent = getIntent();
        marca = intent.getStringExtra("VIDEODOIS_MARCA");
        modelo = intent.getStringExtra("VIDEODOIS_MODELO");
        adicional = intent.getStringExtra("VIDEODOIS_ADICIONAL");

        tvMarca = findViewById(R.id.videoTres_tvMarca);
        tvMarca.setText(getString(R.string.marca_orcamento, marca));

        tvModelo = findViewById(R.id.videoTres_tvModelo);
        tvModelo.setText(getString(R.string.modelo_orcamento, modelo));

        tvAdicional = findViewById(R.id.videoTres_tvAdicional);
        tvAdicional.setText(getString(R.string.adicional_orcamento, adicional));

        /** tvComum = (TextView) findViewById(R.id.videoTres_tvComum);
         tvComum.setText(getString(R.string.comum_orcamento, comum));.* */
    }

    public void videoTres_btnProximo(View view) {
        Intent intent = new Intent(this, Agendamento.class);

        intent.putExtra("UNI_MARCA", marca);
        intent.putExtra("UNI_MODELO", modelo);
        intent.putExtra("UNI_ADICIONAL", adicional);

        startActivity(intent);

    }

    public void videoTres_btnCancelar(View view) {
        finish();
    }
}