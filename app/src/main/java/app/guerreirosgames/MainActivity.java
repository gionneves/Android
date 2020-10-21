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

    /**
     * Função de ir para a tela de cadastro já predefinido
     */


    public void goTelaCadastro(View v) {

        Intent intent = new Intent(MainActivity.this, TelaCadastro.class);
        startActivity(intent);
        //startActivity(new Intent(this, TelaCadastro.class));

    }

    /***
     * Função para ir a tela principal, após o login. onde ficará o aplicativo principal.
     */
    public void goTelaMain(View view) {
        //startActivity(new Intent(this, TelaMain.class));
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