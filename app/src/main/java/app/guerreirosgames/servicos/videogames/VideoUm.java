package app.guerreirosgames.servicos.videogames;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class VideoUm extends AppCompatActivity {

    CheckBox sony, nintendo, microsoft, outros;
    EditText outrosEditText;
    private String marca, chave64;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_um);

        /**
         * As funções abaixo serve para deixar o texto em negrito e também não deixar marcar mais de
         * uma empresa de video game, isso que meio que não há console que seja desenvolvido a partir
         * de duas empresas. Claro há pouquissimos, porem não os mais populares.*
         */

        nintendo = findViewById(R.id.videoUm_checkbox1);
        sony = findViewById(R.id.videoUm_checkbox2);
        microsoft = findViewById(R.id.videoUm_checkbox3);
        outros = findViewById(R.id.videoUm_checkboxOutros);

        nintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nintendo.isChecked()) {
                    marca = null;
                    chave64 = null;

                    nintendo.setTypeface(null, Typeface.BOLD);
                    marca = "Nintendo";

                    sony.setChecked(false);
                    sony.setTypeface(null, Typeface.NORMAL);

                    microsoft.setChecked(false);
                    microsoft.setTypeface(null, Typeface.NORMAL);
                } else {
                    nintendo.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        sony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sony.isChecked()) {
                    marca = null;
                    chave64 = null;

                    sony.setTypeface(null, Typeface.BOLD);
                    marca = "Sony";

                    nintendo.setChecked(false);
                    nintendo.setTypeface(null, Typeface.NORMAL);

                    microsoft.setChecked(false);
                    microsoft.setTypeface(null, Typeface.NORMAL);
                } else {
                    sony.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (microsoft.isChecked()) {
                    marca = null;
                    chave64 = null;

                    microsoft.setTypeface(null, Typeface.BOLD);
                    marca = "Microsoft";

                    nintendo.setChecked(false);
                    nintendo.setTypeface(null, Typeface.NORMAL);

                    sony.setChecked(false);
                    sony.setTypeface(null, Typeface.NORMAL);
                } else {
                    microsoft.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        /**
         * Essa função faz que quando marcar a caixa de "outros" desative e desabilite as caixas
         * anteriores, assim só ficando a parte de "outros" para poder expecificar o console
         * desejado pelo usuario final.*
         */

        outros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outros.isChecked()) {
                    marca = null;
                    chave64 = "GNSchaveON";

                    nintendo.setChecked(false);
                    sony.setChecked(false);
                    microsoft.setChecked(false);

                    nintendo.setTypeface(null, Typeface.NORMAL);
                    sony.setTypeface(null, Typeface.NORMAL);
                    microsoft.setTypeface(null, Typeface.NORMAL);

                    nintendo.setEnabled(false);
                    sony.setEnabled(false);
                    microsoft.setEnabled(false);

                } else {

                    nintendo.setEnabled(true);
                    sony.setEnabled(true);
                    microsoft.setEnabled(true);


                }
            }
        });
    }

    public void videoUm_btnVoltar(View view) {
        finish();
    }

    public void videoUm_btnProximo(View view) {
        Intent intent = new Intent(this, VideoDois.class);

        if (marca == null) {
            outrosEditText = findViewById(R.id.videoUm_editTextOutros);
            marca = outrosEditText.getText().toString();
        }

        intent.putExtra("CHAVE64_ATIVADO", chave64);
        intent.putExtra("VIDEOUM_MARCA", marca);

        startActivity(intent);
    }
}