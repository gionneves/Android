package app.guerreirosgames.servicos.arcondicionado;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class ArDois extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView01, autoCompleteTextView02, autoCompleteTextView03;
    EditText editText;
    TextView textView;

    String[] BTUs = {"7000", "9000", "12000", "16000", "20000", "24000", "28000", "32000",
            "36000", "40000", "48000", "56000"};

    /**
     * Essas String definem o que irá aparecer no auto complete de cada box, por exemplo essa
     * primeira é de marcas de Ar condicionado, logo ira filtrar para poder ter mostrar os modelos
     * de cada marca, porem não sei se vai ficar desse jeito mesmo.*
     */

    String[] marcas = {"LG", "Fugitsu", "Midea", "Panasonic", "Carrier", "Consul", "Daikin",
            "Elgin", "Philco", "Samsung", "Springer", "Agratto", "Fontaine", "Eletrolux",
            "Olimpia Splendid", "Springer Midea", "Gree", "Hitachi", "Rinetto", "Admiral", "TCL",
            "Britânia", "Tempstar", "Vogga", "Phaser", "Maxiflex", "Trane"};
    ArrayAdapter<String> adapterMarcas;

    String[] modelos = {"Split-convencional", "Inverter", "De janela", "De teto", "Split-cassete"};
    ArrayAdapter<String> adapterModelos;
    private String marca, modelo, btu;
    ArrayAdapter<String> adapterBTUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_dois);

        /** Recebe os BTUs da classe ArBTUs.* */
        Intent intent = getIntent();
        autoCompleteTextView03 = (AutoCompleteTextView) findViewById(R.id.actvBTUs_ArDois);
        autoCompleteTextView03.setText(intent.getStringExtra("BTUS_CALCBTUS"));


        /** Corretor para o tipo de marcas de Ar-condicionado que aparece na box de texto.* */
        autoCompleteTextView01 = (AutoCompleteTextView) findViewById(R.id.actvMarca_ArDois);
        adapterMarcas = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , marcas);
        autoCompleteTextView01.setThreshold(1);
        autoCompleteTextView01.setAdapter(adapterMarcas);

        /** Corretor para o tipo de modelos de Ar-condicionado que aparece na box de texto.* */
        autoCompleteTextView02 = (AutoCompleteTextView) findViewById(R.id.actvModelo_ArDois);
        adapterModelos = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , modelos);
        autoCompleteTextView02.setThreshold(1);
        autoCompleteTextView02.setAdapter(adapterModelos);

        /**
         * Corretor para quantidades de BTUs necessarios para o ambiente, também automaticamente aparece
         * na box de texto.*
         */
        autoCompleteTextView03 = (AutoCompleteTextView) findViewById(R.id.actvBTUs_ArDois);
        adapterBTUs = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , BTUs);
        autoCompleteTextView03.setThreshold(1);
        autoCompleteTextView03.setAdapter(adapterBTUs);

        /**
         * As funções sobrescritas abaixo servem para fazer o contador de digitos do EditText diminua
         * assim mostrando quantos caracteres falta para poder chegar no limite.*
         */

        editText = (EditText) findViewById(R.id.etAdicional_ArDois);
        textView = (TextView) findViewById(R.id.caracterText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int caraterFinal = 200 - editText.length();

                String convert = String.valueOf(caraterFinal);

                textView.setText(convert);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void salvarOr() {
        Intent intent = new Intent(this, ArTres.class);

        autoCompleteTextView01 = (AutoCompleteTextView) findViewById(R.id.actvMarca_ArDois);
        marca = autoCompleteTextView01.getText().toString();
        intent.putExtra("MARCA_ARDOIS", marca);

        autoCompleteTextView02 = (AutoCompleteTextView) findViewById(R.id.actvModelo_ArDois);
        modelo = autoCompleteTextView02.getText().toString();
        intent.putExtra("MODELO_ARDOIS", modelo);

        autoCompleteTextView03 = (AutoCompleteTextView) findViewById(R.id.actvBTUs_ArDois);
        btu = autoCompleteTextView03.getText().toString();
        intent.putExtra("BTU_ARDOIS", btu);

        startActivity(intent);
    }

    public void arDois_calcular(View view) {
        Intent intent = new Intent(this, ArBTUS.class);
        startActivity(intent);
    }

    /**
     * Função de voltar e confrimar para ir a proxima tela ou voltar.*
     */
    public void arDois_btnConfirmar(View view) {
        salvarOr();
    }

    public void arDois_btnVoltar(View view) {
        finish();
    }
}