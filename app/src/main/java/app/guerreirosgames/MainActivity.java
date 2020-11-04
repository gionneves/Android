package app.guerreirosgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.servicos.Final_OS;
import app.guerreirosgames.servicos.TelaMain;



public class MainActivity extends AppCompatActivity {

    private int unlock_debug = 0;
    private Button btn_debug;

    private String userName, userPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentCadastro = getIntent();

        userName = intentCadastro.getStringExtra("EMAIL_CADASTRO");
        userPass = intentCadastro.getStringExtra("SENHA_CADASTRO");

    }

    /**
     * Função de ir para a tela de cadastro já predefinido.*
     */
    public void login_btnTelaCadastro(View view) {
        startActivity(new Intent(this, TelaCadastro.class));
    }

    /**
     * Função para ir a tela principal, após o login. onde ficará o aplicativo principal.*
     */
    public void login_btnTelaMain(View view) {

        EditText login = findViewById(R.id.loginGetEmail);
        String log = login.getText().toString();
        EditText password = findViewById(R.id.loginGetPass);
        String pass = password.getText().toString();


        if (log.equals("admin") && pass.equals("admin")) {
            //setContentView(R.layout.activity_tela_main);
            startActivity(new Intent(this, TelaMain.class));
        }

        if (log.equals(userName) && pass.equals(userPass)) {
            startActivity(new Intent(this, TelaMain.class));
        } else {
            login.setBackgroundResource(R.drawable.background_error);
            password.setBackgroundResource(R.drawable.background_error);
        }
    }

    /**
     * Onde foi definido função para o TextView para quando clicado ir para uma tela de
     * recuperação de senha que será via email onde o cliente podera torcar a senha atravez de um
     * link.*
     */
    public void login_esqueciSenha(View view) {
        startActivity(new Intent(this, TelaEsqueciSenha.class));
    }


    /**
     * Essas duas funções abaixo servem para habilitar um botão de Debug que serva para ir a ultima
     * que estou programando, sem precisar percorrer  o programa inteiro para isso.*
     */

    public void login_btnUnlockDebug(View view) {
        btn_debug = findViewById(R.id.btn_debug);
        unlock_debug++;
        if (unlock_debug == 7 || unlock_debug == 17 || unlock_debug == 24) {
            btn_debug.setVisibility(View.VISIBLE);
        } else {
            btn_debug.setVisibility(View.INVISIBLE);
        }
    }

    public void login_btnGoDebug(View view) {
        btn_debug = findViewById(R.id.btn_debug);
        startActivity(new Intent(this, Final_OS.class));
        btn_debug.setVisibility(View.INVISIBLE);
    }
}