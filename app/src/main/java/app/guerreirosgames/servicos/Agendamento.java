package app.guerreirosgames.servicos;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.arcondicionado.ArDois;

public class Agendamento extends AppCompatActivity {
    Button bCalendario, bHora;
    EditText tCalendario, tHora;
    private int dia, mes, ano, hora, minuto;
    private String marca, modelo, tipo, info_extra;
    ArDois ad = new ArDois();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);

        /** Recebe as informações da ativity anterior para essa de agendamento
         *  Serve principalmente para poder levar as informações para o arquivo "Final_OS.java"
         *  Temporariamente estara bloqueada para não causar erros durante a fase de testes, nisso.*
         */

        /**
         Intent intent = getIntent();
         marca = intent.getStringExtra("");
         modelo = intent.getStringExtra("");
         tipo = intent.getStringExtra("");
         info_extra = intent.getStringExtra("");.*
         */

        /** Define os Buttons no layout em uma variavel.* */
        bCalendario = findViewById(R.id.bAgendamentoCalendario);
        bHora = findViewById(R.id.bArQuatroHora);

        /** Define os EditText no layout em uma variavel.* */
        tCalendario = findViewById(R.id.tAgendamentoCalendario);
        tHora = findViewById(R.id.tArQuatroHora);

    }

    /**
     * Esse botão serve para aparecer o calendario e registar no EditText a data que vai querer ser
     * marcado a O.S. Isso também será enviado para o banco de dados onde ira armazenar tudo sobre
     * horario e local.*
     */

    public void agendamento_btnCalendario(View view) {
        final Calendar cale = Calendar.getInstance();
        dia = cale.get(Calendar.DAY_OF_MONTH);
        mes = cale.get(Calendar.MONTH);
        ano = cale.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tCalendario.setText(dayOfMonth + "/" + (month + 1) + "/" + year);

            }
        }, ano, mes, dia);
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
        datePickerDialog.show();

    }

    /**
     * Esse botão serve para mostrar o relogio e marcar no EditText o horario que vai poder ser feito a
     * visita da O.S. também será marcado no banco de dados.*
     */

    public void agendamento_btnHorario(View view) {
        final Calendar cale = Calendar.getInstance();
        hora = cale.get(Calendar.HOUR_OF_DAY);
        minuto = cale.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tHora.setText(hourOfDay + ":" + minute);
            }
        }, hora, minuto, true);
        timePickerDialog.show();
    }


    /**
     * Botões padrão de continuar e voltar, com diferença que o de agendamento ira armazenar a data e hora.*
     */

    public void agendamento_btnVolta(View view) {
        finish();
    }

    public void agendamento_btnAgendamento(View view) {
        Intent intent = new Intent(this, Pagamento.class);

        intent.putExtra("MARCA_AGENDAMENTO", marca);
        intent.putExtra("MODELO_AGENDAMENTO", modelo);
        intent.putExtra("TIPO_AGENDAMENTO", tipo);
        intent.putExtra("INFOEXTRA_AGENDAMENTO", info_extra);

        startActivity(intent);
    }
}