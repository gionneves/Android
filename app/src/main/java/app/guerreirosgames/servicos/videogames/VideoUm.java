package app.guerreirosgames.servicos.videogames;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import app.guerreirosgames.R;

public class VideoUm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_um);
    }

    public void videoUm_btnVoltar(View view) {
        finish();
    }

    public void videoUm_btnProximo(View view) {

    }
}