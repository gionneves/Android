package app.guerreirosgames.servicos.videogames;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class VideoTres extends AppCompatActivity {

    private String modelo, marca, adicional, defeito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tres);

        Intent intent = getIntent();
        marca = intent.getStringExtra("VIDEODOIS_MARCA");
        modelo = intent.getStringExtra("VIDEODOIS_MODELO");
        adicional = intent.getStringExtra("VIDEODOIS_ADICIONAL");

    }
}