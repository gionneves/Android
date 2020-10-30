package app.guerreirosgames.servicos.arcondicionado;

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
import app.guerreirosgames.servicos.*;

public class ArQuatro extends AppCompatActivity{
    Button bCalendario, bHora;
    EditText tCalendario, tHora;
    private int dia, mes, ano, hora, minuto;
    ArDois ad = new ArDois();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_quatro);

        // Define os Buttons no layout em uma variavel.*
        bCalendario = (Button) findViewById(R.id.bArQuatroCalendario);
        bHora = (Button) findViewById(R.id.bArQuatroHora);

        // Define os EditText no layout em uma variavel.*
        tCalendario = (EditText) findViewById(R.id.tArQuatroCalendario);
        tHora = (EditText) findViewById(R.id.tArQuatroHora);

    }

    public void btnCalendario(View view) {
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

        public void btnHorario(View view) {
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

    public void arQuatroVolta(View view) {
        finish();
    }

    public void arQuatroAgendamento(View view) {
        startActivity(new Intent(this, Pagamento.class));
    }
}