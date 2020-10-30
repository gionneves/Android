package app.guerreirosgames;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import app.guerreirosgames.cadastro.Usuario;

public class TelaCadastro extends AppCompatActivity {
    ToggleButton aSwitch;
    EditText editText, nascimento;
    private int dia, mes, ano;

    public final static String chave = "guerreirosgames";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_cadastre_se);

        // Adiciona botão de volta.*
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Define a data de nascimento em uma variavel.*
        nascimento = (EditText) findViewById(R.id.cadastro_nascimento);

        // Faz mudar de CPF para CNPJ.*
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
        });;
    }

    /**
     * Esse item serve para retornar a tela home, ou no caso a tela de login. Esta declarado como
     * que faça os botão de atalho do android funcione quando aperte para voltar.*
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Função que vai em um botão que simplismente fecha a tela de cadastro.*
     */

    public void fechar(View view) {
        this.finish();
    }

    /**
     * Função que tem um DB que cadastra e salva os dados do usuarios quando cadastrados. Faz
     * ligação via SQL (Não se sabe ao certo se será MySQL ou MongoDB [NoSQL]). onde ficará falvo
     * todas as informações presentes em um só db.*
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

        /**
         * Após definir as funções estou utilizando metodos para poder trandormar em string e pegar
         * o texto e entregara para uma variavel String.
         * Entretnato, estou vendo que pode ser mudado para utilzar uma string talvez.*
         */

        String sNome = nome.getText().toString();
        String sCPF_CNPJ = CPF_CNPJ.getText().toString();
        String sRG = RG.getText().toString();
        String sData_nascimento = data_nascimento.getText().toString();
        String sCEP = CEP.getText().toString();
        String sEndereco = endereco.getText().toString();
        String sBairro = bairro.getText().toString();
        String sMunicipio = municipio.getText().toString();
        String sEstado = estado.getText().toString();
        String sComplemento = complemento.getText().toString();
        String sTelefone_residencial = telefone_residencial.getText().toString();
        String sTelefone_celular = telefone_celular.getText().toString();
        String sEmail = email.getText().toString();
        String sConfirmar_email = confirmar_email.getText().toString();
        String sSenha = senha.getText().toString();
        String sConfrimar_senha = confirmar_senha.getText().toString();

        Usuario user = new Usuario();
        /**
         *
         */
        Intent intent = new Intent(this, Usuario.class);
        intent.putExtra(chave, sNome);


        /**
         * Após Armazenar tudo em variavéis, tem um verificador para trocar as bordas e depois
         * enviar para o banco de dados as informações obrigatorias e não obrigatorias, agora nisso
         * será feita a conexão com o banco de dados.*
         */

        // nome
        if (sNome.equals("")) {
            nome.setBackgroundResource(R.drawable.background_error);


        } else {
            nome.setBackgroundResource(R.drawable.background_normal);
            user.setNome(sNome);
        }

        // CPF_CNPJ
        if (sCPF_CNPJ.equals("")) {
            CPF_CNPJ.setBackgroundResource(R.drawable.background_error);

        } else {
            CPF_CNPJ.setBackgroundResource(R.drawable.background_normal);

        }

        // RG
        if (sRG.equals("")) {
            RG.setBackgroundResource(R.drawable.background_error);

        } else {
            RG.setBackgroundResource(R.drawable.background_normal);

        }

        // data nascimentp
        if (sData_nascimento.equals("")) {
            data_nascimento.setBackgroundResource(R.drawable.background_error);

        } else {
            data_nascimento.setBackgroundResource(R.drawable.background_normal);

        }

        // CEP
        if (sCEP.equals("")){
            CEP.setBackgroundResource(R.drawable.background_error);

        } else {
            CEP.setBackgroundResource(R.drawable.background_normal);

        }

        // endereco
        if (sEndereco.equals("")){
            endereco.setBackgroundResource(R.drawable.background_error);

        } else {
            endereco.setBackgroundResource(R.drawable.background_normal);

        }

        // bairro
        if (sBairro.equals("")){
            bairro.setBackgroundResource(R.drawable.background_error);

        } else {
            bairro.setBackgroundResource(R.drawable.background_normal);

        }

        // municipio
        if (sMunicipio.equals("")){
            municipio.setBackgroundResource(R.drawable.background_error);

        } else {
            municipio.setBackgroundResource(R.drawable.background_normal);

        }

        // estado
        if (sEstado.equals("")){
            estado.setBackgroundResource(R.drawable.background_error);

        } else {
            estado.setBackgroundResource(R.drawable.background_normal);

        }

        // complemento
        if (sComplemento.equals("")){
            complemento.setBackgroundResource(R.drawable.background_error);

        } else {
            complemento.setBackgroundResource(R.drawable.background_normal);

        }

        // Telefone residencial
        if (sTelefone_residencial.equals("")){

        } else {
            telefone_residencial.setBackgroundResource(R.drawable.background_normal);

        }

        // Telefone celular
        if (sTelefone_celular.equals("")){
            telefone_celular.setBackgroundResource(R.drawable.background_error);

        } else {
            telefone_celular.setBackgroundResource(R.drawable.background_normal);

        }

        // email
        if (sEmail.equals("")) {
            email.setBackgroundResource(R.drawable.background_error);

        } else {
            email.setBackgroundResource(R.drawable.background_normal);

        }

        // confirmar email
        if (sConfirmar_email.equals(sEmail)){
            confirmar_email.setBackgroundResource(R.drawable.background_normal);

        } else {
            confirmar_email.setBackgroundResource(R.drawable.background_error);

        }

        // senha
        if (sSenha.equals("")) {
            senha.setBackgroundResource(R.drawable.background_error);

        } else {
            senha.setBackgroundResource(R.drawable.background_normal);

        }

        // confirmar senha
        if (sConfrimar_senha.equals(sSenha)){
            confirmar_senha.setBackgroundResource(R.drawable.background_normal);

        } else {
            confirmar_senha.setBackgroundResource(R.drawable.background_error);

        }

    }

    /**
     * A função abaixo permite que troque a data de nascimento apartir do calandario do android
     * sem precisar digitar, mas caso queira é possivel.*
     */

    public void nascimento(View view) {
        final Calendar cale = Calendar.getInstance();
        dia = cale.get(Calendar.DAY_OF_MONTH);
        mes = cale.get(Calendar.MONTH);
        ano = cale.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                nascimento.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }
        }, ano, mes, dia);
        datePickerDialog.show();
    }
}