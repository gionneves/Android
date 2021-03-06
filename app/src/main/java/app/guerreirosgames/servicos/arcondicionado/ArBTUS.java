package app.guerreirosgames.servicos.arcondicionado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class ArBTUS extends AppCompatActivity {

    private final int btuBase = 600;
    EditText largura, comprimento, pessoa, eletro;
    private int pessoas = 0;
    private int eletronicos = 0;
    private int btuFinal;
    private float lar, com, metrosQuadrados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_btus);
    }

    /**
     * Define as funções que adiciona e remove pessoas e eletronicos do comodo.*
     */
    public void addPessoas_arBTUs(View view) {
        pessoa = findViewById(R.id.etPessoas_arBTUs);
        pessoa.setText(String.valueOf(++pessoas));
    }

    public void remPessoas_arBTUs(View view) {
        pessoa = findViewById(R.id.etPessoas_arBTUs);
        if (pessoas <= 0) {

        } else {
            pessoa.setText(String.valueOf(--pessoas));
        }
    }

    public void addEletros_arBTUs(View view) {
        eletro = findViewById(R.id.etEletronicos_arBTUs);
        eletro.setText(String.valueOf(++eletronicos));
    }

    public void remEletros_arBTUs(View view) {
        eletro = findViewById(R.id.etEletronicos_arBTUs);
        if (eletronicos <= 0) {

        } else {
            eletro.setText(String.valueOf(--eletronicos));

        }
    }


    /**
     * Essa função salva os BTUs para levar os dados para classe ArDois.*
     */
    private void salvarBTUs() {
        Intent intent = new Intent(this, ArDois.class);

        intent.putExtra("BTUS_CALCBTUS", String.valueOf(btuFinal));

        finish();
        startActivity(intent);
    }

    public void Calcular_arBTUs(View view) {
        calcularBTU();
        salvarBTUs();
    }

    /**
     * Aqui onde fica os calculos para os BTUs, nisso.*
     */
    private void calcularBTU() {
        largura = findViewById(R.id.largura_arBTUs);
        comprimento = findViewById(R.id.comprimento_arBTUs);

        lar = Float.parseFloat(largura.getText().toString());
        com = Float.parseFloat(comprimento.getText().toString());

        metrosQuadrados = lar * com;
        btuFinal = (int) (metrosQuadrados * btuBase);
        if (pessoas > 1) { /**Na equação a primeira pessoa não conta, ou seja, por isso é subtraido
         uma após ter mais de uma.* */
            btuFinal += (btuBase * (pessoas - 1));
        }
        if (eletronicos != 0) {
            btuFinal += (btuBase * eletronicos);
        }

        if (btuFinal < 7000) {
            btuFinal = 7000;
        } else if (btuFinal < 9000 && btuFinal > 7000) {
            btuFinal = 9000;
        } else if (btuFinal < 12000 && btuFinal > 9000) {
            btuFinal = 12000;
        }
    }
}