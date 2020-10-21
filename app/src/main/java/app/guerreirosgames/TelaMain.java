package app.guerreirosgames;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaMain extends AppCompatActivity {

    /**
     * Essas linhas, principalmente a String, Serve para lista de serviços que irá aparecer dentro
     * da box de pesquisa.
     */
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    String[] servicos = {"Ar-condicionado", "Vídeo-game", "Edição de vídeo", "Adaptadores",
            "Ventiladores", "Home-Office", "Reparo", "Assistencia", "Aterramento", "Boliche", "Ballgato",
    "Help-Desk"};
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

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(adapter.getItem(i));
            }
        });
    }
}