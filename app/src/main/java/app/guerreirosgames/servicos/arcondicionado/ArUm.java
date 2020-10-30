package app.guerreirosgames.servicos.arcondicionado;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;
import app.guerreirosgames.cadastro.Usuario;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class ArUm extends AppCompatActivity {
    CheckBox checkBox01, checkBox02, checkBox03, checkBox04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_um);

        /**
         * Essas funções abaixo foram sobre-escritas para poder servir de listener check, ou seja
         * quando for selecionada ficara em negrito marcando que realmente foi selecionado e ficando
         * mais visual para o usuario final que é exatamente aquilo que está pedindo e selecionado.*
         */

        checkBox01 = (CheckBox) findViewById(R.id.checkboxUm);
        checkBox02 = (CheckBox) findViewById(R.id.checkboxDois);
        checkBox03 = (CheckBox) findViewById(R.id.checkboxTres);
        checkBox04 = (CheckBox) findViewById(R.id.checkboxOutros);

        checkBox01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox01.isChecked()) {
                    checkBox01.setTypeface(null, Typeface.BOLD);
                } else {
                    checkBox01.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        checkBox02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox02.isChecked()) {
                    checkBox02.setTypeface(null, Typeface.BOLD);
                } else {
                    checkBox02.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        checkBox03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox03.isChecked()) {
                    checkBox03.setTypeface(null, Typeface.BOLD);
                } else {
                    checkBox03.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        /**
         * Essa função faz que quando marcar a caixa de "outros" desative e desabilite as caixas
         * anteriores, assim só ficando a parte de "outros" para poder expecificar o serviço
         * desejado pelo usuario final.*
         */

        checkBox04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox04.isChecked()) {

                    checkBox01.setChecked(false);
                    checkBox02.setChecked(false);
                    checkBox03.setChecked(false);

                    checkBox01.setTypeface(null, Typeface.NORMAL);
                    checkBox02.setTypeface(null, Typeface.NORMAL);
                    checkBox03.setTypeface(null, Typeface.NORMAL);

                    checkBox01.setEnabled(false);
                    checkBox02.setEnabled(false);
                    checkBox03.setEnabled(false);

                } else {

                    checkBox01.setEnabled(true);
                    checkBox02.setEnabled(true);
                    checkBox03.setEnabled(true);

                }
            }
        });


    }

    public void arUmProximo(View view) {

        /**
         * Esses "if" serve para poder verificar se alguma CheckBox está marcada para progredir
         * no serviço de ar-condicionado.*
         */

        byte i = 0;

        if (checkBox01.isChecked()) {
            i++;
        }

        if (checkBox02.isChecked()) {
            i++;
        }

        if (checkBox03.isChecked()) {
            i++;
        }

        if (checkBox04.isChecked()) {
            i++;
        }

        if (i != 0) {
            startActivity(new Intent(this, ArDois.class));
        }

        Usuario user = new Usuario();
        System.out.println(user.getNome());
    }

    public void arUmVoltar(View view) {
        finish();
    }
}