package app.guerreirosgames.servicos.arcondicionado;

import androidx.appcompat.app.AppCompatActivity;
import app.guerreirosgames.R;

import android.os.Bundle;
import android.view.View;

public class ArTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_tres);
    }

    public void arTresVoltar(View view) {
        finish();
    }

    public void arTresConfirmar(View view) {
    }
}