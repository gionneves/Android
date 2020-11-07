package app.guerreirosgames.servicos.arcondicionado;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class ArUm extends AppCompatActivity {
    CheckBox higienizacao, manutencao, instalacao, outros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_um);

        /**
         * Essas funções abaixo foram sobre-escritas para poder servir de listener check, ou seja
         * quando for selecionada ficara em negrito marcando que realmente foi selecionado e ficando
         * mais visual para o usuario final que é exatamente aquilo que está pedindo e selecionado.*
         */

        higienizacao = findViewById(R.id.arCB_um);
        manutencao = findViewById(R.id.arCB_dois);
        instalacao = findViewById(R.id.arCB_tres);
        outros = findViewById(R.id.arCB_outros);

        higienizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (higienizacao.isChecked()) {
                    higienizacao.setTypeface(null, Typeface.BOLD);

                    manutencao.setChecked(false);
                    manutencao.setTypeface(null, Typeface.NORMAL);

                    instalacao.setChecked(false);
                    instalacao.setTypeface(null, Typeface.NORMAL);
                } else {
                    higienizacao.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        manutencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (manutencao.isChecked()) {
                    manutencao.setTypeface(null, Typeface.BOLD);

                    higienizacao.setChecked(false);
                    higienizacao.setTypeface(null, Typeface.NORMAL);

                    instalacao.setChecked(false);
                    instalacao.setTypeface(null, Typeface.NORMAL);
                } else {
                    manutencao.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        instalacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (instalacao.isChecked()) {
                    instalacao.setTypeface(null, Typeface.BOLD);

                    manutencao.setChecked(false);
                    manutencao.setTypeface(null, Typeface.NORMAL);

                    higienizacao.setChecked(false);
                    higienizacao.setTypeface(null, Typeface.NORMAL);
                } else {
                    instalacao.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        /**
         * Essa função faz que quando marcar a caixa de "outros" desative e desabilite as caixas
         * anteriores, assim só ficando a parte de "outros" para poder expecificar o serviço
         * desejado pelo usuario final.*
         */

        outros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (outros.isChecked()) {

                    higienizacao.setChecked(false);
                    manutencao.setChecked(false);
                    instalacao.setChecked(false);

                    higienizacao.setTypeface(null, Typeface.NORMAL);
                    manutencao.setTypeface(null, Typeface.NORMAL);
                    instalacao.setTypeface(null, Typeface.NORMAL);

                    higienizacao.setEnabled(false);
                    manutencao.setEnabled(false);
                    instalacao.setEnabled(false);

                } else {

                    higienizacao.setEnabled(true);
                    manutencao.setEnabled(true);
                    instalacao.setEnabled(true);

                }
            }
        });


    }

    /**
     * Essa função serve para poder verificar se há alguma CheckBox marcada, caso nenhuma estiver o
     * programa não vai deixar o usuario progredir, caso alguma esteja ele vai poder progredir normalmente
     * nisso também será colocado um sistema que quando um estiver marcado, a opção dele será lembrada
     * para poder ir para O.S..*
     *
     * @param view
     */

    public void arUm_btnProximo(View view) {

        byte i = 0;

        if (higienizacao.isChecked()) {
            i++;
        }

        if (manutencao.isChecked()) {
            i++;
        }

        if (instalacao.isChecked()) {
            i++;
        }

        if (outros.isChecked()) {
            i++;
        }

        if (i != 0) {
            startActivity(new Intent(this, ArDois.class));
        }

    }

    public void arUm_btnVoltar(View view) {
        finish();
    }
}