package app.guerreirosgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTelaCadastro(View view) {
        //lsdFun();
        startActivity(new Intent(this, TelaCadastro.class));
    }

    public void goTelaMain(View view) {
        //startActivity(new Intent(this, TelaMain.class));
        //lsdFun();
    }

    private void lsdFun() {
        EditText text = (EditText) findViewById(R.id.loginGetEmail);
        String lsd = text.getText().toString();
        System.out.println(lsd);
        //------------------------------------//
        TextView texts = (TextView) findViewById(R.id.textViewEsqueciSenha);

        if (lsd == "lsd") {
            texts.setText("não use drogas!");
            System.out.println("Foi sim");
        }
        startActivity(new Intent(this, TelaCadastro.class));
    }

}