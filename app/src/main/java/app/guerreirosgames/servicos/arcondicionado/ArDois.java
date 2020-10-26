package app.guerreirosgames.servicos.arcondicionado;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ArDois extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView01, autoCompleteTextView02, autoCompleteTextView03;

    /**
     * Essas String definem o que irá aparecer no auto complete de cada box, por exemplo essa
     * primeira é de marcas de Ar condicionado, logo ira filtrar para poder ter mostrar os modelos
     * de cada marca, porem não sei se vai ficar desse jeito mesmo.*
     */

    String[] marcas = {"LG", "Fugitsu", "Midea", "Panasonic", "Carrier", "Consul", "Daikin",
            "Elgin", "Philco", "Samsung", "Springer", "Agratto", "Fontaine", "Eletrolux",
            "Olimpia Splendid", "Springer Midea", "Gree", "Hitachi", "Rinetto", "Admiral", "TCL",
             "Britânia", "Tempstar", "Vogga", "Phaser", "Maxiflex", "Trane", "Olimpia Splendid"};
    ArrayAdapter<String> adapterMarcas;


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

        // Auto complete para BTUs do ar-condicionado.*
        autoCompleteTextView03 = (AutoCompleteTextView) findViewById(R.id.btusArcondicionado);
        adapterBTUs = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , BTUs);
        autoCompleteTextView03.setThreshold(1);
        autoCompleteTextView03.setAdapter(adapterBTUs);


    }

    public void arDoisVoltar(View view) {
        finish();
    }
}