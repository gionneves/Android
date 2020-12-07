package app.guerreirosgames.servicos.helpdesk;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.Agendamento;

public class HdUm extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hd_um);
    }

    //--------------------PRIMEIRA TELA FUN---------------------------.*

    public void helpdesk_irCasa(View view) {
        setContentView(R.layout.activity_hd_um_casa);
    }

    public void helpdesk_onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.helpdesk_casa_CB1:
                cb1 = (CheckBox) findViewById(R.id.helpdesk_casa_CB1);
                if (checked) {
                    cb1.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb1.setTextColor(getColor(R.color.white));
                } else {
                    cb1.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb1.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_casa_CB2:
                cb2 = (CheckBox) findViewById(R.id.helpdesk_casa_CB2);
                if (checked) {
                    cb2.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb2.setTextColor(getColor(R.color.white));
                } else {
                    cb2.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb2.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_casa_CB3:
                cb3 = (CheckBox) findViewById(R.id.helpdesk_casa_CB3);
                if (checked) {
                    cb3.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb3.setTextColor(getColor(R.color.white));
                } else {
                    cb3.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb3.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_casa_CB4:
                cb4 = (CheckBox) findViewById(R.id.helpdesk_casa_CB4);
                if (checked) {
                    cb4.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb4.setTextColor(getColor(R.color.white));
                } else {
                    cb4.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb4.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_casa_CB5:
                cb5 = (CheckBox) findViewById(R.id.helpdesk_casa_CB5);
                if (checked) {
                    cb5.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb5.setTextColor(getColor(R.color.white));
                } else {
                    cb5.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb5.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_casa_CB6:
                cb6 = (CheckBox) findViewById(R.id.helpdesk_casa_CB6);
                if (checked) {
                    cb6.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb6.setTextColor(getColor(R.color.white));
                } else {
                    cb6.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb6.setTextColor(getColor(R.color.black));
                }
                break;
        }
    }

    // ------------------------SEGUNDA TELA FUN----------------------------------

    public void helpdesk_irEmpresa(View view) {
        setContentView(R.layout.activity_hd_um_empresa);
    }

    public void helpdesk_visia_onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.helpdesk_empresa_CB1:
                cb1 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB1);
                if (checked) {
                    cb1.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb1.setTextColor(getColor(R.color.white));
                } else {
                    cb1.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb1.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_empresa_CB2:
                cb2 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB2);
                if (checked) {
                    cb2.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb2.setTextColor(getColor(R.color.white));
                } else {
                    cb2.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb2.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_empresa_CB3:
                cb3 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB3);
                if (checked) {
                    cb3.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb3.setTextColor(getColor(R.color.white));
                } else {
                    cb3.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb3.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_empresa_CB4:
                cb4 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB4);
                if (checked) {
                    cb4.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb4.setTextColor(getColor(R.color.white));
                } else {
                    cb4.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb4.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_empresa_CB5:
                cb5 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB5);
                if (checked) {
                    cb5.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb5.setTextColor(getColor(R.color.white));
                } else {
                    cb5.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb5.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_empresa_CB6:
                cb6 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB6);
                if (checked) {
                    cb6.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb6.setTextColor(getColor(R.color.white));
                } else {
                    cb6.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb6.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.helpdesk_empresa_CB7:
                cb7 = (CheckBox) findViewById(R.id.helpdesk_empresa_CB7);
                if (checked) {
                    cb7.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb7.setTextColor(getColor(R.color.white));
                } else {
                    cb7.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb7.setTextColor(getColor(R.color.black));
                }
                break;
        }
    }


    //-------------------------------------------------------------------------.*

    public void helpdesk_voltar_layout(View view) {
        setContentView(R.layout.activity_hd_um);
    }

    public void helpdesk_voltar(View view) {
        finish();
    }

    public void helpdesk_irAgendamento(View view) {
        startActivity(new Intent(this , Agendamento.class));
    }

}