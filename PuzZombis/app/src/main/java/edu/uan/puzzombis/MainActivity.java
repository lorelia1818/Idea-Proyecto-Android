package edu.uan.puzzombis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BTNLOGIN,BTNREGISTRO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTNLOGIN = findViewById(R.id.BTNLOGIN);
        BTNREGISTRO = findViewById(R.id.BTNREGISTRO);

        BTNLOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /*mensaje*/
                Toast.makeText(MainActivity.this, "HAS HECHO CLICK EN EL BOTON LOGIN", Toast.LENGTH_SHORT).show();
            }
        });

        BTNREGISTRO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Registro.class);
                startActivity(intent);
            }
        });


    }
}