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
                    "core i3",
                    "core i5",
                    "core i7",
                    "core i9",
                    "xeon e5 1620",
                    "xeon e5 1650",
                    "xeon e5 2620",
                    "xeon e5 2650",
                    "xeon e5 1620 v2",
                    "xeon e5 1650 v2",
                    "xeon e5 2620 v2",
                    "xeon e5 2650 v2"
            };

        } else if (branchCPU.equals("amd")) {

            cpu = new String[]{
                    /** gen 1.* */
                    "Ryzen 3 1200",
                    "Ryzen 3 1300X",
                    "Ryzen 5 1400",
                    "Ryzen 5 1500X",
                    "Ryzen 5 1600 AE",
                    "Ryzen 5 1600X AE",
                    "Ryzen 5 1600 AF",
                    "Ryzen 7 1700",
                    "Ryzen 7 1700X",
                    "Ryzen 7 1800X",

                    /** gen 2.* */
                    "Ryzen 3 2200GE",
                    "Ryzen 3 2300X",
                    "Ryzen 5 2400G",
                    "Ryzen 5 2500X",
                    "Ryzen 5 2600",
                    "Ryzen 5 2600E",
                    "Ryzen 5 2600X",
                    "Ryzen 7 2700",
                    "Ryzen 7 2700E",
                    "Ryzen 7 2700X",

                    /** gen 3.* */

                    "Ryzen 3 2200G",
                    "Ryzen 5 2400G",
                    "Ryzen 5 2600",
                    "Ryzen 5 2600E",
                    "Ryzen 5 2600X",
                    "Ryzen 7 2700",
                    "Ryzen 7 2700E",
                    "Ryzen 7 2700X",
            };

        } else {

        }
    }
}