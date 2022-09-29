package edu.uan.puzzombis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int DURACION_SPLASH =1000;
        /*HANDLER, EJECUTAR LINEAS DE CODIGO EN UN TIEMPO DETERMINADO*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*CODIGO QUE SE EJECUTA*/
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                /*CODIGO QUE SE EJECUTA*/
            }
        },DURACION_SPLASH);
    }
}