package app.guerreirosgames.servicos.celular;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.Agendamento;

public class CelDois extends AppCompatActivity {

    private ArrayList<String> defeitos = new ArrayList<>();
    private String marca, modelo;
    private TextView show_marca, show_modelo, show_defeito, info, contador;
    private EditText adicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_dois);

        Intent intent = getIntent();

        modelo = intent.getStringExtra("CELUM_MODELO");
        marca = intent.getStringExtra("CELUM_MARCA");
        defeitos = intent.getStringArrayListExtra("CELUM_DEFEITOS");

        show_marca = (TextView) findViewById(R.id.celDois_marca);
        show_marca.setText(getString(R.string.marca_orcamento , marca));

        show_modelo = (TextView) findViewById(R.id.celDois_modelo);
        show_modelo.setText(getString(R.string.modelo_orcamento , modelo));

        show_defeito = (TextView) findViewById(R.id.celDois_defeitos);
        show_defeito.setText(getString(R.string.defeitos_orcamento , defeitos.toString()));

        //--------------------------------------------------------.*

        contador = (TextView) findViewById(R.id.celDois_Contador);
        adicional = (EditText) findViewById(R.id.celDois_adicional_EditText);

        adicional.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence , int i , int i1 , int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence , int i , int i1 , int i2) {
                int caractere = 100 - adicional.length();
                contador.setText(getString(R.string.contador , caractere));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void close(View view) {
        finish();
    }

    public void proximo(View view) {
        Intent intent = new Intent(this , Agendamento.class);
        startActivity(intent);
        finish();
    }
}