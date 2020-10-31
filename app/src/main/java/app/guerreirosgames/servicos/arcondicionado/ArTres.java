package app.guerreirosgames.servicos.arcondicionado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.Agendamento;

public class ArTres extends AppCompatActivity {

    TextView marcaO, modeloO, btusO;
    private String marca, modelo, btu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_tres);

        marcaO = (TextView) findViewById(R.id.arTV_marcaOrcamento);
        modeloO = (TextView) findViewById(R.id.arTV_modeloOrcamento);
        btusO = (TextView) findViewById(R.id.arTV_BTUsOrcamento);


        Intent intent = getIntent();

        marca = intent.getStringExtra("MARCA_ARDOIS");
        modelo = intent.getStringExtra("MODELO_ARDOIS");
        btu = intent.getStringExtra("BTU_ARDOIS");


        marcaO.setText(marca);
        modeloO.setText(modelo);
        btusO.setText(btu);


    }

    public void arTres_btnVoltar(View view) {
        finish();
    }

    public void arTres_btnConfirmar(View view) {
        startActivity(new Intent(this, Agendamento.class));
    }
}