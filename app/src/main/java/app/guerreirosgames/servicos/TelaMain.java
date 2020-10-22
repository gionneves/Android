package app.guerreirosgames.servicos;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class TelaMain extends AppCompatActivity {

    /**
     * Essas linhas, principalmente a String, Serve para lista de serviços que irá aparecer dentro
     * da box de pesquisa.
     */
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    String[] servicos = {"Ar-condicionado", "Vídeo-game", "Tablet", "GPS", "Celular", "Computador",
            "Notebook", "CFTV", "IPTV", "Câmera", "Drone", "Canecas", "Camisetas", "Aquecedor",
            "Bolinho-de-chuva"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_main);

        //Atribuir variavel
        autoCompleteTextView = findViewById(R.id.textGetServico);
        textView = findViewById(R.id.textViewPrecisa);

        //Iniciar adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line
                , servicos);

        //Pegar sugestão apos ecrever algumas letras
        autoCompleteTextView.setThreshold(1);

        // Setar adapter
        autoCompleteTextView.setAdapter(adapter);

        /**autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //textView.setText(adapter.getItem(i));
        }
        });*/
    }

    /**
     * @param view
     */
    public void btn_confirmar(View view) {
        String cfm = autoCompleteTextView.getText().toString();
        cfm = cfm.toLowerCase().replace("-", "");

        switch (cfm) {
            case "arcondicionado":
                System.out.println("TOP");
                break;
            case "vídeogame":
                System.out.println("toop");
        }
    }

    /**
     * @param view
     */
    public void btn_suporte(View view) {

    }
}