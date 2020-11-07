package app.guerreirosgames.servicos;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class Pagamento extends AppCompatActivity {
    ToggleButton tb_debCre, tb_troco;
    TextView tv_debCre_changer;
    EditText et_troco;

    //private String marca, modelo, tipo, info_extra;.*//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        /** Recebe as informações da ativity anterior para essa de Pagamento
         *  Serve principalmente para poder levar as informações para o arquivo "Final_OS.java"
         *  Temporariamente estara bloqueada para não causar erros durante a fase de testes, nisso.*
         */

        /**
         Intent intent = getIntent();
         marca = intent.getStringExtra("");
         modelo = intent.getStringExtra("");
         tipo = intent.getStringExtra("");
         info_extra = intent.getStringExtra("");.*
         */


        /** ToggleButton do Débito e crédito fazendo possivel alterar ao apertar o botão quando clicado.* */
        tb_debCre = findViewById(R.id.pagTB_debCre);
        tb_debCre.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tv_debCre_changer = findViewById(R.id.pagTV_debCre);
                    tv_debCre_changer.setText(R.string.pagRB_credito);
                } else {
                    tv_debCre_changer = findViewById(R.id.pagTV_debCre);
                    tv_debCre_changer.setText(R.string.pagRB_debito);
                }
            }
        });

        /** ToggleButton do troco onde quando apertado vai mostrar o total de .* */
        tb_troco = findViewById(R.id.pagTB_troco);
        tb_troco.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    et_troco = findViewById(R.id.pagET_troco);
                    et_troco.setEnabled(true);
                } else {
                    et_troco = findViewById(R.id.pagET_troco);
                    et_troco.setText("");
                    et_troco.setEnabled(false);
                }
            }
        });
    }

    /**
     * Função de de verificar o método de pagamento, cartão ou dinheiro.*
     */
    public void pagRBcheck(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.pagRBcartao:
                /** Verifica se o RadioButton do Cartão está marcado.* */
                if (checked) {
                    tv_debCre_changer = findViewById(R.id.pagTV_debCre);
                    tv_debCre_changer.setTextColor(0xff000000);

                    tb_debCre = findViewById(R.id.pagTB_debCre);
                    tb_debCre.setEnabled(true);

                    et_troco = findViewById(R.id.pagET_troco);
                    et_troco.setText("");
                    tb_troco = findViewById(R.id.pagTB_troco);
                    tb_troco.setChecked(false);
                    tb_troco.setEnabled(false);
                }
                break;
            case R.id.pagRBdinheiro:
                /** Verifica se o RadioButton do Dinheiro está marcado.* */
                if(checked){
                    tv_debCre_changer = findViewById(R.id.pagTV_debCre);
                    tv_debCre_changer.setTextColor(0xff999999);

                    tb_debCre = findViewById(R.id.pagTB_debCre);
                    tb_debCre.setEnabled(false);

                    tb_troco = findViewById(R.id.pagTB_troco);
                    tb_troco.setEnabled(true);
                }
                break;
        }

    }

    /**
     * Função que termina e volta para tela anterior.*
     */
    public void pagFinish(View view) {
        finish();
    }

}