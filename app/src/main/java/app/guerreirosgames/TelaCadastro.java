package app.guerreirosgames;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.Calendar;

public class TelaCadastro extends AppCompatActivity {
    ToggleButton aSwitch;
    EditText editText, nascimento;
    private String HOST = "http://192.168.0.251/guerreiros";
    private int dia, mes, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_cadastre_se);

        /**
         * Essas duas linhas após o comentario servem para criar uma seta de volta quando clicado.
         *
         * As linhas debaixo servem para o calendario e a função de trocar o CPF para CNPJ funcionarem
         * assim sempre fazendo verificação delas e atualizando em tempo real.*
         */

        /** Serve para definir a variavel "nascimento" ligada ao layout com id "cadastro_nascimento".* */
        nascimento = findViewById(R.id.cadastro_nascimento);

        /** Esses itens abaixo são o que faz mudar de CPF para CNPJ quando clicado no botão.* */
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

    public void cadastro_btnFechar(View view) {
        this.finish();
    }

    /**
     * Regista no banco de dados utilizando PHP como conexão para poder ser efeituado o processo.*
     */

    public void cadastro_btnCadastrar(View view) {


        Intent intent = new Intent(this , MainActivity.class);
        byte cadastroContador = 0;


        EditText nome = findViewById(R.id.cadastro_nome);
        String sNome = nome.getText().toString();

        EditText CPF_CNPJ = findViewById(R.id.cadastro_CPF_CNPJ);
        String sCPF_CNPJ = CPF_CNPJ.getText().toString();

        EditText RG = findViewById(R.id.cadastro_RG);
        String sRG = RG.getText().toString();

        EditText data_nascimento = findViewById(R.id.cadastro_nascimento);
        String sData_nascimento = data_nascimento.getText().toString();

        EditText CEP = findViewById(R.id.cadastro_CEP);
        String sCEP = CEP.getText().toString();

        EditText endereco = findViewById(R.id.cadastro_endereco);
        String sEndereco = endereco.getText().toString();

        EditText bairro = findViewById(R.id.cadastro_bairro);
        String sBairro = bairro.getText().toString();

        EditText municipio = findViewById(R.id.cadastro_municipio);
        String sMunicipio = municipio.getText().toString();

        EditText estado = findViewById(R.id.cadastro_estado);
        String sEstado = estado.getText().toString();

        EditText complemento = findViewById(R.id.cadastro_complemento);
        String sComplemento = complemento.getText().toString();

        EditText telefone_residencial = findViewById(R.id.cadastro_telefone_residencial);
        String sTelefone_residencial = telefone_residencial.getText().toString();

        EditText telefone_celular = findViewById(R.id.cadastro_telefone_celular);
        String sTelefone_celular = telefone_celular.getText().toString();

        EditText email = findViewById(R.id.cadastro_email);
        String sEmail = email.getText().toString();

        EditText confirmar_email = findViewById(R.id.cadastro_confirmar_email);
        String sConfirmar_email = confirmar_email.getText().toString();

        EditText senha = findViewById(R.id.cadastro_senha);
        EditText confirmar_senha = findViewById(R.id.cadastro_confirmar_senha);

        String sSenha = senha.getText().toString();
        String sConfrimar_senha = confirmar_senha.getText().toString();

        String URL = HOST + "/cadastrar.php";

        if (sSenha.equals(sConfrimar_senha) && sEmail.equals(sConfirmar_email) && !sNome.isEmpty() && !sCPF_CNPJ.isEmpty()
                && !sRG.isEmpty() && !sData_nascimento.isEmpty() && !sCEP.isEmpty() && !sEndereco.isEmpty()
                && !sBairro.isEmpty() && !sMunicipio.isEmpty() && !sEstado.isEmpty() && !sTelefone_celular.isEmpty()
                && !sEmail.isEmpty() && !sSenha.isEmpty()) {

            Ion.with(TelaCadastro.this)
                    .load(URL)
                    .setBodyParameter("nome_app" , sNome)
                    .setBodyParameter("cpf_app" , sCPF_CNPJ)
                    .setBodyParameter("rg_app" , sRG)
                    .setBodyParameter("nascimento_app" , sData_nascimento)
                    .setBodyParameter("cep_app" , sCEP)
                    .setBodyParameter("endereco_app" , sEndereco)
                    .setBodyParameter("numero_app" , "0")
                    .setBodyParameter("bairro_app" , sBairro)
                    .setBodyParameter("municipio_app" , sMunicipio)
                    .setBodyParameter("estado_app" , sEstado)
                    .setBodyParameter("complemento_app" , sComplemento)
                    .setBodyParameter("teleResidencia_app" , sTelefone_residencial)
                    .setBodyParameter("teleCelular_app" , sTelefone_celular)
                    .setBodyParameter("email_app" , sEmail)
                    .setBodyParameter("senha_app" , sSenha)

                    .asJsonObject()
                    .setCallback(new FutureCallback<JsonObject>() {
                        @Override
                        public void onCompleted(Exception e , JsonObject result) {

                            try {
                                String RETORNO = result.get("CADASTRO").getAsString();

                                if (RETORNO.equals("CPF_ERRO")) {
                                    Toast.makeText(TelaCadastro.this , "Oops! Esse CPF já é cadastado ou há campos em branco" , Toast.LENGTH_SHORT).show();
                                } else if (RETORNO.equals("SUCESSO")) {
                                    Toast.makeText(TelaCadastro.this , "CADASTRADO COM SUCESSO!" , Toast.LENGTH_SHORT).show();
                                    finish();
                                } else {
                                    Toast.makeText(TelaCadastro.this , "Error!" , Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception erro) {
                                Toast.makeText(TelaCadastro.this , "Erro: " + erro , Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

        } else {
            Toast.makeText(this , "ERRO!" , Toast.LENGTH_SHORT).show();
        }


    }

    /**
     * A função abaixo permite que troque a data de nascimento apartir do calandario do android
     * sem precisar digitar, mas caso queira é possivel.*
     */

    public void cadastro_btnNascimento(View view) {
        final Calendar cale = Calendar.getInstance();
        dia = cale.get(Calendar.DAY_OF_MONTH);
        mes = cale.get(Calendar.MONTH);
        ano = cale.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this , new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view , int year , int month , int dayOfMonth) {
                nascimento.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }
        } , ano , mes , dia);
        datePickerDialog.show();
    }
}