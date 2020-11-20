package app.guerreirosgames.servicos.computador.montar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class MontarComputadorUm extends AppCompatActivity {

    private String branchCPU, ram, gpu, tower, fan, psu;
    private String[] cpu, mobo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_montar_computador_um);
    }

    private void branchCPU_modelMobo() {
        if (branchCPU.equals("intel")) {

            cpu = new String[]{
                    /** linha Core gen 2.* */
                    "core i3 2100" , // 0 1155 - h61/b75
                    "core i3 2130" , // 1 1155 - h61/b75
                    "core i3 3220" , // 2 1155 - h61/b75
                    "core i3 3240" , // 3 1155 - h61/b75
                    "core i3 3250" , // 4 1155 - h61/b75
                    "core i3 8100" , // 5 1151 - h300/z300
                    "core i3 8100F" , // 6 1151 - h300/z300
                    "core i3 9100F" , // 7 1151 - h300/z300

                    "core i5 2400" , // 8 1155 - h61/b75
                    "core i5 2400" , // 9 1155 - h61/b75
                    "core i5 2500" , // 11 1155 - h61/b75
                    "core i5 2500K" , // 12 1155 - z77
                    "core i5 2550K" , // 13 1155 - z77
                    "core i5 2600" , // 14 1155 - h61/b75
                    "core i5 2600K" , // 15 1155 - z77
                    "core i5 3450" , // 16 1155 - h61/b75
                    "core i5 3550" , // 17 1155 - h61/b75
                    "core i5 3570" , // 18 1155 - h61/b75
                    "core i5 3570K" , // 19 1155 - z77
                    "core i5 8400" , // 20 1151 - h300/z300
                    "core i5 8500" , // 21 1151 - h300/z300
                    "core i5 8600" , // 22 1151 - h300/z300
                    "core i5 8600K" , // 23 1151 - h300/z300
                    "core i5 9400F" , // 24 1151 - h300/z300
                    "core i5 9400F" , // 25 1151 - h300/z300
                    "core i5 9500" , // 26 1151 - h300/z300
                    "core i5 9600K" , // 27 1151 - h300/z300
                    "core i5 9600KF" , // 28 1151 - h300/z300

                    "core i7 2600" , // 29 1155 - h61/b75
                    "core i7 2600k" , // 30 1155 - z77
                    "core i7 2700k" , // 31 1155 - z77
                    "core i7 3770" , // 32 1155 - z77
                    "core i7 3770k" , // 33 1155 - z77
                    "core i7 8700" , // 34 1151 - h300/z300
                    "core i7 8700K" , // 35 1151 - h300/z300
                    "core i7 9700" , // 36 1151 - h300/z300
                    "core i7 9700K" , // 37 1151 - h300/z300
                    "core i7 9800K" , // 38 1151 - h300/z300

                    "xeon e5 1620" ,
                    "xeon e5 1620 v2" ,
                    "xeon e5 1650" ,
                    "xeon e5 1650 v2" ,
                    "xeon e5 2620" ,
                    "xeon e5 2620 v2" ,
                    "xeon e5 2650" ,
                    "xeon e5 2650 v2"


            };

        } else if (branchCPU.equals("amd")) {

            cpu = new String[]{
                    /**
                     * AM4.*
                    */

                    "Athlon 200GE" , // 0
                    "Athlon 220GE" , // 1
                    "Athlon 240GE" , // 2
                    "Athlon 3000GE" , // 3

                    "Ryzen 3 1200" , // 4
                    "Ryzen 3 1300X" , // 5
                    "Ryzen 3 2200GE" , // 6
                    "Ryzen 3 2300X" , // 7
                    "Ryzen 3 3200G" , // 8

                    "Ryzen 5 1400" , // 9
                    "Ryzen 5 1500X" , // 10
                    "Ryzen 5 1600 AE" , // 11
                    "Ryzen 5 1600 AF" , // 12
                    "Ryzen 5 1600X" , // 13
                    "Ryzen 5 2400G" , // 14
                    "Ryzen 5 2500X" , // 15
                    "Ryzen 5 2600" , // 16
                    "Ryzen 5 2600X" , // 17
                    "Ryzen 5 3400G" , // 18
                    "Ryzen 5 3500X" , // 19
                    "Ryzen 5 3600" , // 20
                    "Ryzen 5 3600X" , // 21

                    "Ryzen 7 1700" , // 22
                    "Ryzen 7 1700X" , // 23
                    "Ryzen 7 1800X" , // 24
                    "Ryzen 7 2700" , // 25
                    "Ryzen 7 2700X" , // 26
                    "Ryzen 7 3700X" , // 27
                    "Ryzen 7 3800X" , // 28

                    "Ryzen 9 3900" , // 29
                    "Ryzen 9 3900X" , // 30
                    "Ryzen 9 3950X" // 31
            };

        } else {

        }
    }
}