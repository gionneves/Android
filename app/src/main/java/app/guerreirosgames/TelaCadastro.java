package app.guerreirosgames;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.cadastro.Databasehelper;
import app.guerreirosgames.cadastro.Usuario;

public class TelaCadastro extends AppCompatActivity {
    ToggleButton aSwitch;
    EditText editText;

    Databasehelper databasehelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_cadastre_se);

        // add button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        aSwitch = findViewById(R.id.switch_pessoa);
        editText = findViewById(R.id.cadastro_CPF_CNPJ);
        editText.setHint("132.456.789-09");

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aSwitch.isChecked()) {
                    editText.setHint("123.456.789/0001-09");
                } else {
                    editText.setHint("123.456.789-09");
                }
            }
        });
    }

    /***
     * Esse item serve para retornar a tela home, ou no caso a tela de login. Esta declarado como
     * que faça os botão de atalho do android funcione quando aperte para voltar.
     *
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    /***
     * Função que vai em um botão que simplismente fecha a tela de cadastro.
     */

    public void fechar(View view) {
        this.finish();
    }

    /**
     * Função que tem um DB que cadastra e salva os dados do usuarios quando cadastrados. Faz
     * ligação via SQL (Não se sabe ao certo se será MySQL ou MongoDB [NoSQL]). onde ficará falvo
     * todas as informações presentes em um só db
     */

    public void cadastrar(View view) {
        EditText nome = (EditText) findViewById(R.id.cadastro_nome);
        EditText CPF_CNPJ = (EditText) findViewById(R.id.cadastro_CPF_CNPJ);
        EditText RG = (EditText) findViewById(R.id.cadastro_RG);
        EditText data_nascimento = (EditText) findViewById(R.id.cadastro_nascimento);
        EditText CEP = (EditText) findViewById(R.id.cadastro_CEP);
        EditText endereco = (EditText) findViewById(R.id.cadastro_endereco);
        EditText bairro = (EditText) findViewById(R.id.cadastro_bairro);
        EditText municipio = (EditText) findViewById(R.id.cadastro_municipio);
        EditText estado = (EditText) findViewById(R.id.cadastro_estado);
        EditText complemento = (EditText) findViewById(R.id.cadastro_complemento);
        EditText telefone_residencial = (EditText) findViewById(R.id.cadastro_telefone_residencial);
        EditText telefone_celular = (EditText) findViewById(R.id.cadastro_telefone_celular);
        EditText email = (EditText) findViewById(R.id.cadastro_email);
        EditText confirmar_email = (EditText) findViewById(R.id.cadastro_confirmar_email);
        EditText senha = (EditText) findViewById(R.id.cadastro_senha);
        EditText confirmar_senha = (EditText) findViewById(R.id.cadastro_confirmar_senha);

        String sEmail = email.getText().toString();
        String sSenha = senha.getText().toString();

        Usuario user = new Usuario();

        if (sEmail.equals(null)) {
            email.setShadowLayer(4,1,1,990000);
        } else {
            user.setEmail(sEmail);
            System.out.println("FOI!");
        }
        if (sSenha != "") {
            user.setSenha(sSenha);
            System.out.println("FOI SENHA!");
        }

    }

}