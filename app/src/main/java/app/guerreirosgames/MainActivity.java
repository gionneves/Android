package app.guerreirosgames;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class MainActivity extends AppCompatActivity {

    private int unlock_debug = 0;
    private Button btn_debug;

    private String HOST = "http://192.168.0.251/guerreiros";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Função de ir para a tela de cadastro já predefinido.*
     */
    public void login_btnTelaCadastro(View view) {
        startActivity(new Intent(this , TelaCadastro.class));
    }

    /**
     * Função para ir a tela principal, após o login. onde ficará o aplicativo principal.*
     */
    public void login_btnTelaMain(View view) {

        EditText login = findViewById(R.id.loginGetEmail);
        String log = login.getText().toString();
        EditText password = findViewById(R.id.loginGetPass);
        String pass = password.getText().toString();

        Intent intent = new Intent(this , TelaPrincipal.class);

        String URL = HOST + "/logar.php";
        if (log.isEmpty() || pass.isEmpty()) {
            Toast.makeText(this , "Há um campo em branco!" , Toast.LENGTH_LONG).show();
        } else {

            Ion.with(MainActivity.this)
                    .load(URL)
                    .setBodyParameter("email_app" , log)
                    .setBodyParameter("senha_app" , pass)
                    .asJsonObject()
                    .setCallback(new FutureCallback<JsonObject>() {
                        @Override
                        public void onCompleted(Exception e , JsonObject result) {
                            try {
                                String RETORNO = result.get("LOGIN").getAsString();

                                if (RETORNO.equals("SUCESSO")) {
                                    startActivity(intent);
                                } else if (RETORNO.equals("ERRO")) {
                                    Toast.makeText(MainActivity.this , "Email ou senha incorretos." , Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(MainActivity.this , "OUTRO ERRO OCORREU!" , Toast.LENGTH_SHORT).show();
                                }

                            } catch (Exception erro) {
                                Toast.makeText(MainActivity.this , "Erro: " + erro , Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }
    }

    /**
     * Onde foi definido função para o TextView para quando clicado ir para uma tela de
     * recuperação de senha que será via email onde o cliente podera torcar a senha atravez de um
     * link.*
     */

    public void login_esqueciSenha(View view) {
        startActivity(new Intent(this , TelaEsqueciSenha.class));
    }


    /**
     * Essas duas funções abaixo servem para habilitar um botão de Debug que serva para ir a ultima
     * que estou programando, sem precisar percorrer  o programa inteiro para isso.*
     */

    public void login_btnUnlockDebug(View view) {
        Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        btn_debug = findViewById(R.id.btn_debug);
        unlock_debug++;
        if (unlock_debug == 7 || unlock_debug == 17 || unlock_debug == 24) {
            try {
                btn_debug.setVisibility(View.VISIBLE);
                for (int i = 0; i < 4; ++i) {
                    v.vibrate(100);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            btn_debug.setVisibility(View.INVISIBLE);
        }
    }

    public void login_btnGoDebug(View view) {
        btn_debug = findViewById(R.id.btn_debug);
        startActivity(new Intent(this , TelaPrincipal.class));
        btn_debug.setVisibility(View.INVISIBLE);
    }
}