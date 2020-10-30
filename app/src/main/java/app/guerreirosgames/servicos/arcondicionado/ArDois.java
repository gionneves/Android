package app.guerreirosgames.servicos.arcondicionado;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class ArDois extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView01, autoCompleteTextView02, autoCompleteTextView03;
    EditText editText;
    TextView textView;

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


    String[] BTUs = {"7.000", "9.000", "12.000", "16.000", "20.000", "24.000", "28.000", "32.000",
            "36.000", "40.000", "48.000", "56.000"};
    ArrayAdapter<String> adapterBTUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_dois);

        // Auto complete para marcas de ar-condicionado.*
        autoCompleteTextView01 = (AutoCompleteTextView) findViewById(R.id.marcaArcondicionado);
        adapterMarcas = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , marcas);
        autoCompleteTextView01.setThreshold(1);
        autoCompleteTextView01.setAdapter(adapterMarcas);

        // auto completa os do Ar-condicionado modelos.*
        autoCompleteTextView02 = (AutoCompleteTextView) findViewById(R.id.modeloArcondicionado);
        adapterModelos = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , modelos);
        autoCompleteTextView02.setThreshold(1);
        autoCompleteTextView02.setAdapter(adapterModelos);

        // Auto complete para BTUs do ar-condicionado.*
        autoCompleteTextView03 = (AutoCompleteTextView) findViewById(R.id.btusArcondicionado);
        adapterBTUs = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , BTUs);
        autoCompleteTextView03.setThreshold(1);
        autoCompleteTextView03.setAdapter(adapterBTUs);

        // Diminui os caracteres debaixo do adicional.*
        editText = (EditText) findViewById(R.id.adicionalArcondicionado);
        textView = (TextView) findViewById(R.id.caracterText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Contador de caractere.*
                int caraterFinal = 200 - editText.length();

                //Conversor.*
                String convert = String.valueOf(caraterFinal);

                //Trocar texto do TextView.*
                textView.setText(convert);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }

    public void arDoisConfirmar(View view) {
        startActivity(new Intent(this, ArQuatro.class));
    }

    public void arDoisVoltar(View view) {
        finish();
    }
}