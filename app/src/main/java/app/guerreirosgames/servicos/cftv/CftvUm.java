package app.guerreirosgames.servicos.cftv;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;
import app.guerreirosgames.servicos.Agendamento;

public class CftvUm extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cftv_um);
    }


    public void cftv_um_onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cftv_CB1:
                cb1 = (CheckBox) findViewById(R.id.cftv_CB1);
                if (checked) {
                    cb1.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb1.setTextColor(getColor(R.color.white));
                } else {
                    cb1.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb1.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.cftv_CB2:
                cb2 = (CheckBox) findViewById(R.id.cftv_CB2);
                if (checked) {
                    cb2.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb2.setTextColor(getColor(R.color.white));
                } else {
                    cb2.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb2.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.cftv_CB3:
                cb3 = (CheckBox) findViewById(R.id.cftv_CB3);
                if (checked) {
                    cb3.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb3.setTextColor(getColor(R.color.white));
                } else {
                    cb3.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb3.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.cftv_CB4:
                cb4 = (CheckBox) findViewById(R.id.cftv_CB4);
                if (checked) {
                    cb4.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb4.setTextColor(getColor(R.color.white));
                } else {
                    cb4.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb4.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.cftv_CB5:
                cb5 = (CheckBox) findViewById(R.id.cftv_CB5);
                if (checked) {
                    cb5.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    cb5.setTextColor(getColor(R.color.white));
                } else {
                    cb5.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    cb5.setTextColor(getColor(R.color.black));
                }
                break;
            case R.id.cftv_CB6:
                cb6 = (CheckBox) findViewById(R.id.cftv_CB6);
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

    //------------------------------------------------------------------------.*

    public void cftv_proximo_layout(View view) {
    }

    public void cftv_voltar(View view) {
        finish();
    }

    public void cftv_irAgendamento(View view) {
        startActivity(new Intent(this , Agendamento.class));
    }

}