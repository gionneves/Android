package app.guerreirosgames.servicos.computador.montar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class MontarComputadorUm extends AppCompatActivity {

    private String branchCPU, cpuPick, moboPick, ram, gpu, tower, fan, psu;
    private String[] cpu, mobo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_montar_computador_um);
    }

    private void branchCPU_modelMobo() {
        if (branchCPU.equals("intel")) {

            cpu = new String[]{
                    /** Linha Intel Core.* */
                    "core i3 2100" , // 0 1155 - h61/b75 .*
                    "core i3 2130" , // 1 1155 - h61/b75 .*
                    "core i3 3220" , // 2 1155 - h61/b75 .*
                    "core i3 3240" , // 3 1155 - h61/b75 .*
                    "core i3 3250" , // 4 1155 - h61/b75 .*
                    "core i3 8100" , // 5 1151 - h300 .*
                    "core i3 8100F" , // 6 1151 - h300 .*
                    "core i3 9100F" , // 7 1151 - h300 .*

                    "core i5 2400" , // 8 1155 - h61/b75 .*
                    "core i5 2400" , // 9 1155 - h61/b75 .*
                    "core i5 2500" , // 10 1155 - h61/b75 .*
                    "core i5 2500K" , // 11 1155 - z77 .*
                    "core i5 2550K" , // 12 1155 - z77 .*
                    "core i5 2600" , // 13 1155 - h61/b75 .*
                    "core i5 2600K" , // 14 1155 - z77 .*
                    "core i5 3450" , // 15 1155 - h61/b75 .*
                    "core i5 3550" , // 16 1155 - h61/b75 .*
                    "core i5 3570" , // 17 1155 - h61/b75 .*
                    "core i5 3570K" , // 18 1155 - z77 .*
                    "core i5 8400" , // 19 1151 - h300 .*
                    "core i5 8500" , // 20 1151 - h300 .*
                    "core i5 8600" , // 21 1151 - h300 .*
                    "core i5 8600K" , // 22 1151 - z300 .*
                    "core i5 9400" , // 23 1151 - h300.*
                    "core i5 9400F" , // 24 1151 - h300 .*
                    "core i5 9500" , // 25 1151 - h300 .*
                    "core i5 9600K" , // 26 1151 - z300 .*
                    "core i5 9600KF" , // 27 1151 - z300 .*

                    "core i7 2600" , // 28 1155 - h61/b75 .*
                    "core i7 2600k" , // 29 1155 - z77 .*
                    "core i7 2700k" , // 30 1155 - z77 .*
                    "core i7 3770" , // 31 1155 - z77 .*
                    "core i7 3770k" , // 32 1155 - z77 .*
                    "core i7 8700" , // 33 1151 - z300 .*
                    "core i7 8700K" , // 34 1151 - z300 .*
                    "core i7 9700" , // 35 1151 - z300 .*
                    "core i7 9700K" , // 36 1151 - z300 .*
                    "core i7 9800K" , // 37 1151 - z300 .*

                    /** Linha Intel Xeon.* */
                    "xeon e5 1620" , // 38 2011 - X79 .*
                    "xeon e5 1620 v2" , // 39 2011 - X79 .*
                    "xeon e5 1620 v3" , // 40 2011v3 - X99 .*
                    "xeon e5 1640" , // 41 2011 - X79 .*
                    "xeon e5 1640 v2" , // 42 2011 - X79 .*
                    "xeon e5 1650" , // 43 2011 - X79 .*
                    "xeon e5 1650 v2" , // 44 2011 - X79 .*

                    "xeon e5 2620" , // 45 2011 - X79 .*
                    "xeon e5 2620 v2" , // 46 2011 - X79 .*
                    "xeon e5 2620 v3" ,  // 47 2011v3 - X99 .*
                    "xeon e5 2630" , // 48 2011 - X79 .*
                    "xeon e5 2630 v2" , // 49 2011 - X79 .*
                    "xeon e5 2630 v3" , // 50 2011v3 - X99 .*
                    "xeon e5 2640" , // 51 2011 - X79 .*
                    "xeon e5 2640 v2" , // 52 2011 - X79 .*
                    "xeon e5 2640 v3" , // 53 2011v3 - X99 .*
                    "xeon e5 2650" , // 54 2011 - X79 .*
                    "xeon e5 2650 v2" // 55 2011 - X79 .*


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

    private void modelMobo_pick() {

        /** H61 - B75.* */
        if ((cpuPick.equals(cpu[0])) || (cpuPick.equals(cpu[1])) || (cpuPick.equals(cpu[2])) ||
                (cpuPick.equals(cpu[3])) || (cpuPick.equals(cpu[4])) || (cpuPick.equals(cpu[8])) ||
                        (cpuPick.equals(cpu[9])) || (cpuPick.equals(cpu[10])) || (cpuPick.equals(cpu[13])) ||
                                (cpuPick.equals(cpu[15])) || (cpuPick.equals(cpu[16])) || (cpuPick.equals(cpu[17])) ||
                                        (cpuPick.equals(cpu[28]))) {
            mobo = new String[]{

                    "Asus B75M-PLUS" ,
                    "Asus H61M-E" ,
                    "Asus H61M-K" ,
                    "Asus P8H61-M lx3" ,

                    "Atermiter B75 E3" ,

                    "Biostar hi-fi H77S",

                    "Gigabyte GA-B75M-D3V" ,
                    "Gigabyte GA-H61M-DS2" ,

                    "HUANANZHI B75" ,

                    "Kllisre B75" ,

                    "Msi B75MA-P45"

            };

            /** Z77.* */
        } else if ((cpuPick.equals(cpu[11])) || (cpuPick.equals(cpu[12])) || (cpuPick.equals(cpu[14])) ||
                (cpuPick.equals(cpu[18])) || (cpuPick.equals(cpu[29])) || (cpuPick.equals(cpu[30])) ||
                        (cpuPick.equals(cpu[31])) || (cpuPick.equals(cpu[32]))) {
            mobo = new String[]{
                    "Asus P8-Z77-V lx2" ,
                    "Asus P8Z77-M" ,
                    "Asus P8Z77-V le" ,

                    "Biostar TZ75B" ,

                    "Asus P8Z77-V pro" ,
                    "Gigabyte GA-Z77P-D3" ,
                    "Gigabyte GA-Z77X-UD3H" ,

                    "MSI Z77A-G41" ,
                    "MSI Z77A-GD65"

            };

            /** H300.* */
        } else if ((cpuPick.equals(cpu[5])) || (cpuPick.equals(cpu[6])) || (cpuPick.equals(cpu[7])) ||
                (cpuPick.equals(cpu[19])) || (cpuPick.equals(cpu[20])) || (cpuPick.equals(cpu[21])) ||
                        (cpuPick.equals(cpu[23])) || (cpuPick.equals(cpu[24])) || (cpuPick.equals(cpu[25])))
        {
            mobo = new String[]{

            };

            /** Z300.* */
        } else if ((cpuPick.equals(cpu[22])) || (cpuPick.equals(cpu[26])) || (cpuPick.equals(cpu[27])) ||
                (cpuPick.equals(cpu[33])) || (cpuPick.equals(cpu[34])) || (cpuPick.equals(cpu[35])) ||
                        (cpuPick.equals(cpu[36])) || (cpuPick.equals(cpu[37]))) {
            mobo = new String[]{

            };

        /** X79.* */
        } else if ((cpuPick).equals(cpu[38]) || (cpuPick).equals(cpu[39]) || (cpuPick).equals(cpu[41]) ||
                (cpuPick).equals(cpu[42]) || (cpuPick).equals(cpu[43]) || (cpuPick).equals(cpu[44]) ||
                (cpuPick).equals(cpu[45]) || (cpuPick).equals(cpu[46]) || (cpuPick).equals(cpu[48]) ||
        (cpuPick).equals(cpu[49]) || (cpuPick).equals(cpu[51]) || (cpuPick).equals(cpu[52]) ||
        (cpuPick).equals(cpu[54]) || (cpuPick).equals(cpu[55])) {
            mobo = new String[] {

            };

        /** X99.* */
        } else if ((cpuPick.equals(cpu[40])) || (cpuPick.equals(cpu[47])) || (cpuPick.equals(cpu[50])) ||
        (cpuPick.equals(cpu[53]))){
            mobo = new String[] {

            };

        }

    }
}