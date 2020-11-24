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

    CheckBox td, tt, sprox, bt, wf, btn, car, autof, autofa, mic, camf, camt, conc, bat;
    AutoCompleteTextView marca, modelo;

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
        modelo = (AutoCompleteTextView) findViewById(R.id.celUm_Modelo);


        adapterMarcas = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , marcas);
        marca.setThreshold(1);
        marca.setAdapter(adapterMarcas);

        adapterSamsung = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Samsung);
        modelo.setThreshold(1);
        modelo.setAdapter(adapterSamsung);

    }

    public void onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.celUm_TelaDisplay: // tela display
                td = (CheckBox) findViewById(R.id.celUm_TelaDisplay);
                if (checked) {
                    td.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    td.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_TelaTouch: // tela Touch
                tt = (CheckBox) findViewById(R.id.celUm_TelaTouch);
                if (checked) {
                    tt.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    tt.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_SensorProx: // Sensor de proximidade
                sprox = (CheckBox) findViewById(R.id.celUm_SensorProx);
                if (checked) {
                    sprox.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    sprox.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_Bluetooth: // Bluetooth
                bt = (CheckBox) findViewById(R.id.celUm_Bluetooth);
                if (checked) {
                    bt.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    bt.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_WiFi: // Wi-Fi
                wf = (CheckBox) findViewById(R.id.celUm_WiFi);
                if (checked) {
                    wf.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    wf.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_Botoes: // Botões de volume e power
                btn = (CheckBox) findViewById(R.id.celUm_Botoes);
                if (checked) {
                    btn.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    btn.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_Carcaca: // Carcaça do aparelho
                car = (CheckBox) findViewById(R.id.celUm_Carcaca);
                if (checked) {
                    car.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    car.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_AutoFalante: // Auto falante
                autof = (CheckBox) findViewById(R.id.celUm_AutoFalante);
                if (checked) {
                    autof.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    autof.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_AutoFalanteAuricular: // Auto falante auricular
                autofa = (CheckBox) findViewById(R.id.celUm_AutoFalanteAuricular);
                if (checked) {
                    autofa.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    autofa.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_Microfone: // microfone
                mic = (CheckBox) findViewById(R.id.celUm_Microfone);
                if (checked) {
                    mic.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    mic.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_CameraFrontal: // câmera Frontal
                camf = (CheckBox) findViewById(R.id.celUm_CameraFrontal);
                if (checked) {
                    camf.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    camf.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_CameraTraseira: // câmera traseira
                camt = (CheckBox) findViewById(R.id.celUm_CameraTraseira);
                if (checked) {
                    camt.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    camt.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_ConectorCarga: // Conector de carga
                conc = (CheckBox) findViewById(R.id.celUm_ConectorCarga);
                if (checked) {
                    conc.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    conc.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;

            case R.id.celUm_Bateria: // Bateria
                bat = (CheckBox) findViewById(R.id.celUm_Bateria);
                if (checked) {
                    bat.setBackgroundColor(argb(255 , 100 , 255 , 100));

                } else {
                    bat.setBackgroundColor(argb(0 , 100 , 255 , 100));

                }
                break;
        }


    }
}