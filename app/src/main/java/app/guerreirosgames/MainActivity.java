package app.guerreirosgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTelaCadastro(View view) {
        System.out.println("FOI CADASTRO");
        startActivity(new Intent(this, TelaCadastro.class));
    }

    public void goTelaMain(View view) {
        //startActivity(new Intent(this, TelaMain.class));
    }


    public void esqueciSenha(View view) {
    }
}