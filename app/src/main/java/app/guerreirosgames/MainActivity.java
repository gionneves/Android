package app.guerreirosgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.cadastro.Usuario;
import app.guerreirosgames.servicos.*;
import app.guerreirosgames.servicos.arcondicionado.ArQuatro;


public class MainActivity extends AppCompatActivity {

    Usuario user = new Usuario();
    private int unlock_debug = 0;
    private Button btn_debug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Função de ir para a tela de cadastro já predefinido.*
     */
    public void goTelaCadastro(View view) {
        startActivity(new Intent(this, TelaCadastro.class));
    }

    /**
     * Função para ir a tela principal, após o login. onde ficará o aplicativo principal.*
     */
    public void goTelaMain(View view) {
        EditText login = (EditText) findViewById(R.id.loginGetEmail);
        String log = login.getText().toString();
        EditText password = (EditText) findViewById(R.id.loginGetPass);
        String pass = password.getText().toString();

        if (log.equals("admin@admin.com") && pass.equals("admin")) {
            //setContentView(R.layout.activity_tela_main);;
            startActivity(new Intent (this, TelaMain.class));
        }

        if(log.equals(user.getEmail()) && pass.equals(user.getSenha())) {
            startActivity(new Intent(this, TelaMain.class));
        }
    }

    /**
     *  Onde foi definido função para o TextView para quando clicado ir para uma tela de
     *  recuperação de senha que será via email onde o cliente podera torcar a senha atravez de um
     *  link.*
     */
    public void esqueciSenha(View view) {
        startActivity(new Intent(this, TelaEsqueciSenha.class));
    }


    public void actMain_unlockDebug(View view) {
        btn_debug = (Button) findViewById(R.id.btn_debug);
        unlock_debug++;
        if (unlock_debug == 7 || unlock_debug == 17 || unlock_debug == 24) {
            btn_debug.setVisibility(View.VISIBLE);
        } else {
            btn_debug.setVisibility(View.INVISIBLE);
        }
    }

    public void actMain_goDebug(View view) {
        btn_debug = (Button) findViewById(R.id.btn_debug);
        startActivity(new Intent(this, ArQuatro.class));
        btn_debug.setVisibility(View.INVISIBLE);
    }
}