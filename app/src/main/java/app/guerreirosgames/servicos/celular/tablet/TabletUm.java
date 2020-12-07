package app.guerreirosgames.servicos.celular.tablet;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import app.guerreirosgames.R;

public class TabletUm extends AppCompatActivity {

    public CheckBox td, tt, sprox, bt, wf, btn, btnp, car, autof, autofa, mic, camf, camt, conc, bat, bCover, dig, out;

    private String[] marcas = {"Samsung" , "OAC" , "Apple" , "Asus" , "Bright" , "Acer" , "CCE" , "Dell" , "DL" , "Foston" , "Genesis" , "HP" , "I-BAK" , "LENOXX" , "LG" , "Microboard" , "Multilaser" , "Navicity" , "Outros" , "Philco" , "Positivo" , "Powerpack" , "QBEX" , "SempToshiba" ,};
    ArrayAdapter<String> adapterMarcas;

    private String[] modeloSamsung = {"GT-P6210" , "P5100" , "N8000" , "T330" , "T116" , "P7510" , "SM-P601" , "T113" , "T331" , "SM-P550" , "T800" , "GT-N9000" , "T535" , "T311" , "GT-P5110" , "T280" , "T805M" , "GT-P1000L" , "P1010" , "OUTROS" , "T580" , "P3100" , "T211" , "GT5367" , "T110" , "T210" , "T210" , "GT5270" , "P5110" , "P3110" , "T320" , "P5200" , "P6200L" , "T111" , "GT-N5100"};
    ArrayAdapter<String> adapterSamsung;

    private String[] modeloOAC = {"OUTROS" , "MW0922" , "M2011/CA201MA" , "DA181"};
    ArrayAdapter<String> adapterOAC;

    private String[] modeloAcer = {"B1-A71" , "B1 730" , "OUTROS"};
    ArrayAdapter<String> adapterAcer;

    private String[] modeloApple = {"IPAD AIR A1474/A1475/A1476" , "IPAD MINI A1432/A1454/A1455" , "IPAD 4 A1458/A1459/A1460" , "IPAD 2 A1395/A1396/A1397" , "IPAD 3 A1403/A1416/A1430" , "OUTROS IPAD"};
    ArrayAdapter<String> adapterApple;

    private String[] modeloAsus = {"K0W" , "OUTROS" , "K004" , "FONEPAD 7 CHIP DUAL" , "ME371MG" , "K00E" , "ME372 FONE PAD7" , "K012/SONICMASTER"};
    ArrayAdapter<String> adapterAsus;

    private String[] modeloCCE = {"OUTROS CCE TABLET" , "T735" , "TR71" , "T733" , "TR91" , "TR101" , "TRS1" , "T935" , "TR72" , "TR92"};
    ArrayAdapter<String> adapterCCE;

    private String[] modeloDell = {"OUTROS" , "T02D" , "T01C"};
    ArrayAdapter<String> adapterDell;

    private String[] modeloDL = {"L.521" , "TX- 330" , "L323" , "L439" , "L315" , "L308" , "713RD" , "T73" , "M73" , "T71" , "OUTROS TAB." , "TP253PRE" , "L403" , "L352" , "EV-HD" , "TP252BRA" , "PED-K71" , "E-DUK"};
    ArrayAdapter<String> adapterDL;

    private String[] modeloFoston = {"FS-M787D" , "M791AT" , "FS-M787P" , "FS-M797" , "FS-M787L" , "FS-M787S" , "OUTROS TABLET FOST" , "FS-M785" , "GT-7240" , "FS-M3G796GT"};
    ArrayAdapter<String> adapterFoston;

    private String[] modeloGenesis = {"GT-7240" , "GT-7240" , "7250" , "GT-7305" , "GT-7303" , "8320" , "7240" , "8220S" , "7340" , "7310" , "7204" , "7220S2" , "7325" , "7200" , "OUTROS GENESIS" , "7245" , "GT-7204" , "GT-7326" , "GT-7325" , "GT-1230" , "GT-7301" , "SKMTEK" , "7301W" , "GT1213" , "7306"};
    ArrayAdapter<String> adapterGenesis;

    private String[] modeloHP = {"SLATE 7" , "1201" , "HP 1201 7.1"};
    ArrayAdapter<String> adapterHP;

    private String[] modeloBAK = {"789MI" , "7250" , "7200 CAP TABLET" , "OUTROS I-BAK" , "7200" , "7400"};
    ArrayAdapter<String> adapterBAK;

    private String[] modeloLENOXX = {"TB-5100" , "TB-100" , "TB9000" , "TB-7000" , "TB-8100" , "TB-50" , "TB-3000" , "TB-52" , "TB-55" , "OUTROS"};
    ArrayAdapter<String> adapterLENOXX;

    private String[] modeloLG = {"OUTROS" , "LG-V400"};
    ArrayAdapter<String> adapterLG;

    private String[] modeloMicroboard = {"LITTLEBOOK M7" , "UTIMATE U342" , "INVICTUS"};
    ArrayAdapter<String> adapterMicroboard;

    private String[] modeloMultilaser = {"M9" , "M-PRO" , "M8" , "M7" , "OUTROS TABLET MULT" , "M7S" , "DIAMOND LITE" , "M10"};
    ArrayAdapter<String> adapterMultilaser;

    private String[] modeloNavcity = {"NT-1715" , "NT-2755" , "N-1720" , "OUTROS" , "NT-1710" , "NT-1711"};
    ArrayAdapter<String> adapterNavcity;

    private String[] modeloPhilco = {"OUTROS" , "7A-B111A4.0" , "PH71TV" , "PH7H" , "7-A" , "OUTROS"};
    ArrayAdapter<String> adapterPhilco;

    private String[] modeloPositivo = {"OUTROS" , "YPY" , "T710" , "EVO7" , "T705" , "POSITIVO MINI QUAD" , "ZX 3060"};
    ArrayAdapter<String> adapterPositivo;

    private String[] modeloQBEX = {"BIOSTAR" , "TX126" , "TX190" , "TX320I" , "TX120" , "OUTROS" , "TX300" , "TX340I" , "TXM785I"};
    ArrayAdapter<String> adapterQBEX;

    private String[] modeloSemp = {"0760W" , "TA 0708G" , "0705G"};
    ArrayAdapter<String> adapterSemp;

    ArrayList<String> defeitos = new ArrayList<>();

    AutoCompleteTextView marca, modelo;
    String MaNova = "", MaAntigo = "", branch;


    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            controleDaPressao();
                        }
                    });
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_um);

        marca = findViewById(R.id.tabletUm_Marca);

        adapterMarcas = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , marcas);
        marca.setThreshold(1);
        marca.setAdapter(adapterMarcas);

        t.start();

    }


    public void controleDaPressao() {
        marca = findViewById(R.id.tabletUm_Marca);
        //----------------------.*
        MaNova = marca.getText().toString();
        if (MaNova.equals(MaAntigo)) {

        } else {
            branchSelected(MaNova);
            MaAntigo = MaNova;
        }

    }


    public void branchSelected(String branch) {

        marca = findViewById(R.id.tabletUm_Marca);
        modelo = findViewById(R.id.tabletUm_Modelo);
        //---------------------------------.*
        //branch = marca.getText().toString();
        branch = branch.toLowerCase();
        //-----------------------------------.*

        if (branch.equals("samsung")) {
            modelo = findViewById(R.id.tabletUm_Modelo);
            modelo.setHint("");
            adapterSamsung = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloSamsung);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterSamsung);

        } else if (branch.equals("apple")) {
            modelo.setHint("");
            adapterApple = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloApple);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterApple);

        } else if (branch.equals("acer")) {
            modelo.setHint("");
            adapterAcer = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloAcer);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterAcer);

        } else if (branch.equals("lg")) {
            modelo.setHint("");
            adapterLG = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloLG);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterLG);

        } else if (branch.equals("asus")) {
            modelo.setHint("");
            adapterAsus = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloAsus);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterAsus);

        } else if (branch.equals("oac")) {
            modelo.setHint("");
            adapterOAC = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloOAC);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterOAC);

        } else if (branch.equals("cce")) {
            modelo.setHint("");
            adapterCCE = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloCCE);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterCCE);

        } else if (branch.equals("dell")) {
            modelo.setHint("");
            adapterDell = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloDell);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterDell);

        } else if (branch.equals("dl")) {
            modelo.setHint("");
            adapterDL = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloDL);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterDL);

        } else if (branch.equals("foston")) {
            modelo.setHint("");
            adapterFoston = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloFoston);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterFoston);

        } else if (branch.equals("genesis")) {
            modelo.setHint(";");
            adapterGenesis = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloGenesis);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterGenesis);

        } else if (branch.equals("hp")) {
            modelo.setHint(" ");
            adapterHP = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloHP);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterHP);

        } else if (branch.equals("bak")) {
            modelo.setHint("");
            adapterBAK = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloBAK);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterBAK);

        } else if (branch.equals("lenoxx")) {
            modelo.setHint(" ");
            adapterLENOXX = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloLENOXX);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterLENOXX);

        } else if (branch.equals("microboard")) {
            modelo.setHint(" ");
            adapterMicroboard = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloMicroboard);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterMicroboard);

        } else if (branch.equals("multilaser")) {
            modelo.setHint("");
            adapterMultilaser = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloMultilaser);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterMultilaser);

        } else if (branch.equals("navicity")) {
            modelo.setHint("");
            adapterNavcity = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloNavcity);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterNavcity);

        } else if (branch.equals("philco")) {
            modelo.setHint("");
            adapterPhilco = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloPhilco);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterPhilco);

        } else if (branch.equals("positivo")) {
            modelo.setHint("");
            adapterPositivo = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloPositivo);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterPositivo);

        } else if (branch.equals("qbex")) {
            modelo.setHint("");
            adapterQBEX = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloQBEX);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterQBEX);

        } else if (branch.equals("semptoshiba")) {
            modelo.setHint("");
            adapterSemp = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , modeloSemp);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterSemp);

        } else {
            modelo.setText("");
            modelo.setHint("");
        }

    }


    public void tablet_onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();


        switch (view.getId()) {
            case R.id.tabletUm_TelaDisplay: // tela display.*
                td = findViewById(R.id.tabletUm_TelaDisplay);
                if (checked) {
                    td.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    td.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.tela_display));
                } else {
                    td.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    td.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.tela_display));

                }
                break;

            case R.id.tabletUm_TelaTouch: // tela Touch.*
                tt = findViewById(R.id.tabletUm_TelaTouch);
                if (checked) {
                    tt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    tt.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.tela_touch));


                } else {
                    tt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    tt.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.tela_touch));


                }
                break;

            case R.id.tabletUm_Bluetooth: // Bluetooth.*
                bt = findViewById(R.id.tabletUm_Bluetooth);
                if (checked) {
                    bt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    bt.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.bluetooth));


                } else {
                    bt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    bt.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.bluetooth));


                }
                break;

            case R.id.tabletUm_WiFi: // Wi-Fi.*
                wf = findViewById(R.id.tabletUm_WiFi);
                if (checked) {
                    wf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    wf.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.wi_fi));


                } else {
                    wf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    wf.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.wi_fi));

                }
                break;

            case R.id.tabletUm_Botoes_MaMe: // Botões de volume.*
                btn = findViewById(R.id.tabletUm_Botoes_MaMe);
                if (checked) {
                    btn.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    btn.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.botoes_volume));

                } else {
                    btn.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    btn.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.botoes_volume));

                }
                break;

            case R.id.tabletUm_Botao_Power: // Botão POWER.*
                btnp = findViewById(R.id.tabletUm_Botao_Power);
                if (checked) {
                    btnp.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    btnp.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.botao_power));

                } else {
                    btnp.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    btnp.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.botao_power));

                }
                break;

            case R.id.tabletUm_Carcaca: // Carcaça do aparelho.*
                car = findViewById(R.id.tabletUm_Carcaca);
                if (checked) {
                    car.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    car.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.carca_a));

                } else {
                    car.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    car.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.carca_a));

                }
                break;

            case R.id.tabletUm_AutoFalante: // Auto falante.*
                autof = findViewById(R.id.tabletUm_AutoFalante);
                if (checked) {
                    autof.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    autof.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.auto_falante));

                } else {
                    autof.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    autof.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.auto_falante));

                }
                break;

            case R.id.tabletUm_AutoFalanteAuricular: // Auto falante auricular.*
                autofa = findViewById(R.id.tabletUm_AutoFalanteAuricular);
                if (checked) {
                    autofa.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    autofa.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.auto_falante_auricular));


                } else {
                    autofa.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    autofa.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.auto_falante_auricular));

                }
                break;

            case R.id.tabletUm_Microfone: // microfone.*
                mic = findViewById(R.id.tabletUm_Microfone);
                if (checked) {
                    mic.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    mic.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.microfone));

                } else {
                    mic.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    mic.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.microfone));

                }
                break;

            case R.id.tabletUm_CameraFrontal: // câmera Frontal.*
                camf = findViewById(R.id.tabletUm_CameraFrontal);
                if (checked) {
                    camf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    camf.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.c_mera_frontal));

                } else {
                    camf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    camf.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.c_mera_frontal));

                }
                break;

            case R.id.tabletUm_CameraTraseira: // câmera traseira.*
                camt = findViewById(R.id.tabletUm_CameraTraseira);
                if (checked) {
                    camt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    camt.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.c_mera_traseira));

                } else {
                    camt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    camt.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.c_mera_traseira));

                }
                break;

            case R.id.tabletUm_ConectorCarga: // Conector de carga.*
                conc = findViewById(R.id.tabletUm_ConectorCarga);
                if (checked) {
                    conc.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    conc.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.conector_de_carga));

                } else {
                    conc.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    conc.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.conector_de_carga));

                }
                break;

            case R.id.tabletUm_Bateria: // Bateria.*
                bat = findViewById(R.id.tabletUm_Bateria);
                if (checked) {
                    bat.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    bat.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.bateria));

                } else {
                    bat.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    bat.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.bateria));

                }
                break;

            case R.id.tabletUm_TampaTraseira: // Traseira.*
                bCover = findViewById(R.id.tabletUm_TampaTraseira);
                if (checked) {
                    bCover.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    bCover.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.tampa_traseira));

                } else {
                    bCover.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    bCover.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.tampa_traseira));

                }
                break;

            case R.id.tabletUm_Outros: // Outros.*
                out = findViewById(R.id.tabletUm_Outros);
                if (checked) {
                    out.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.blue_holder_full)));
                    out.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.outrosOp));

                } else {
                    out.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.blue_holder)));
                    out.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.outrosOp));

                }
                break;
            default:

                break;
        }

    }


    public void tablet_voltar(View view) {
        finish();
    }

    public void tablet_proximo(View view) {
        Intent intent = new Intent(this , TabletDois.class);
        modelo = (AutoCompleteTextView) findViewById(R.id.tabletUm_Modelo);


        //-----------------------------------------------.*

        intent.putExtra("TABLETUM_MODELO" , modelo.getText().toString());
        intent.putExtra("TABLETUM_MARCA" , MaNova);

        intent.putStringArrayListExtra("TABLETUM_DEFEITOS" , defeitos);

        //------------------------------------------------.*


        startActivity(intent);

    }
}