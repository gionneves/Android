package app.guerreirosgames.servicos.celular;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import javax.security.auth.callback.CallbackHandler;

import app.guerreirosgames.R;

import static android.graphics.Color.argb;

public class CelUm extends AppCompatActivity {

    CheckBox td, tt, sprox, bt, wf, btn, btnp, car, autof, autofa, mic, camf, camt, conc, bat, bCover, dig;
    AutoCompleteTextView marca, modelo;
    String branch;

    String[] marcas = {"Samsung" , "Apple" , "Motorola" , "LG" , "Sony" , "Xiaomi" , "Cubot"};
    ArrayAdapter<String> adapterMarcas;

    /**
     * MODELOS.*
     */

    String[] Samsung = {"Galaxy A01" , "Galaxy A10" , "Galaxy A10s" , "Galaxy A11" , "Galaxy A20" ,
            "Galaxy A20s" , "Galaxy A21s" , "Galaxy A30" , "Galaxy A30s" , "Galaxy A31" , "Galaxy A50" ,
            "Galaxy A51" , "Galaxy A70" , "Galaxy A71" , "Galaxy A80" , "Galaxy A81" , "Galaxy M10" , "Galaxy M20" ,
            "Galaxy M30" , "Galaxy M31" , "Galaxy S6" , "Galaxy S6 Edge" , "Galaxy S6 Edge+" , "Galaxy S7" ,
            "Galaxy S7 Edge" , "Galaxy S8" , "Galaxy S8 Plus" , "Galaxy S9" , "Galaxy S9 Plus" ,
            "Galaxy S10" , "Galaxy S10 Plus" , "Galaxy S10e" , "Galaxy S20" , "Galaxy S20 Plus" ,
            "Galaxy S20 Ultra" , "Galaxy Note 5" , "Galaxy Note 7" , "Galaxy Note 8" , "Galaxy Note 9" ,
            "Galaxy Note 10" , "Galaxy Note 10 Plus" , "Galaxy Note 10 Lite" , "Galaxy Note 20" ,
            "Galaxy Note 20 Ultra"};
    ArrayAdapter<String> adapterSamsung;

    String[] Apple = {"iPhone 4" , "iPhone 4s" , "iPhone 5" , "iPhone 5s" , "iPhone 5c" , "iPhone SE (1ª gen)" ,
            "iPhone 6" , "iPhone 6 Plus" , "iPhone 6s" , "iPhone 6s Plus" , "iPhone 7" , "iPhone 7 Plus" , "iPhone 8" ,
            "iPhone 8 Plus" , "iPhone X" , "iPhone XR" , "iPhone XS" , "iPhone XS Max" , "iPhone 11" ,
            "iPhone 11 Pro" , "iPhone 11 Pro Max" , "iPhone SE (2ª gen)" , "iPhone 12" , "iPhone 12 Mini" ,
            "iPhone 12 Pro" , "iPhone 12 Pro Max"};
    ArrayAdapter<String> adapterApple;

    String[] Motorola = {"Moto G7" , "Moto G7 Play" , "Moto G7 Power" , "Moto G8" , "Moto G8 Play" ,
            "Moto G8 Plus" , "Moto G8 Power" , "Moto G9 Play" , "Moto G9 Plus"};
    ArrayAdapter<String> adapterMotorola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_um);

        marca = (AutoCompleteTextView) findViewById(R.id.celUm_Marca);

        adapterMarcas = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , marcas);
        marca.setThreshold(1);
        marca.setAdapter(adapterMarcas);

        modelo = (AutoCompleteTextView) findViewById(R.id.celUm_Modelo);
        modelo.setHint("iPhone XR; iPhone 8 Plus; ...");
        adapterApple = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Apple);
        modelo.setThreshold(1);
        modelo.setAdapter(adapterApple);

    }

    public void branchSelected() {
        marca = (AutoCompleteTextView) findViewById(R.id.celUm_Marca);
        branch = marca.getText().toString();

        branch = branch.toLowerCase();

        switch (branch) {
            case "samsung":
                modelo = (AutoCompleteTextView) findViewById(R.id.celUm_Modelo);
                modelo.setHint("Galaxy A01; Galaxy S10; ...");
                adapterSamsung = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Samsung);
                modelo.setThreshold(1);
                modelo.setAdapter(adapterSamsung);
                break;
            case "apple":
                modelo = (AutoCompleteTextView) findViewById(R.id.celUm_Modelo);
                modelo.setHint("iPhone XR; iPhone 8 Plus; ...");
                adapterApple = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Apple);
                modelo.setThreshold(1);
                modelo.setAdapter(adapterApple);
                break;
            case "motorola":
                modelo = (AutoCompleteTextView) findViewById(R.id.celUm_Modelo);
                modelo.setHint("iPhone XR; iPhone 8 Plus; ...");
                adapterMotorola = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Motorola);
                modelo.setThreshold(1);
                modelo.setAdapter(adapterMotorola);
                break;
            default:
        }
    }


    public void onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.celUm_TelaDisplay: // tela display
                td = (CheckBox) findViewById(R.id.celUm_TelaDisplay);
                if (checked) {
                    td.setBackgroundColor(getColor(R.color.green_holder_full));
                    td.setTextColor(getColor(R.color.white));
                } else {
                    td.setBackgroundColor(getColor(R.color.green_holder));
                    td.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_TelaTouch: // tela Touch
                tt = (CheckBox) findViewById(R.id.celUm_TelaTouch);
                if (checked) {
                    tt.setBackgroundColor(getColor(R.color.green_holder_full));
                    tt.setTextColor(getColor(R.color.white));

                } else {
                    tt.setBackgroundColor(getColor(R.color.green_holder));
                    tt.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_SensorProx: // Sensor de proximidade
                sprox = (CheckBox) findViewById(R.id.celUm_SensorProx);
                if (checked) {
                    sprox.setBackgroundColor(getColor(R.color.green_holder_full));
                    sprox.setTextColor(getColor(R.color.white));

                } else {
                    sprox.setBackgroundColor(getColor(R.color.green_holder));
                    sprox.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Bluetooth: // Bluetooth
                bt = (CheckBox) findViewById(R.id.celUm_Bluetooth);
                if (checked) {
                    bt.setBackgroundColor(getColor(R.color.green_holder_full));
                    bt.setTextColor(getColor(R.color.white));

                } else {
                    bt.setBackgroundColor(getColor(R.color.green_holder));
                    bt.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_WiFi: // Wi-Fi
                wf = (CheckBox) findViewById(R.id.celUm_WiFi);
                if (checked) {
                    wf.setBackgroundColor(getColor(R.color.green_holder_full));
                    wf.setTextColor(getColor(R.color.white));

                } else {
                    wf.setBackgroundColor(getColor(R.color.green_holder));
                    wf.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Botoes_MaMe: // Botões de volume
                btn = (CheckBox) findViewById(R.id.celUm_Botoes_MaMe);
                if (checked) {
                    btn.setBackgroundColor(getColor(R.color.green_holder_full));
                    btn.setTextColor(getColor(R.color.white));

                } else {
                    btn.setBackgroundColor(getColor(R.color.green_holder));
                    btn.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Botao_Power: // Botão POWER
                btnp = (CheckBox) findViewById(R.id.celUm_Botao_Power);
                if (checked) {
                    btnp.setBackgroundColor(getColor(R.color.green_holder_full));
                    btnp.setTextColor(getColor(R.color.white));

                } else {
                    btnp.setBackgroundColor(getColor(R.color.green_holder));
                    btnp.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Carcaca: // Carcaça do aparelho
                car = (CheckBox) findViewById(R.id.celUm_Carcaca);
                if (checked) {
                    car.setBackgroundColor(getColor(R.color.green_holder_full));
                    car.setTextColor(getColor(R.color.white));

                } else {
                    car.setBackgroundColor(getColor(R.color.green_holder));
                    car.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_AutoFalante: // Auto falante
                autof = (CheckBox) findViewById(R.id.celUm_AutoFalante);
                if (checked) {
                    autof.setBackgroundColor(getColor(R.color.green_holder_full));
                    autof.setTextColor(getColor(R.color.white));

                } else {
                    autof.setBackgroundColor(getColor(R.color.green_holder));
                    autof.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_AutoFalanteAuricular: // Auto falante auricular
                autofa = (CheckBox) findViewById(R.id.celUm_AutoFalanteAuricular);
                if (checked) {
                    autofa.setBackgroundColor(getColor(R.color.green_holder_full));
                    autofa.setTextColor(getColor(R.color.white));

                } else {
                    autofa.setBackgroundColor(getColor(R.color.green_holder));
                    autofa.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Microfone: // microfone
                mic = (CheckBox) findViewById(R.id.celUm_Microfone);
                if (checked) {
                    mic.setBackgroundColor(getColor(R.color.green_holder_full));
                    mic.setTextColor(getColor(R.color.white));

                } else {
                    mic.setBackgroundColor(getColor(R.color.green_holder));
                    mic.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_CameraFrontal: // câmera Frontal
                camf = (CheckBox) findViewById(R.id.celUm_CameraFrontal);
                if (checked) {
                    camf.setBackgroundColor(getColor(R.color.green_holder_full));
                    camf.setTextColor(getColor(R.color.white));

                } else {
                    camf.setBackgroundColor(getColor(R.color.green_holder));
                    camf.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_CameraTraseira: // câmera traseira
                camt = (CheckBox) findViewById(R.id.celUm_CameraTraseira);
                if (checked) {
                    camt.setBackgroundColor(getColor(R.color.green_holder_full));
                    camt.setTextColor(getColor(R.color.white));

                } else {
                    camt.setBackgroundColor(getColor(R.color.green_holder));
                    camt.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_ConectorCarga: // Conector de carga
                conc = (CheckBox) findViewById(R.id.celUm_ConectorCarga);
                if (checked) {
                    conc.setBackgroundColor(getColor(R.color.green_holder_full));
                    conc.setTextColor(getColor(R.color.white));

                } else {
                    conc.setBackgroundColor(getColor(R.color.green_holder));
                    conc.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Bateria: // Bateria
                bat = (CheckBox) findViewById(R.id.celUm_Bateria);
                if (checked) {
                    bat.setBackgroundColor(getColor(R.color.green_holder_full));
                    bat.setTextColor(getColor(R.color.white));

                } else {
                    bat.setBackgroundColor(getColor(R.color.green_holder));
                    bat.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_TampaTraseira: // Traseira
                bCover = (CheckBox) findViewById(R.id.celUm_TampaTraseira);
                if (checked) {
                    bCover.setBackgroundColor(getColor(R.color.green_holder_full));
                    bCover.setTextColor(getColor(R.color.white));

                } else {
                    bCover.setBackgroundColor(getColor(R.color.green_holder));
                    bCover.setTextColor(getColor(R.color.black));

                }
                break;

            case R.id.celUm_Digital: // DIGITAL
                dig = (CheckBox) findViewById(R.id.celUm_Digital);
                if (checked) {
                    dig.setBackgroundColor(getColor(R.color.green_holder_full));
                    dig.setTextColor(getColor(R.color.white));

                } else {
                    dig.setBackgroundColor(getColor(R.color.green_holder));
                    dig.setTextColor(getColor(R.color.black));

                }
                break;

            default:

                break;
        }


    }

    public void close(View view) {
        finish();
    }
}
