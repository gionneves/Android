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
    private String HOST = "http://192.168.0.32/guerreirosLogin";
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
     * Função abaixo serve para coletar e armazenar cada campo em um banco de dados MySQL onde terá
     * uma conexão via PHP ou ate mesmo direta se possivel, ainda estou estudando isso, mas pretendo
     * bolar para frente.*
     */

    public void cadastro_btnCadastrar(View view) {


        Intent intent = new Intent(this , MainActivity.class);
        byte cadastroContador = 0;

        /**
         * Coleta e armazena o nome.*
         */
        EditText nome = findViewById(R.id.cadastro_nome);
        String sNome = nome.getText().toString();

        if (sNome.equals("")) {
            nome.setBackgroundResource(R.drawable.background_error);


        } else {
            nome.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o CPF ou o CNPJ da pessoa.*
         */
        EditText CPF_CNPJ = findViewById(R.id.cadastro_CPF_CNPJ);
        String sCPF_CNPJ = CPF_CNPJ.getText().toString();

        if (sCPF_CNPJ.equals("")) {
            CPF_CNPJ.setBackgroundResource(R.drawable.background_error);

        } else {
            CPF_CNPJ.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o RG.*
         */
        EditText RG = findViewById(R.id.cadastro_RG);
        String sRG = RG.getText().toString();

        if (sRG.equals("")) {
            RG.setBackgroundResource(R.drawable.background_error);

        } else {
            RG.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena a data de nascimento da pessoa.*
         */
        EditText data_nascimento = findViewById(R.id.cadastro_nascimento);
        String sData_nascimento = data_nascimento.getText().toString();

        if (sData_nascimento.equals("")) {
            data_nascimento.setBackgroundResource(R.drawable.background_error);

        } else {
            data_nascimento.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o CEP.*
         */
        EditText CEP = findViewById(R.id.cadastro_CEP);
        String sCEP = CEP.getText().toString();

        if (sCEP.equals("")) {
            CEP.setBackgroundResource(R.drawable.background_error);

        } else {
            CEP.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o endereço.*
         */
        EditText endereco = findViewById(R.id.cadastro_endereco);
        String sEndereco = endereco.getText().toString();

        if (sEndereco.equals("")) {
            endereco.setBackgroundResource(R.drawable.background_error);

        } else {
            endereco.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o Bairro.*
         */
        EditText bairro = findViewById(R.id.cadastro_bairro);
        String sBairro = bairro.getText().toString();

        if (sBairro.equals("")) {
            bairro.setBackgroundResource(R.drawable.background_error);

        } else {
            bairro.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o Municipio.*
         */
        EditText municipio = findViewById(R.id.cadastro_municipio);
        String sMunicipio = municipio.getText().toString();

        if (sMunicipio.equals("")) {
            municipio.setBackgroundResource(R.drawable.background_error);

        } else {
            municipio.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o Estado.*
         */
        EditText estado = findViewById(R.id.cadastro_estado);
        String sEstado = estado.getText().toString();

        if (sEstado.equals("")) {
            estado.setBackgroundResource(R.drawable.background_error);

        } else {
            estado.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o Complemento de onde a pessoa mora.*
         */
        EditText complemento = findViewById(R.id.cadastro_complemento);
        String sComplemento = complemento.getText().toString();

        if (sComplemento.equals("")) {
            complemento.setBackgroundResource(R.drawable.background_error);

        } else {
            complemento.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o Telefone residencial informado.*
         */
        EditText telefone_residencial = findViewById(R.id.cadastro_telefone_residencial);
        String sTelefone_residencial = telefone_residencial.getText().toString();

        if (sTelefone_residencial.equals("")) {

        } else {
            telefone_residencial.setBackgroundResource(R.drawable.background_normal);

        }

        /**
         * Coleta e armazena o Telefone celular informado.*
         */
        EditText telefone_celular = findViewById(R.id.cadastro_telefone_celular);
        String sTelefone_celular = telefone_celular.getText().toString();

        if (sTelefone_celular.equals("")) {
            telefone_celular.setBackgroundResource(R.drawable.background_error);

        } else {
            telefone_celular.setBackgroundResource(R.drawable.background_normal);

            cadastroContador++;
        }

        /**
         * Coleta e armazena o Email, junto abaixo tem outro estado de comparação para saber se o
         * que está escrito no campo "Email" é o mesmo do que está escrito no campo "Verificar Email".*
         */
        EditText email = findViewById(R.id.cadastro_email);
        String sEmail = email.getText().toString();

        EditText confirmar_email = findViewById(R.id.cadastro_confirmar_email);
        String sConfirmar_email = confirmar_email.getText().toString();


        if (sEmail.equals("")) {
            email.setBackgroundResource(R.drawable.background_error);

        } else {
            email.setBackgroundResource(R.drawable.background_normal);
        }

        if (sConfirmar_email.equals(sEmail)) {
            confirmar_email.setBackgroundResource(R.drawable.background_normal);
            intent.putExtra("EMAIL_CADASTRO" , sEmail);
            cadastroContador++;
        } else {
            confirmar_email.setBackgroundResource(R.drawable.background_error);

        }

        /**
         * Coleta e armazena a Senha, junto abaixo tem outro estado de comparação para saber se a
         * senha escrita no campo "Senha" é a mesma do campo "Verificar a Senha".*
         */
        EditText senha = findViewById(R.id.cadastro_senha);
        EditText confirmar_senha = findViewById(R.id.cadastro_confirmar_senha);

        String sSenha = senha.getText().toString();
        String sConfrimar_senha = confirmar_senha.getText().toString();

        if (sSenha.equals("")) {
            senha.setBackgroundResource(R.drawable.background_error);

        } else {
            senha.setBackgroundResource(R.drawable.background_normal);

        }

        if (sConfrimar_senha.equals(sSenha)) {
            confirmar_senha.setBackgroundResource(R.drawable.background_normal);
            intent.putExtra("SENHA_CADASTRO" , sSenha);

            cadastroContador++;
        } else {
            confirmar_senha.setBackgroundResource(R.drawable.background_error);

        }


        String URL = HOST + "/cadastrar.php";

        if (sSenha.equals(sConfrimar_senha) && sEmail.equals(sConfirmar_email) && !sCPF_CNPJ.isEmpty()) {

            Ion.with(TelaCadastro.this)
                    .load(URL)
                    .setBodyParameter("nome_app" , sNome)
                    .setBodyParameter("cpf_app" , sCPF_CNPJ)
                    .setBodyParameter("rg_app" , sRG)
                    .setBodyParameter("nascimento_app" , sData_nascimento)
                    .setBodyParameter("cep_app" , sCEP)
                    .setBodyParameter("endereco_app" , sEndereco)
                    .setBodyParameter("bairro_app" , sBairro)
                    .setBodyParameter("municipio_app" , sMunicipio)
                    .setBodyParameter("estado_app" , sEstado)
                    .setBodyParameter("complemento_app" , sComplemento)
                    .setBodyParameter("foneResidencia_app" , sTelefone_residencial)
                    .setBodyParameter("foneCelular_app" , sTelefone_celular)
                    .setBodyParameter("email_app" , sEmail)
                    .setBodyParameter("senha_app" , sSenha)


                    .asJsonObject()
                    .setCallback(new FutureCallback<JsonObject>() {
                        @Override
                        public void onCompleted(Exception e , JsonObject result) {

                            try {
                                String RETORNO = result.get("CADASTRO").getAsString();

                                if (RETORNO.equals("CPF_ERRO")) {
                                    Toast.makeText(TelaCadastro.this , "Oops! Esse CPF já é cadastado." , Toast.LENGTH_SHORT).show();
                                } else if (RETORNO.equals("SUCESSO")) {
                                    Toast.makeText(TelaCadastro.this , "CADASTRADO COM SUCESSO!" , Toast.LENGTH_SHORT).show();
                                    finish();
                                } else {
                                    Toast.makeText(TelaCadastro.this , "Error!" , Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception erro) {
                                Toast.makeText(TelaCadastro.this , "Error: " + erro , Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

        } else {
            Toast.makeText(this , "Há campos em branco!" , Toast.LENGTH_SHORT).show();
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