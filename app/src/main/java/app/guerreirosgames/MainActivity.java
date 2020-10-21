package app.guerreirosgames;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Função de ir para a tela de cadastro já predefinido
     */
    public void goTelaCadastro(View view) {
        startActivity(new Intent(this, TelaCadastro.class));
    }

    /***
     * Função para ir a tela principal, após o login. onde ficará o aplicativo principal
     */
    public void goTelaMain(View view) {
        EditText login = (EditText) findViewById(R.id.loginGetEmail);
        String log = login.getText().toString();
        EditText password = (EditText) findViewById(R.id.loginGetPass);
        String pass = password.getText().toString();

        if (log.equals("admin") && pass.equals("admin")) {
            //setContentView(R.layout.activity_tela_main);
            startActivity(new Intent (this, TelaMain.class));
        }
    }

    /***
     *  Onde foi definido função para o TextView para quando clicado ir para uma tela de
     *  recuperação de senha que será via email onde o cliente podera torcar a senha atravez de um
     *  link.
     */
    public void esqueciSenha(View view) {
        startActivity(new Intent(this, TelaEsqueciSenha.class));
    }
}