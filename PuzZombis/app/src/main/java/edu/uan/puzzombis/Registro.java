package edu.uan.puzzombis;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Registro extends AppCompatActivity {
    //Declar las variables
    EditText correoEt,passEt,nombreEt;
    TextView fechaTxt;
    Button Registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        // conexion con la vista

        correoEt = findViewById(R.id.correoEt);
        passEt = findViewById(R.id.passEt);
        nombreEt = findViewById(R.id.nombreEt);
        fechaTxt = findViewById(R.id.fechaTxt);
        Registrar = findViewById(R.id.Registrar);

        Date date = new Date();
        SimpleDateFormat facha = new SimpleDateFormat("d 'de' MMM 'del' yyyy");
        String StringFecha = facha.format(date);
        fechaTxt.setText(StringFecha);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = correoEt.getText().toString();
                String passwoerd = passEt.getText().toString();
                //validacion correo
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    correoEt.setError("correo valido");
                    correoEt.setFocusable(true);
                    //validacion contraseña
                }else if(passwoerd.length()<6){
                    passEt.setFocusable(true);
                }else{
                    RegistrarJugador(email,passwoerd);
                }
            }
        });
    }

    private void RegistrarJugador(String email, String passwoerd) {

    }
}